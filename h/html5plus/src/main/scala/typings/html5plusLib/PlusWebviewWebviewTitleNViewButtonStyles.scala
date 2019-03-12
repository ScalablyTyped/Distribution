package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 窗口标题栏自定义按钮样式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewTitleNViewButtonStyles extends js.Object {
  /**
    * 按钮的背景颜色
    * 仅在标题栏type=transparent时生效，当标题栏透明时按钮显示的背景颜色。
    * 	可取值#RRGGBB和rgba格式颜色字符串，默认值为灰色半透明。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮上显示的角标文本
    * 最多显示3个字符，超过则显示为...。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var badgeText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮上文字颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色返回键；
    * 	"rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 	默认值为窗口标题栏控件的标题文字颜色。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按下状态按钮文字颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色返回键；
    * 	"rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 	默认值为color属性值自动调整透明度为0.3。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var colorPressed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮在标题栏上的显示位置
    * 可取值：
    * 		"right" - 在标题栏中靠右排列显示；
    * 		"left" - 在标题栏中靠左侧排列显示（在返回键后）。
    * 		默认值为"right"。
    * - right: 
    * 	在标题栏中靠右排列显示
    * 								
    * - left: 
    * 	在标题栏中靠左侧排列显示（在返回键后）
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var float: js.UndefOr[html5plusLib.html5plusLibStrings.right | html5plusLib.html5plusLibStrings.left] = js.undefined
  /**
    * 按钮上文字大小
    * 可取值：字体高度像素值，数字加"px"格式字符串，如"22px"。 
    * 	窗口标题栏为透明样式（type="transparent"）时，默认值为"22px"；
    * 	窗口标题栏为默认样式（type="default"）时，默认值为"27px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮上文字使用的字体文件路径
    * 字体文件路径支持以下类型：
    * 		相对路径 - 相对于当前页面的host位置，如"a.ttf"，注意当前页面为网络地址则不支持；
    * 		绝对路径 - 系统绝对路径，如Android平台"/sdcard/a.ttf"，此类路径通常通过其它5+ API获取的；
    * 		扩展相对路径URL(RelativeURL) - 以"_"开头的相对路径，如"_www/a.ttf"；
    * 		本地路径URL - 以“file://”开头，后面跟随系统绝对路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fontSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮上文字的粗细
    * 可取值：
    * 		"normal" - 标准字体；
    * 		"bold" - 加粗字体。
    * 	默认值为"normal"。
    * - normal: 
    * 	标准字体
    * 								
    * - bold: 
    * 	加粗字体
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fontWeight: js.UndefOr[html5plusLib.html5plusLibStrings.normal | html5plusLib.html5plusLibStrings.bold] = js.undefined
  /**
    * 按钮点击后触发的回调函数
    * 回调函数中将返回此JSON对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var onclick: js.UndefOr[js.Function1[/* result */ js.Any, scala.Unit]] = js.undefined
  /**
    * 按钮上是否显示红点
    * 设置为true则显示红点，false则不显示红点。默认值为false。
    * 	注意：当设置了角标文本时红点不显示。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var redDot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否显示选择指示图标
    * 设置为true则显示选择指示图标（向下箭头），颜色与文字颜色一致；
    * 	false则不显示。默认值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var select: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 按钮上显示的文字
    * 推荐使用一个字符，超过一个字符可能无法正常显示，使用字体图标时unicode字符表示必须'\\u'开头，如"\\ue123"（注意不能写成"\e123"）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 按钮样式
    * 运行环境中内置按钮样式直接使用，内置样式忽略fontSrc和text属性。
    * 	可取值：
    * 		"forward" - 前进按钮；
    * 		"back" - 后退按钮；
    * 		"share" - 分享按钮；
    * 		"favorite" - 收藏按钮；
    * 		"home" - 主页按钮；
    * 		"menu" - 菜单按钮；
    * 		"close" - 关闭按钮；
    * 		"none" - 无样式。
    * 	默认值为无样式（"none"），需通过text属性设置按钮上显示的内容、通过fontSrc属性设置使用的字体库。
    * - forward: 前进按钮
    * - back: 后退按钮
    * - share: 分享按钮
    * - favorite: 收藏按钮
    * - home: 主页按钮
    * - menu: 菜单按钮
    * - close: 关闭按钮
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[
    html5plusLib.html5plusLibStrings.forward | html5plusLib.html5plusLibStrings.back | html5plusLib.html5plusLibStrings.share | html5plusLib.html5plusLibStrings.favorite | html5plusLib.html5plusLibStrings.home | html5plusLib.html5plusLibStrings.menu | html5plusLib.html5plusLibStrings.close
  ] = js.undefined
  /**
    * 按钮的宽度
    * 可取值：
    * 		"*px" - 逻辑像素值，如"10px"表示10逻辑像素值，按钮的内容居中显示；
    * 		"auto" - 自定计算宽度，根据内容自动调整按钮宽度。
    * 	默认值为"44px"（适合字体图标）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object PlusWebviewWebviewTitleNViewButtonStyles {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    badgeText: java.lang.String = null,
    color: java.lang.String = null,
    colorPressed: java.lang.String = null,
    float: html5plusLib.html5plusLibStrings.right | html5plusLib.html5plusLibStrings.left = null,
    fontSize: java.lang.String = null,
    fontSrc: java.lang.String = null,
    fontWeight: html5plusLib.html5plusLibStrings.normal | html5plusLib.html5plusLibStrings.bold = null,
    onclick: /* result */ js.Any => scala.Unit = null,
    redDot: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    `type`: html5plusLib.html5plusLibStrings.forward | html5plusLib.html5plusLibStrings.back | html5plusLib.html5plusLibStrings.share | html5plusLib.html5plusLibStrings.favorite | html5plusLib.html5plusLibStrings.home | html5plusLib.html5plusLibStrings.menu | html5plusLib.html5plusLibStrings.close = null,
    width: java.lang.String = null
  ): PlusWebviewWebviewTitleNViewButtonStyles = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (badgeText != null) __obj.updateDynamic("badgeText")(badgeText)
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorPressed != null) __obj.updateDynamic("colorPressed")(colorPressed)
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontSrc != null) __obj.updateDynamic("fontSrc")(fontSrc)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (!js.isUndefined(redDot)) __obj.updateDynamic("redDot")(redDot)
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlusWebviewWebviewTitleNViewButtonStyles]
  }
}

