package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 监听Webview窗口资源加载的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewListenResourceOptions extends js.Object {
  /**
    * 区配是否需要处理的URL资源
    * 支持正则表达式，默认值为对所有URL资源请求生效（相当于正则表达式“.*”）。
    *     如果Webview加载的资源区配条件，则触发回调事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `match`: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewListenResourceOptions {
  @scala.inline
  def apply(): PlusWebviewWebviewListenResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewListenResourceOptions]
  }
  @scala.inline
  implicit class PlusWebviewWebviewListenResourceOptionsOps[Self <: PlusWebviewWebviewListenResourceOptions] (val x: Self) extends AnyVal {
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
    def setMatch(value: String): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
  
}

