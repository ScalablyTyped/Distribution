package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 原生控件在窗口中停靠的方式
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewDock extends js.Object {
  /**
    * 控件停靠在页面底部
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var bottom: js.UndefOr[String] = js.undefined
  /**
    * 控件停靠在页面左侧
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var left: js.UndefOr[String] = js.undefined
  /**
    * 控件停靠在页面右侧
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var right: js.UndefOr[String] = js.undefined
  /**
    * 控件停靠则页面顶部
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var top: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewDock {
  @scala.inline
  def apply(bottom: String = null, left: String = null, right: String = null, top: String = null): PlusWebviewWebviewDock = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewDock]
  }
}

