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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 基础参数
  */
@js.native
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
  var anim: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  /**
    * 宽高
    * @default 'auto'
    * @example
    * '500px'    //定义宽度，高度自适应
    * ['500px', '300px']    //定义宽高
    */
  var area: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  
  /**
    * 按钮
    * @default '确认'
    * @description 信息框模式时，btn默认是一个确认按钮，其它层类型则默认不显示，加载层和tips层则无效。
    */
  var btn: js.UndefOr[String | js.Array[String]] = js.native
  
  //#region 按钮1的回调是yes，而从按钮2开始，则回调为btn2: function(){}，以此类推。
  var btn2: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  var btn3: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  var btn4: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  var btn5: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  var btn6: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  var btn7: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  var btn8: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  var btn9: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  /**
    * 按钮排列
    * @default 'r'
    * @example
    * 'l'    //按钮左对齐
    * 'c'    //按钮居中对齐
    * 'r'    //按钮右对齐。默认值，不用设置
    */
  var btnAlign: js.UndefOr[l | c | r] = js.native
  
  //#endregion
  /**
    * 右上角关闭按钮触发的回调
    * @param index 当前层索引
    * @param layero 当前层的DOM对象
    * @description 默认会自动触发关闭。如果不想关闭，`return false`
    */
  var cancel: js.UndefOr[
    js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
  ] = js.native
  
  /**
    * 关闭按钮
    * @description layer提供了两种风格的关闭按钮，可通过配置1和2来展示，如果不显示，则closeBtn: 0
    * @default 1
    */
  var closeBtn: js.UndefOr[`0` | `1` | `2`] = js.native
  
  /**
    * 内容
    * @default ''
    */
  var content: js.UndefOr[String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String])] = js.native
  
  /**
    * 层销毁后触发的回调
    * @description 无论是确认还是取消，只要层被销毁了，end都会执行，不携带任何参数。
    */
  var end: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * @deprecated v3.0
    * @see {@link #fixed}
    */
  var fix: js.UndefOr[Boolean] = js.native
  
  /**
    * 固定
    * @default true
    * @description 鼠标滚动时，层是否固定在可视区域。
    */
  var fixed: js.UndefOr[Boolean] = js.native
  
  /**
    * 最大化后触发的回调
    * @param layero 当前层DOM
    */
  var full: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.native
  
  /**
    * 图标
    * 信息框和加载层的私有参数
    * @description 信息框默认不显示图标。当你想显示图标时，默认皮肤可以传入0-6如果是加载层，可以传入0-2。
    */
  var icon: js.UndefOr[Double] = js.native
  
  /**
    * 用于控制弹层唯一标识
    * @description 设置该值后，不管是什么类型的层，都只允许同时弹出一个。一般用于页面层和iframe层模式
    * @default ''
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 关闭动画
    * @default true
    * @since 3.0.3
    */
  var isOutAnim: js.UndefOr[Boolean] = js.native
  
  /**
    * 最大高度
    * @since 3.1.0
    * @description 只有当高度自适应时，maxHeight的设定才有效。
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * 最大宽度
    * @default 360
    * @description 只有当`area: 'auto'`时，maxWidth的设定才有效。
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * 最大最小化
    * @default false
    * @description 显示最大小化按钮。该参数值对type:1和type:2有效。
    */
  var maxmin: js.UndefOr[Boolean] = js.native
  
  /**
    * 最小化后触发的回调
    * @param layero 当前层DOM
    * @description `return false` 不执行默认最小化。
    */
  var min: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], `false` | Unit]] = js.native
  
  /**
    * 触发拖动的元素
    * @default '.layui-layer-title'
    */
  var move: js.UndefOr[Selector | `false` | JQuery[HTMLElement]] = js.native
  
  /**
    * 拖动完毕后的回调方法
    * @param this 合并的选项
    * @param layero 当前层的DOM对象
    */
  var moveEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* layero */ JQuery[HTMLElement], Unit]] = js.native
  
  /**
    * 是否允许拖拽到窗口外
    * @default false
    */
  var moveOut: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated v3.0
    * @description 只提供默认的一种拖拽风格
    */
  var moveType: js.UndefOr[Double] = js.native
  
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
  var offset: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  
  /**
    * 是否允许拉伸
    * @default true
    * @description 可以在弹层右下角拖动来拉伸尺寸。该参数对loading、tips层无效
    */
  var resize: js.UndefOr[Boolean] = js.native
  
  /**
    * 监听窗口拉伸动作
    * @param layero 当前层的DOM对象
    */
  var resizing: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.native
  
  /**
    * 还原后触发的回调
    * @param layero 当前层DOM
    */
  var restore: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], Unit]] = js.native
  
  /**
    * 是否允许浏览器出现滚动条
    * @default true
    */
  var scrollbar: js.UndefOr[Boolean] = js.native
  
  /**
    * 遮罩
    * @default 0.3
    * @example [0.8, '#393D49']    //透明度、颜色
    */
  var shade: js.UndefOr[Double | `false` | (js.Tuple2[Double, String])] = js.native
  
  /**
    * 是否点击遮罩关闭
    * @description 如果你的shade是存在的，那么你可以设定shadeClose来控制点击弹层外区域关闭。
    * @default false
    */
  var shadeClose: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated v3.0
    * @see {@link #anim}
    */
  var shift: js.UndefOr[Double] = js.native
  
  /**
    * 样式类名
    * @default ''
    */
  var skin: js.UndefOr[String] = js.native
  
  /**
    * 层弹出后的成功回调方法
    * @param layero 当前层DOM
    * @param index 当前层索引
    */
  var success: js.UndefOr[js.Function2[/* layero */ JQuery[HTMLElement], /* index */ Index, Unit]] = js.native
  
  /**
    * 自动关闭所需毫秒
    * @default 0 //不会自动关闭
    */
  var time: js.UndefOr[Double] = js.native
  
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
  var tips: js.UndefOr[Double | (js.Tuple2[Double, String])] = js.native
  
  /**
    * 是否允许多个tips
    * @default false
    * @description 允许多个意味着不会销毁之前的tips层。
    */
  var tipsMore: js.UndefOr[Boolean] = js.native
  
  /**
    * 标题
    * @default '信息'
    * @example
    * '我是标题'
    * ['文本', 'font-size:18px;']
    * false    //不显示标题栏
    */
  var title: js.UndefOr[String | `false` | (js.Tuple2[String, String])] = js.native
  
  /**
    * 基本层类型
    * @default 0
    */
  var `type`: js.UndefOr[`3` | `2` | `4` | `0` | `1`] = js.native
  
  /**
    * 确定按钮回调方法
    * @param index 当前层索引
    * @param layero 当前层DOM对象
    * @description 如果设定了yes回调，需进行手工关闭，`close(index)`
    */
  var yes: js.UndefOr[js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], Unit]] = js.native
  
  /**
    * 层叠顺序
    * @default 19891014
    * @description 一般用于解决和其它组件的层叠冲突。
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnim(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("anim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnim: Self = this.set("anim", js.undefined)
    
    @scala.inline
    def setArea(value: String | (js.Tuple2[String, String])): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    
    @scala.inline
    def setBtnVarargs(value: String*): Self = this.set("btn", js.Array(value :_*))
    
    @scala.inline
    def setBtn(value: String | js.Array[String]): Self = this.set("btn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtn: Self = this.set("btn", js.undefined)
    
    @scala.inline
    def setBtn2(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn2", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn2: Self = this.set("btn2", js.undefined)
    
    @scala.inline
    def setBtn3(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn3", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn3: Self = this.set("btn3", js.undefined)
    
    @scala.inline
    def setBtn4(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn4", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn4: Self = this.set("btn4", js.undefined)
    
    @scala.inline
    def setBtn5(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn5", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn5: Self = this.set("btn5", js.undefined)
    
    @scala.inline
    def setBtn6(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn6", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn6: Self = this.set("btn6", js.undefined)
    
    @scala.inline
    def setBtn7(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn7", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn7: Self = this.set("btn7", js.undefined)
    
    @scala.inline
    def setBtn8(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn8", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn8: Self = this.set("btn8", js.undefined)
    
    @scala.inline
    def setBtn9(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("btn9", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBtn9: Self = this.set("btn9", js.undefined)
    
    @scala.inline
    def setBtnAlign(value: l | c | r): Self = this.set("btnAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnAlign: Self = this.set("btnAlign", js.undefined)
    
    @scala.inline
    def setCancel(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = this.set("cancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCloseBtn(value: `0` | `1` | `2`): Self = this.set("closeBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseBtn: Self = this.set("closeBtn", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String])): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    
    @scala.inline
    def setFull(value: /* layero */ JQuery[HTMLElement] => Unit): Self = this.set("full", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setIcon(value: Double): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsOutAnim(value: Boolean): Self = this.set("isOutAnim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOutAnim: Self = this.set("isOutAnim", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMaxmin(value: Boolean): Self = this.set("maxmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxmin: Self = this.set("maxmin", js.undefined)
    
    @scala.inline
    def setMin(value: /* layero */ JQuery[HTMLElement] => `false` | Unit): Self = this.set("min", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMove(value: Selector | `false` | JQuery[HTMLElement]): Self = this.set("move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setMoveEnd(value: js.ThisFunction1[Options, /* layero */ JQuery[HTMLElement], Unit]): Self = this.set("moveEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveEnd: Self = this.set("moveEnd", js.undefined)
    
    @scala.inline
    def setMoveOut(value: Boolean): Self = this.set("moveOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveOut: Self = this.set("moveOut", js.undefined)
    
    @scala.inline
    def setMoveType(value: Double): Self = this.set("moveType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveType: Self = this.set("moveType", js.undefined)
    
    @scala.inline
    def setOffset(value: String | (js.Tuple2[String, String])): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setResizing(value: /* layero */ JQuery[HTMLElement] => Unit): Self = this.set("resizing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizing: Self = this.set("resizing", js.undefined)
    
    @scala.inline
    def setRestore(value: /* layero */ JQuery[HTMLElement] => Unit): Self = this.set("restore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    
    @scala.inline
    def setScrollbar(value: Boolean): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
    
    @scala.inline
    def setShade(value: Double | `false` | (js.Tuple2[Double, String])): Self = this.set("shade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShade: Self = this.set("shade", js.undefined)
    
    @scala.inline
    def setShadeClose(value: Boolean): Self = this.set("shadeClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadeClose: Self = this.set("shadeClose", js.undefined)
    
    @scala.inline
    def setShift(value: Double): Self = this.set("shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = this.set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* layero */ JQuery[HTMLElement], /* index */ Index) => Unit): Self = this.set("success", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTips(value: Double | (js.Tuple2[Double, String])): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTips: Self = this.set("tips", js.undefined)
    
    @scala.inline
    def setTipsMore(value: Boolean): Self = this.set("tipsMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipsMore: Self = this.set("tipsMore", js.undefined)
    
    @scala.inline
    def setTitle(value: String | `false` | (js.Tuple2[String, String])): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: `3` | `2` | `4` | `0` | `1`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setYes(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => Unit): Self = this.set("yes", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteYes: Self = this.set("yes", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
