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
@js.native
trait PlusWebviewWebviewAnimationStyles extends js.Object {
  /**
    * 画窗口的起始左侧位置
    * 支持百分比、像素值，默认值为当前窗口的位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fromLeft: js.UndefOr[String] = js.native
  /**
    * 画窗口的目标左侧位置
    * 持百分比、像素值。
    *     注意：如果设置的位置与起始位置一直，则无动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var toLeft: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewAnimationStyles {
  @scala.inline
  def apply(): PlusWebviewWebviewAnimationStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewAnimationStyles]
  }
  @scala.inline
  implicit class PlusWebviewWebviewAnimationStylesOps[Self <: PlusWebviewWebviewAnimationStyles] (val x: Self) extends AnyVal {
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
    def setFromLeft(value: String): Self = this.set("fromLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromLeft: Self = this.set("fromLeft", js.undefined)
    @scala.inline
    def setToLeft(value: String): Self = this.set("toLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToLeft: Self = this.set("toLeft", js.undefined)
  }
  
}

