package typings.layuiLayer.layer

import typings.jquery.JQuery
import typings.layuiLayer.layuiLayerBooleans.`false`
import typings.layuiLayer.layuiLayerNumbers.`-1`
import typings.layuiLayer.layuiLayerNumbers.`0`
import typings.layuiLayer.layuiLayerNumbers.`1`
import typings.layuiLayer.layuiLayerNumbers.`2`
import typings.layuiLayer.layuiLayerNumbers.`3`
import typings.layuiLayer.layuiLayerNumbers.`4`
import typings.layuiLayer.layuiLayerNumbers.`5`
import typings.layuiLayer.layuiLayerNumbers.`6`
import typings.layuiLayer.layuiLayerStrings.c
import typings.layuiLayer.layuiLayerStrings.l
import typings.layuiLayer.layuiLayerStrings.r
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 基础参数
  */
trait Options extends js.Object {
  /**
    * 弹出动画
    * @default 0
    * @since 3.0
    * @example
    * -1    //关闭动画
    * 0    //平滑放大。默认
    * 1    //从上掉落
    * 2    //从最底部往上滑入
    * 3    //从左滑入
    * 4    //从左翻滚
    * 5    //渐显
    * 6    //抖动
    */
  var anim: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  /**
    * 宽高
    * @default 'auto'
    * @example
    * '500px'    //定义宽度，高度自适应
    * ['500px', '300px']    //定义宽高
    */
  var area: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  /**
    * 按钮
    * @default '确认'
    * @description 信息框模式时，btn默认是一个确认按钮，其它层类型则默认不显示，加载层和tips层则无效。
    */
  var btn: js.UndefOr[String | js.Array[String]] = js.undefined
  //#region 按钮1的回调是yes，而从按钮2开始，则回调为btn2: function(){}，以此类推。
  var btn2: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  var btn3: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  var btn4: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  var btn5: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  var btn6: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  var btn7: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  var btn8: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  var btn9: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  /**
    * 按钮排列
    * @default 'r'
    * @example
    * 'l'    //按钮左对齐
    * 'c'    //按钮居中对齐
    * 'r'    //按钮右对齐。默认值，不用设置
    */
  var btnAlign: js.UndefOr[l | c | r] = js.undefined
  //#endregion
  /**
    * 右上角关闭按钮触发的回调
    * @param index 当前层索引
    * @param layero 当前层的DOM对象
    * @description 默认会自动触发关闭。如果不想关闭，`return false`
    */
  var cancel: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.undefined
  /**
    * 关闭按钮
    * @description layer提供了两种风格的关闭按钮，可通过配置1和2来展示，如果不显示，则closeBtn: 0
    * @default 1
    */
  var closeBtn: js.UndefOr[`0` | `1` | `2`] = js.undefined
  /**
    * 内容
    * @default ''
    */
  var content: js.UndefOr[String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String])] = js.undefined
  /**
    * 层销毁后触发的回调
    * @description 无论是确认还是取消，只要层被销毁了，end都会执行，不携带任何参数。
    */
  var end: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * @deprecated v3.0
    * @see {@link #fixed}
    */
  var fix: js.UndefOr[Boolean] = js.undefined
  /**
    * 固定
    * @default true
    * @description 鼠标滚动时，层是否固定在可视区域。
    */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /**
    * 最大化后触发的回调
    * @param layero 当前层DOM
    */
  var full: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.undefined
  /**
    * 图标
    * 信息框和加载层的私有参数
    * @description 信息框默认不显示图标。当你想显示图标时，默认皮肤可以传入0-6如果是加载层，可以传入0-2。
    */
  var icon: js.UndefOr[Double] = js.undefined
  /**
    * 用于控制弹层唯一标识
    * @description 设置该值后，不管是什么类型的层，都只允许同时弹出一个。一般用于页面层和iframe层模式
    * @default ''
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * 关闭动画
    * @default true
    * @since 3.0.3
    */
  var isOutAnim: js.UndefOr[Boolean] = js.undefined
  /**
    * 最大高度
    * @since 3.1.0
    * @description 只有当高度自适应时，maxHeight的设定才有效。
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * 最大宽度
    * @default 360
    * @description 只有当`area: 'auto'`时，maxWidth的设定才有效。
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * 最大最小化
    * @default false
    * @description 显示最大小化按钮。该参数值对type:1和type:2有效。
    */
  var maxmin: js.UndefOr[Boolean] = js.undefined
  /**
    * 最小化后触发的回调
    * @param layero 当前层DOM
    * @description `return false` 不执行默认最小化。
    */
  var min: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], `false` | Unit]] = js.undefined
  /**
    * 触发拖动的元素
    * @default '.layui-layer-title'
    */
  var move: js.UndefOr[Selector | `false` | JQuery[HTMLElement]] = js.undefined
  /**
    * 拖动完毕后的回调方法
    * @param this 合并的选项
    * @param layero 当前层的DOM对象
    */
  var moveEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* layero */ JQuery[HTMLElement], Unit]] = js.undefined
  /**
    * 是否允许拖拽到窗口外
    * @default false
    */
  var moveOut: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated v3.0
    * @description 只提供默认的一种拖拽风格
    */
  var moveType: js.UndefOr[Double] = js.undefined
  /**
    * 坐标
    * @default 'auto'
    * @example
    * 'auto'    //默认坐标，即垂直水平居中
    * '100px'    //只定义top坐标，水平保持居中
    * ['100px', '50px']    //同时定义top、left坐标
    * 't'    //快捷设置顶部坐标
    * 'r'    //快捷设置右边缘坐标
    * 'b'    //快捷设置底部坐标
    * 'l'    //快捷设置左边缘坐标
    * 'lt'    //快捷设置左上角
    * 'lb'    //快捷设置左下角
    * 'rt'    //快捷设置右上角
    * 'rb'    //快捷设置右下角
    */
  var offset: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  /**
    * 是否允许拉伸
    * @default true
    * @description 可以在弹层右下角拖动来拉伸尺寸。该参数对loading、tips层无效
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * 监听窗口拉伸动作
    * @param layero 当前层的DOM对象
    */
  var resizing: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.undefined
  /**
    * 还原后触发的回调
    * @param layero 当前层DOM
    */
  var restore: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.undefined
  /**
    * 是否允许浏览器出现滚动条
    * @default true
    */
  var scrollbar: js.UndefOr[Boolean] = js.undefined
  /**
    * 遮罩
    * @default 0.3
    * @example [0.8, '#393D49']    //透明度、颜色
    */
  var shade: js.UndefOr[Double | `false` | (js.Tuple2[Double, String])] = js.undefined
  /**
    * 是否点击遮罩关闭
    * @description 如果你的shade是存在的，那么你可以设定shadeClose来控制点击弹层外区域关闭。
    * @default false
    */
  var shadeClose: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated v3.0
    * @see {@link #anim}
    */
  var shift: js.UndefOr[Double] = js.undefined
  /**
    * 样式类名
    * @default ''
    */
  var skin: js.UndefOr[String] = js.undefined
  /**
    * 层弹出后的成功回调方法
    * @param layero 当前层DOM
    * @param index 当前层索引
    */
  var success: js.UndefOr[js.Function2[/* layero */ JQuery[HTMLElement], /* index */ Index, Unit]] = js.undefined
  /**
    * 自动关闭所需毫秒
    * @default 0 //不会自动关闭
    */
  var time: js.UndefOr[Double] = js.undefined
  /**
    * tips方向和颜色
    * @default 2
    * @description tips层的私有参数。
    * @example
    * 1    //上
    * 2    //右
    * 3    //下
    * 4    //左
    * [1, '#c00']  //方向，颜色
    */
  var tips: js.UndefOr[Double | (js.Tuple2[Double, String])] = js.undefined
  /**
    * 是否允许多个tips
    * @default false
    * @description 允许多个意味着不会销毁之前的tips层。
    */
  var tipsMore: js.UndefOr[Boolean] = js.undefined
  /**
    * 标题
    * @default '信息'
    * @example
    * '我是标题'
    * ['文本', 'font-size:18px;']
    * false    //不显示标题栏
    */
  var title: js.UndefOr[String | `false` | (js.Tuple2[String, String])] = js.undefined
  /**
    * 基本层类型
    * @default 0
    */
  var `type`: js.UndefOr[`3` | `2` | `4` | `0` | `1`] = js.undefined
  /**
    * 确定按钮回调方法
    * @param index 当前层索引
    * @param layero 当前层DOM对象
    * @description 如果设定了yes回调，需进行手工关闭，`close(index)`
    */
  var yes: js.UndefOr[js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], Unit]] = js.undefined
  /**
    * 层叠顺序
    * @default 19891014
    * @description 一般用于解决和其它组件的层叠冲突。
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    anim: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    area: String | (js.Tuple2[String, String]) = null,
    btn: String | js.Array[String] = null,
    btn2: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn3: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn4: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn5: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn6: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn7: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn8: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn9: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btnAlign: l | c | r = null,
    cancel: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    closeBtn: `0` | `1` | `2` = null,
    content: String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String]) = null,
    end: () => Unit = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    full: /* layero */ JQuery[HTMLElement] => Unit = null,
    icon: js.UndefOr[Double] = js.undefined,
    id: String = null,
    isOutAnim: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    maxmin: js.UndefOr[Boolean] = js.undefined,
    min: /* layero */ JQuery[HTMLElement] => `false` | Unit = null,
    move: Selector | `false` | JQuery[HTMLElement] = null,
    moveEnd: js.ThisFunction1[Options, /* layero */ JQuery[HTMLElement], Unit] = null,
    moveOut: js.UndefOr[Boolean] = js.undefined,
    moveType: js.UndefOr[Double] = js.undefined,
    offset: String | (js.Tuple2[String, String]) = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    resizing: /* layero */ JQuery[HTMLElement] => Unit = null,
    restore: /* layero */ JQuery[HTMLElement] => Unit = null,
    scrollbar: js.UndefOr[Boolean] = js.undefined,
    shade: Double | `false` | (js.Tuple2[Double, String]) = null,
    shadeClose: js.UndefOr[Boolean] = js.undefined,
    shift: js.UndefOr[Double] = js.undefined,
    skin: String = null,
    success: (/* layero */ JQuery[HTMLElement], /* index */ Index) => Unit = null,
    time: js.UndefOr[Double] = js.undefined,
    tips: Double | (js.Tuple2[Double, String]) = null,
    tipsMore: js.UndefOr[Boolean] = js.undefined,
    title: String | `false` | (js.Tuple2[String, String]) = null,
    `type`: `3` | `2` | `4` | `0` | `1` = null,
    yes: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => Unit = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (anim != null) __obj.updateDynamic("anim")(anim.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (btn != null) __obj.updateDynamic("btn")(btn.asInstanceOf[js.Any])
    if (btn2 != null) __obj.updateDynamic("btn2")(js.Any.fromFunction2(btn2))
    if (btn3 != null) __obj.updateDynamic("btn3")(js.Any.fromFunction2(btn3))
    if (btn4 != null) __obj.updateDynamic("btn4")(js.Any.fromFunction2(btn4))
    if (btn5 != null) __obj.updateDynamic("btn5")(js.Any.fromFunction2(btn5))
    if (btn6 != null) __obj.updateDynamic("btn6")(js.Any.fromFunction2(btn6))
    if (btn7 != null) __obj.updateDynamic("btn7")(js.Any.fromFunction2(btn7))
    if (btn8 != null) __obj.updateDynamic("btn8")(js.Any.fromFunction2(btn8))
    if (btn9 != null) __obj.updateDynamic("btn9")(js.Any.fromFunction2(btn9))
    if (btnAlign != null) __obj.updateDynamic("btnAlign")(btnAlign.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction2(cancel))
    if (closeBtn != null) __obj.updateDynamic("closeBtn")(closeBtn.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction0(end))
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.get.asInstanceOf[js.Any])
    if (full != null) __obj.updateDynamic("full")(js.Any.fromFunction1(full))
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutAnim)) __obj.updateDynamic("isOutAnim")(isOutAnim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxmin)) __obj.updateDynamic("maxmin")(maxmin.get.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction1(min))
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (moveEnd != null) __obj.updateDynamic("moveEnd")(moveEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOut)) __obj.updateDynamic("moveOut")(moveOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moveType)) __obj.updateDynamic("moveType")(moveType.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    if (resizing != null) __obj.updateDynamic("resizing")(js.Any.fromFunction1(resizing))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction1(restore))
    if (!js.isUndefined(scrollbar)) __obj.updateDynamic("scrollbar")(scrollbar.get.asInstanceOf[js.Any])
    if (shade != null) __obj.updateDynamic("shade")(shade.asInstanceOf[js.Any])
    if (!js.isUndefined(shadeClose)) __obj.updateDynamic("shadeClose")(shadeClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shift)) __obj.updateDynamic("shift")(shift.get.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips.asInstanceOf[js.Any])
    if (!js.isUndefined(tipsMore)) __obj.updateDynamic("tipsMore")(tipsMore.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(js.Any.fromFunction2(yes))
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

