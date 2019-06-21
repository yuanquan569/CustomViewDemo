package com.yuan.customviewdemo.apple;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

import com.yuan.customviewdemo.R;

public class AppleTextView extends TextView {

    /**
     * 画笔1
     */
    private Paint paint1;
    /**
     * 画笔2
     */
    private Paint paint2;
    /**
     * 画布
     */
    private Canvas canvas;

    public AppleTextView(Context context) {
        super(context);
        initView();
    }
    public AppleTextView(Context context, @androidx.annotation.Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public AppleTextView(Context context, @androidx.annotation.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        paint1 =  new Paint();
        paint1.setColor(Color.RED);
        paint1.setStyle(Paint.Style.FILL);

        paint2 = new Paint();
        paint2.setColor(Color.GREEN);
        paint2.setStyle(Paint.Style.FILL);

        canvas = new Canvas();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(0,0,getMeasuredWidth(),getMeasuredHeight(),paint1);
        canvas.drawRect(10,10,getMeasuredWidth()-10,getMeasuredHeight()-10,paint2);

        canvas.save();
        canvas.translate(10,0);
        super.onDraw(canvas);
        canvas.restore();

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }
}
