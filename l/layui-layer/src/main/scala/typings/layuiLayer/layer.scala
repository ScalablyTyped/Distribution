package typings.layuiLayer

import typings.jquery.JQuery
import typings.layuiLayer.anon.PartialCSSStyleDeclaratio
import typings.layuiLayer.layer.callback.Cancel
import typings.layuiLayer.layer.callback.End
import typings.layuiLayer.layer.callback.Prompt
import typings.layuiLayer.layer.callback.Yes
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
import typings.layuiLayer.layuiLayerStrings.dialog
import typings.layuiLayer.layuiLayerStrings.iframe
import typings.layuiLayer.layuiLayerStrings.l
import typings.layuiLayer.layuiLayerStrings.loading
import typings.layuiLayer.layuiLayerStrings.page
import typings.layuiLayer.layuiLayerStrings.r
import typings.layuiLayer.layuiLayerStrings.tips
import typings.std.HTMLElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layer {
  
  trait ConfigOptions
    extends StObject
       with Options {
    
    /**
      * 拓展的css皮肤
      */
    var extend: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * js所在的目录，可以是绝对目录，也可以是相对目录
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: String | js.Array[String]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      @scala.inline
      def setExtendVarargs(value: String*): Self = StObject.set(x, "extend", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type Index = Double
  
  @js.native
  trait Layer extends StObject {
    
    /**
      * 普通信息框
      * @param content
      * @param options
      * @param yes
      */
    def alert(): Index = js.native
    def alert(content: String): Index = js.native
    def alert(content: String, options: Unit, yes: Yes): Index = js.native
    def alert(content: String, options: Options): Index = js.native
    def alert(content: String, options: Options, yes: Yes): Index = js.native
    def alert(content: String, yes: Yes): Index = js.native
    def alert(content: Unit, options: Unit, yes: Yes): Index = js.native
    def alert(content: Unit, options: Options): Index = js.native
    def alert(content: Unit, options: Options, yes: Yes): Index = js.native
    def alert(options: Options): Index = js.native
    def alert(options: Options, yes: Yes): Index = js.native
    def alert(yes: Yes): Index = js.native
    
    /**
      * 关闭特定层
      * @param index
      */
    def close(index: Index): Unit = js.native
    
    /**
      * 关闭所有层
      * @param type
      */
    def closeAll(): Unit = js.native
    def closeAll(`type`: dialog | page | iframe | loading | tips): Unit = js.native
    
    /**
      * 初始化全局配置
      * @param options
      */
    def config(options: ConfigOptions): this.type = js.native
    
    /**
      * 询问框
      * @param content
      * @param options
      * @param yes
      * @param cancel
      */
    def confirm(): Index = js.native
    def confirm(content: String): Index = js.native
    def confirm(content: String, options: Unit, yes: Unit, cancel: Cancel): Index = js.native
    def confirm(content: String, options: Unit, yes: Yes): Index = js.native
    def confirm(content: String, options: Unit, yes: Yes, cancel: Cancel): Index = js.native
    def confirm(content: String, options: Options): Index = js.native
    def confirm(content: String, options: Options, yes: Unit, cancel: Cancel): Index = js.native
    def confirm(content: String, options: Options, yes: Yes): Index = js.native
    def confirm(content: String, options: Options, yes: Yes, cancel: Cancel): Index = js.native
    def confirm(content: String, yes: Yes): Index = js.native
    def confirm(content: String, yes: Yes, cancel: Cancel): Index = js.native
    def confirm(content: Unit, options: Unit, yes: Unit, cancel: Cancel): Index = js.native
    def confirm(content: Unit, options: Unit, yes: Yes): Index = js.native
    def confirm(content: Unit, options: Unit, yes: Yes, cancel: Cancel): Index = js.native
    def confirm(content: Unit, options: Options): Index = js.native
    def confirm(content: Unit, options: Options, yes: Unit, cancel: Cancel): Index = js.native
    def confirm(content: Unit, options: Options, yes: Yes): Index = js.native
    def confirm(content: Unit, options: Options, yes: Yes, cancel: Cancel): Index = js.native
    def confirm(options: Options): Index = js.native
    def confirm(options: Options, yes: Unit, cancel: Cancel): Index = js.native
    def confirm(options: Options, yes: Yes): Index = js.native
    def confirm(options: Options, yes: Yes, cancel: Cancel): Index = js.native
    def confirm(yes: Yes): Index = js.native
    def confirm(yes: Yes, cancel: Cancel): Index = js.native
    
    /**
      * 在自定义元素上触发最大化。
      * @param index
      */
    def full(index: Index): Unit = js.native
    
    /**
      * 获取iframe页的DOM
      * @param selector
      * @param index
      */
    def getChildFrame(selector: String, index: Index): JQuery[HTMLElement] = js.native
    
    /**
      * 获取特定iframe层的索引
      * @param windowName
      */
    def getFrameIndex(windowName: String): Index = js.native
    
    /**
      * 指定iframe层自适应
      * @param index
      */
    def iframeAuto(index: Index): Unit = js.native
    
    /**
      * 重置特定iframe url
      * @param index
      * @param url
      */
    def iframeSrc(index: Index, url: String): Unit = js.native
    
    /**
      * 最新弹出的某个层
      */
    var index: Index = js.native
    
    /**
      * 加载层
      * @param icon
      * @param options
      */
    def load(): Index = js.native
    def load(icon: Unit, options: Options): Index = js.native
    @JSName("load")
    def load_0(icon: `0`): Index = js.native
    @JSName("load")
    def load_0(icon: `0`, options: Options): Index = js.native
    @JSName("load")
    def load_1(icon: `1`): Index = js.native
    @JSName("load")
    def load_1(icon: `1`, options: Options): Index = js.native
    @JSName("load")
    def load_2(icon: `2`): Index = js.native
    @JSName("load")
    def load_2(icon: `2`, options: Options): Index = js.native
    
    /**
      * 在自定义元素上触发最小化。
      * @param index
      */
    def min(index: Index): Unit = js.native
    
    /**
      * 提示框
      * @param content
      * @param options
      * @param end
      */
    def msg(content: String): Index = js.native
    def msg(content: String, end: End): Index = js.native
    def msg(content: String, options: Unit, end: End): Index = js.native
    def msg(content: String, options: Options): Index = js.native
    def msg(content: String, options: Options, end: End): Index = js.native
    
    /**
      * 原始核心方法
      * @param options
      */
    def open(): Index = js.native
    def open(options: Options): Index = js.native
    
    /**
      * 相册层
      * @param options
      */
    def photos(options: PhotosOptions): Index = js.native
    
    /**
      * 输入层
      * @param options
      * @param yes
      */
    def prompt(): Index = js.native
    def prompt(options: Unit, yes: Prompt): Index = js.native
    def prompt(options: PromptOptions): Index = js.native
    def prompt(options: PromptOptions, yes: Prompt): Index = js.native
    def prompt(yes: Prompt): Index = js.native
    
    /**
      * 初始化就绪
      * @param callback
      */
    def ready(callback: js.Function0[Unit]): this.type = js.native
    
    /**
      * 在自定义元素上触发还原。
      * @param index
      */
    def restore(index: Index): Unit = js.native
    
    /**
      * 置顶当前窗口
      */
    def setTop(layero: JQuery[HTMLElement]): Unit = js.native
    
    /**
      * 重新定义层的样式
      * @param index
      * @param cssStyle
      * @description 该方法对loading层和tips层无效。参数index为层的索引，cssStyle允许你传入任意的css属性
      */
    def style(index: Index, cssStyle: PartialCSSStyleDeclaratio): Unit = js.native
    
    /**
      * tab层
      * @param options
      */
    def tab(options: TabOptions): Index = js.native
    
    /**
      * tips层
      * @param content
      * @param follow
      * @param options
      */
    def tips(content: String, follow: Selector): Index = js.native
    def tips(content: String, follow: Selector, options: Options): Index = js.native
    def tips(content: String, follow: HTMLElement): Index = js.native
    def tips(content: String, follow: HTMLElement, options: Options): Index = js.native
    
    /**
      * 改变层的标题
      * @param title
      * @param index
      */
    def title(title: String, index: Index): Unit = js.native
    
    /**
      * 版本字符串
      */
    var v: String = js.native
    
    var zIndex: Double = js.native
  }
  
  /**
    * 基础参数
    */
  trait Options extends StObject {
    
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
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnim(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "anim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimUndefined: Self = StObject.set(x, "anim", js.undefined)
      
      @scala.inline
      def setArea(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      @scala.inline
      def setBtn(value: String | js.Array[String]): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtn2(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn2", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn2Undefined: Self = StObject.set(x, "btn2", js.undefined)
      
      @scala.inline
      def setBtn3(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn3", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn3Undefined: Self = StObject.set(x, "btn3", js.undefined)
      
      @scala.inline
      def setBtn4(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn4", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn4Undefined: Self = StObject.set(x, "btn4", js.undefined)
      
      @scala.inline
      def setBtn5(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn5", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn5Undefined: Self = StObject.set(x, "btn5", js.undefined)
      
      @scala.inline
      def setBtn6(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn6", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn6Undefined: Self = StObject.set(x, "btn6", js.undefined)
      
      @scala.inline
      def setBtn7(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn7", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn7Undefined: Self = StObject.set(x, "btn7", js.undefined)
      
      @scala.inline
      def setBtn8(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn8", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn8Undefined: Self = StObject.set(x, "btn8", js.undefined)
      
      @scala.inline
      def setBtn9(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "btn9", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBtn9Undefined: Self = StObject.set(x, "btn9", js.undefined)
      
      @scala.inline
      def setBtnAlign(value: l | c | r): Self = StObject.set(x, "btnAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBtnAlignUndefined: Self = StObject.set(x, "btnAlign", js.undefined)
      
      @scala.inline
      def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
      
      @scala.inline
      def setBtnVarargs(value: String*): Self = StObject.set(x, "btn", js.Array(value :_*))
      
      @scala.inline
      def setCancel(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCloseBtn(value: `0` | `1` | `2`): Self = StObject.set(x, "closeBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseBtnUndefined: Self = StObject.set(x, "closeBtn", js.undefined)
      
      @scala.inline
      def setContent(value: String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFull(value: /* layero */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "full", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsOutAnim(value: Boolean): Self = StObject.set(x, "isOutAnim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOutAnimUndefined: Self = StObject.set(x, "isOutAnim", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaxmin(value: Boolean): Self = StObject.set(x, "maxmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxminUndefined: Self = StObject.set(x, "maxmin", js.undefined)
      
      @scala.inline
      def setMin(value: /* layero */ JQuery[HTMLElement] => `false` | Unit): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMove(value: Selector | `false` | JQuery[HTMLElement]): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveEnd(value: js.ThisFunction1[Options, /* layero */ JQuery[HTMLElement], Unit]): Self = StObject.set(x, "moveEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveEndUndefined: Self = StObject.set(x, "moveEnd", js.undefined)
      
      @scala.inline
      def setMoveOut(value: Boolean): Self = StObject.set(x, "moveOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveOutUndefined: Self = StObject.set(x, "moveOut", js.undefined)
      
      @scala.inline
      def setMoveType(value: Double): Self = StObject.set(x, "moveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveTypeUndefined: Self = StObject.set(x, "moveType", js.undefined)
      
      @scala.inline
      def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      @scala.inline
      def setOffset(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setResizing(value: /* layero */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "resizing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResizingUndefined: Self = StObject.set(x, "resizing", js.undefined)
      
      @scala.inline
      def setRestore(value: /* layero */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      
      @scala.inline
      def setScrollbar(value: Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      @scala.inline
      def setShade(value: Double | `false` | (js.Tuple2[Double, String])): Self = StObject.set(x, "shade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadeClose(value: Boolean): Self = StObject.set(x, "shadeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadeCloseUndefined: Self = StObject.set(x, "shadeClose", js.undefined)
      
      @scala.inline
      def setShadeUndefined: Self = StObject.set(x, "shade", js.undefined)
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      @scala.inline
      def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setSuccess(value: (/* layero */ JQuery[HTMLElement], /* index */ Index) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setTips(value: Double | (js.Tuple2[Double, String])): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipsMore(value: Boolean): Self = StObject.set(x, "tipsMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipsMoreUndefined: Self = StObject.set(x, "tipsMore", js.undefined)
      
      @scala.inline
      def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
      
      @scala.inline
      def setTitle(value: String | `false` | (js.Tuple2[String, String])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: `3` | `2` | `4` | `0` | `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setYes(value: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => Unit): Self = StObject.set(x, "yes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PhotosData extends StObject {
    
    /** 相册包含的图片 */
    var data: js.Array[PhotosDataItem]
    
    /** 相册id */
    var id: Double
    
    /**
      * 初始显示的图片序号
      * @default 0
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /** 相册标题 */
    var title: String
  }
  object PhotosData {
    
    @scala.inline
    def apply(data: js.Array[PhotosDataItem], id: Double, title: String): PhotosData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotosData]
    }
    
    @scala.inline
    implicit class PhotosDataMutableBuilder[Self <: PhotosData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[PhotosDataItem]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: PhotosDataItem*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhotosDataItem extends StObject {
    
    /** 图片名 */
    var alt: String
    
    /** 图片id */
    var pid: js.UndefOr[Double] = js.undefined
    
    /** 原图地址 */
    var src: String
    
    /** 缩略图地址 */
    var thumb: String
  }
  object PhotosDataItem {
    
    @scala.inline
    def apply(alt: String, src: String, thumb: String): PhotosDataItem = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotosDataItem]
    }
    
    @scala.inline
    implicit class PhotosDataItemMutableBuilder[Self <: PhotosDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhotosOptions
    extends StObject
       with Options {
    
    var photos: PhotosData | Selector
    
    /**
      * 切换图片时触发
      * @param pic
      * @param layero
      */
    var tab: js.UndefOr[js.Function2[/* pic */ PhotosDataItem, /* layero */ JQuery[HTMLElement], Unit]] = js.undefined
  }
  object PhotosOptions {
    
    @scala.inline
    def apply(photos: PhotosData | Selector): PhotosOptions = {
      val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotosOptions]
    }
    
    @scala.inline
    implicit class PhotosOptionsMutableBuilder[Self <: PhotosOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPhotos(value: PhotosData | Selector): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: (/* pic */ PhotosDataItem, /* layero */ JQuery[HTMLElement]) => Unit): Self = StObject.set(x, "tab", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
  
  trait PromptOptions
    extends StObject
       with Options {
    
    /**
      * 输入框类型，支持0（文本）默认1（密码）2（多行文本）
      */
    var formType: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    /**
      * 可输入文本的最大长度
      * @default 500
      */
    var maxlength: js.UndefOr[Double] = js.undefined
    
    /**
      * 初始时的值
      * @default ''
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object PromptOptions {
    
    @scala.inline
    def apply(): PromptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptOptions]
    }
    
    @scala.inline
    implicit class PromptOptionsMutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormType(value: `0` | `1` | `2`): Self = StObject.set(x, "formType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTypeUndefined: Self = StObject.set(x, "formType", js.undefined)
      
      @scala.inline
      def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Selector = String
  
  trait TabItem extends StObject {
    
    var content: String
    
    var title: String
  }
  object TabItem {
    
    @scala.inline
    def apply(content: String, title: String): TabItem = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabItem]
    }
    
    @scala.inline
    implicit class TabItemMutableBuilder[Self <: TabItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabOptions
    extends StObject
       with Options {
    
    /**
      * 监听选项卡的切换事件
      * @param this 传入的选项
      * @param tabIndex 选项卡索引
      */
    var change: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* tabIndex */ Double, Unit]] = js.undefined
    
    var tab: js.Array[TabItem]
  }
  object TabOptions {
    
    @scala.inline
    def apply(tab: js.Array[TabItem]): TabOptions = {
      val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabOptions]
    }
    
    @scala.inline
    implicit class TabOptionsMutableBuilder[Self <: TabOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: js.ThisFunction1[TabOptions, /* tabIndex */ Double, Unit]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setTab(value: js.Array[TabItem]): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabVarargs(value: TabItem*): Self = StObject.set(x, "tab", js.Array(value :_*))
    }
  }
  
  trait Types extends StObject {
    
    /** 信息框 */
    var dialog: `0`
    
    /** iframe层 */
    var iframe: `2`
    
    /** 加载层 */
    var loading: `3`
    
    /** 页面层 */
    var page: `1`
    
    /** tips层 */
    var tips: `4`
  }
  object Types {
    
    @scala.inline
    def apply(): Types = {
      val __obj = js.Dynamic.literal(dialog = 0, iframe = 2, loading = 3, page = 1, tips = 4)
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDialog(value: `0`): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIframe(value: `2`): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: `3`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: `1`): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTips(value: `4`): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    }
  }
  
  object callback {
    
    type Cancel = NonNullable[
        js.UndefOr[
          js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], `false` | Unit]
        ]
      ]
    
    type End = NonNullable[js.UndefOr[js.Function0[Unit]]]
    
    type Prompt = js.Function3[/* value */ String, /* index */ Index, /* elem */ JQuery[HTMLElement], Unit]
    
    type Yes = NonNullable[
        js.UndefOr[js.Function2[/* index */ Index, /* layero */ JQuery[HTMLElement], Unit]]
      ]
  }
}
