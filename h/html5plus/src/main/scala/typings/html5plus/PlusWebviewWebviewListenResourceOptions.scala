package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 监听Webview窗口资源加载的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewListenResourceOptions extends js.Object {
  /**
    * 区配是否需要处理的URL资源
    * 支持正则表达式，默认值为对所有URL资源请求生效（相当于正则表达式“.*”）。
    * 	如果Webview加载的资源区配条件，则触发回调事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `match`: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewListenResourceOptions {
  @scala.inline
  def apply(`match`: String = null): PlusWebviewWebviewListenResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusWebviewWebviewListenResourceOptions]
  }
}

