package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 窗口标题栏控件样式
  * 标题栏控件固定高度为44px,可通过Webview窗口对象的getTitleNView方法获取标题栏原生控件对象动态绘制内容。
  * 	可以通过WebviewObject对象的getTitleNView()获取标题栏的NView对象，然后调用其setStyle方法更新样式。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewTitleNViewStyles extends js.Object {
  /**
    * 标题栏控件是否显示左侧返回按钮
    * 可取值：
    * 		"true" - 显示返回按钮；
    * 		"false" - 不显示返回按钮。
    * 	默认值为"false"。
    * 	返回按钮的颜色为窗口标题文字颜色，按下时颜色自动调整透明度为0.3。
    * 	点击返回按钮的逻辑与按下系统返回键逻辑一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var autoBackButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 标题栏控件的背景颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示为红色背景，默认值为"#F7F7F7"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题栏上的自定义按钮
    * 创建的自定义按钮数目不限制，实际应用中建议最多设置4个按钮（包括左侧返回按钮）。
    * 	注意：此属性不支持动态修改，仅在创建titleNView时设置有效。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var buttons: js.UndefOr[js.Array[PlusWebview]] = js.undefined
  /**
    * 标题栏控件变化作用范围
    * 仅在type值为transparent时有效，页面滚动时标题栏背景透明度将发生变化。
    * 	当页面滚动到指定偏移量时标题栏背景变为完全不透明。
    * 	支持百分比、像素值，默认为'132px'。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var coverage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题栏控件是否显示Home按钮
    * 可取值：
    * 		"true" - 显示Home按钮；
    * 		"false" - 不显示Home按钮。
    * 	默认值为"false"。
    * 	Home按钮的颜色为窗口标题文字颜色，按下时颜色自动调整透明度为0.3。
    * 	点击Home按钮的逻辑为关闭所有非首页窗口，显示首页窗口。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var homeButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 内边距
    * 标题栏左右的内边距，单位为px（逻辑像素值），如"10px"表示10逻辑像素值。
    * 	默认值为"0px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var padding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 左内边距
    * 标题栏左侧内边距，单位为px（逻辑像素值），如"10px"表示10逻辑像素值。
    * 	默认值为"0px"，优先级padding-left &gt; padding。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `padding-left`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 右内边距
    * 标题栏右侧内边距，单位为px（逻辑像素值），如"10px"表示10逻辑像素值。
    * 	默认值为"0px"，优先级padding-right &gt; padding。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `padding-right`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题栏控件的进度条样式
    * 设置此属性则在标题栏控件的底部显示进度条，可配置进度条颜色值即高度。
    * 	设置此属性值为undefined或null则隐藏进度条。
    * 	默认不显示底部进度条。
    * 	注意：此属性将废弃，推荐使用WebviewStyles的progress。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var progress: js.UndefOr[PlusWebviewWebviewProgressStyles] = js.undefined
  /**
    * 标题栏控件的底部分割线
    * 设置此属性则在标题栏控件的底部显示分割线，可配置颜色值及高度。
    * 	设置此属性值为undefined或null则隐藏分割线。
    * 	默认不显示底部分割线。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var splitLine: js.UndefOr[PlusWebviewWebviewSplitLineStyles] = js.undefined
  /**
    * 标题栏上初始自定义绘制内容
    * 可用于设置自定义绘制图片、矩形区域、文本等内容。
    * 	注意：此属性不支持动态修改，仅在创建titleNView时设置有效，如果需要更新绘制内容可根据tags的id调用draw方法操作。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var tags: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 标题栏控件的标题文字颜色
    * 颜色值格式为"#RRGGBB"，如"#FF0000"表示标题文字颜色为红色，默认值为"#000000"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var titleColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题栏控件的标题文字超出显示区域时处理方式
    * 可取值：
    * 		"clip" - 超出显示区域时内容裁剪；
    * 		"ellipsis" - 超出显示区域时尾部显示省略标记（...）。
    * 	默认值为"ellipsis"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var titleOverflow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题栏控件的标题文字字体大小
    * 字体大小单位为像素，如"20px"表示字体大小为20像素，默认值为17像素。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var titleSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题栏控件的标题文字内容
    * 在标题栏控件居中（水平和垂直）显示，左右边距为88px，如果文本过长则尾部裁剪（加三个点"..."）显示。
    * 	当不设置titleText属性或属性值为undefined/null时，使用当前Webview窗口加载页面的标题，并自动同步更新页面的标题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var titleText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 标题栏控件样式
    * 可取值：
    * 		"default" - 默认样式，顶部停靠显示，挤压Webview页面内容显示区域；
    * 		"transparent" - 透明样式，顶部沉浸式显示覆盖Webview页面内容，标题栏上内容（除按钮外）全部透明，当页面滚动时透明度逐渐变化，直到不透明显示。
    * 	默认值为"default"。
    * 	注意：此属性不支持动态更新。
    * - default: 
    * 	默认样式，顶部停靠显示，挤压Webview页面内容显示区域
    * 								
    * - transparent: 
    * 	透明样式，顶部沉浸式显示覆盖Webview页面内容，标题栏上内容（除按钮外）全部透明，当页面滚动时透明度逐渐变化，直到不透明显示							
    * 								
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `type`: js.UndefOr[
    html5plusLib.html5plusLibStrings.default | html5plusLib.html5plusLibStrings.transparent
  ] = js.undefined
}

object PlusWebviewWebviewTitleNViewStyles {
  @scala.inline
  def apply(
    autoBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    buttons: js.Array[PlusWebview] = null,
    coverage: java.lang.String = null,
    homeButton: js.UndefOr[scala.Boolean] = js.undefined,
    padding: java.lang.String = null,
    `padding-left`: java.lang.String = null,
    `padding-right`: java.lang.String = null,
    progress: PlusWebviewWebviewProgressStyles = null,
    splitLine: PlusWebviewWebviewSplitLineStyles = null,
    tags: js.Array[_] = null,
    titleColor: java.lang.String = null,
    titleOverflow: java.lang.String = null,
    titleSize: java.lang.String = null,
    titleText: java.lang.String = null,
    `type`: html5plusLib.html5plusLibStrings.default | html5plusLib.html5plusLibStrings.transparent = null
  ): PlusWebviewWebviewTitleNViewStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBackButton)) __obj.updateDynamic("autoBackButton")(autoBackButton)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (coverage != null) __obj.updateDynamic("coverage")(coverage)
    if (!js.isUndefined(homeButton)) __obj.updateDynamic("homeButton")(homeButton)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`)
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor)
    if (titleOverflow != null) __obj.updateDynamic("titleOverflow")(titleOverflow)
    if (titleSize != null) __obj.updateDynamic("titleSize")(titleSize)
    if (titleText != null) __obj.updateDynamic("titleText")(titleText)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewTitleNViewStyles]
  }
}

