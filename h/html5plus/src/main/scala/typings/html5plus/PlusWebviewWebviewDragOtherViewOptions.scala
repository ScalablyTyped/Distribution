package typings.html5plus

import typings.html5plus.html5plusStrings.follow
import typings.html5plus.html5plusStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 手势操作关联对象参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewDragOtherViewOptions extends js.Object {
  /**
    * 滑动模式
    * 可取值：
    *     "follow" - 同步跟随主Webview窗口滑动；
    *     "silent" - 不跟随主Webview窗口滑动。
    * - follow: 同步跟随主Webview窗口滑动
    * - silent: 不跟随主Webview窗口滑动
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var moveMode: js.UndefOr[follow | silent] = js.native
  /**
    * 手势关联对象
    * 可取值Webview窗口的id（String类型）、Webview窗口对象、原生View窗口对象（plus.nativeObj.View）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var view: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewDragOtherViewOptions {
  @scala.inline
  def apply(): PlusWebviewWebviewDragOtherViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewDragOtherViewOptions]
  }
  @scala.inline
  implicit class PlusWebviewWebviewDragOtherViewOptionsOps[Self <: PlusWebviewWebviewDragOtherViewOptions] (val x: Self) extends AnyVal {
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
    def setMoveMode(value: follow | silent): Self = this.set("moveMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveMode: Self = this.set("moveMode", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

