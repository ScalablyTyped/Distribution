package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 窗口标题栏控件的分割线样式
  * 显示在标题栏控件底部。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewSplitLineStyles extends js.Object {
  /**
    * 底部分割线颜色
    * 可取值： "#RRGGBB"格式字符串，如"#FF0000"表示绘制红色分割线；
    * 	"rgba(R,G,B,A)"，其中R/G/B分别代表红色值/绿色值/蓝色值，正整数类型，取值范围为0-255，A为透明度，浮点数类型，取值范围为0-1（0为全透明，1为不透明），如"rgba(255,0,0,0.5)"，表示红色半透明。
    * 	默认值为"#CCCCCC"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * 底部分割线高度
    * 可取值：像素值（逻辑像素），支持小数点，如"1px"表示1像素高；百分比，如"1%"，相对于标题栏控件的高度。
    * 	默认值为"1px"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var height: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewSplitLineStyles {
  @scala.inline
  def apply(color: String = null, height: String = null): PlusWebviewWebviewSplitLineStyles = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[PlusWebviewWebviewSplitLineStyles]
  }
}

