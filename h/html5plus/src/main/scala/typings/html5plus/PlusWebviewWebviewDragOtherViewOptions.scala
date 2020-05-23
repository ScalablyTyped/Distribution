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
  var moveMode: js.UndefOr[follow | silent] = js.undefined
  /**
    * 手势关联对象
    * 可取值Webview窗口的id（String类型）、Webview窗口对象、原生View窗口对象（plus.nativeObj.View）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var view: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewDragOtherViewOptions {
  @scala.inline
  def apply(moveMode: follow | silent = null, view: String = null): PlusWebviewWebviewDragOtherViewOptions = {
    val __obj = js.Dynamic.literal()
    if (moveMode != null) __obj.updateDynamic("moveMode")(moveMode.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewDragOtherViewOptions]
  }
}

