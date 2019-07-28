package typings.html5plus

import typings.html5plus.html5plusStrings.close
import typings.html5plus.html5plusStrings.hide
import typings.html5plus.html5plusStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Webview窗口动画参数
  * 用于指定动画目标窗口，起始位置、目标位置等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewAnimationOptions extends js.Object {
  /**
    * 窗口动画完成后的行为
    * 可取值：
    * 	"none" - 动画完成后不做任何操作；
    * 	"hide" - 动画完成后隐藏窗口；
    * 	"close" - 动画完成后关闭窗口。
    * 	默认值为"none"。
    * - none: 动画完成后不做任何操作
    * - hide: 动画完成后隐藏窗口
    * - close: 动画完成后关闭窗口
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var action: js.UndefOr[none | hide | close] = js.undefined
  /**
    * 动画样式
    * 用于指定动画窗口的起始位置，目标位置等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var styles: js.UndefOr[PlusWebviewWebviewAnimationStyles] = js.undefined
  /**
    * 执行动画的窗口对象
    * 可取值Webview窗口对象、Webview窗口的id（String类型）、原生View窗口对象（plus.nativeObj.View）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var view: js.UndefOr[PlusWebviewWebviewObject] = js.undefined
}

object PlusWebviewWebviewAnimationOptions {
  @scala.inline
  def apply(
    action: none | hide | close = null,
    styles: PlusWebviewWebviewAnimationStyles = null,
    view: PlusWebviewWebviewObject = null
  ): PlusWebviewWebviewAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[PlusWebviewWebviewAnimationOptions]
  }
}

