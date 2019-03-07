package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 窗口的分享参数
  * 在流应用环境中调用分享功能时使用的参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewShareOptions extends js.Object {
  /**
    * 分享时使用的链接地址
    * 必须是网络地址。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享时使用的图标
    * 默认使用应用图标。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享时使用的标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlusWebviewWebviewShareOptions {
  @scala.inline
  def apply(href: java.lang.String = null, icon: java.lang.String = null, title: java.lang.String = null): PlusWebviewWebviewShareOptions = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusWebviewWebviewShareOptions]
  }
}

