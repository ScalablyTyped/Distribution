package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 窗口收藏参数
  * 在流应用环境中调用收藏功能时使用的参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewFavoriteOptions extends js.Object {
  /**
    * 收藏的页面地址
    * 必须是网络地址。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * 收藏时显示的图标
    * 在收藏列表中显示的图标，默认使用应用图标。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * 收藏时显示的标题
    * 在收藏列表中显示的标题字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var title: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewFavoriteOptions {
  @scala.inline
  def apply(href: String = null, icon: String = null, title: String = null): PlusWebviewWebviewFavoriteOptions = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusWebviewWebviewFavoriteOptions]
  }
}

