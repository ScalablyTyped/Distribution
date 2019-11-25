package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口动画样式
  * 用于指定动画窗口的起始位置、目标位置等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewAnimationStyles extends js.Object {
  /**
    * 画窗口的起始左侧位置
    * 支持百分比、像素值，默认值为当前窗口的位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fromLeft: js.UndefOr[String] = js.undefined
  /**
    * 画窗口的目标左侧位置
    * 持百分比、像素值。
    * 	注意：如果设置的位置与起始位置一直，则无动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var toLeft: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewAnimationStyles {
  @scala.inline
  def apply(fromLeft: String = null, toLeft: String = null): PlusWebviewWebviewAnimationStyles = {
    val __obj = js.Dynamic.literal()
    if (fromLeft != null) __obj.updateDynamic("fromLeft")(fromLeft.asInstanceOf[js.Any])
    if (toLeft != null) __obj.updateDynamic("toLeft")(toLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewAnimationStyles]
  }
}

