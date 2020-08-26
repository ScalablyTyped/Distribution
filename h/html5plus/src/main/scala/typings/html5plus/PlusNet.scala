package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * XMLHttpRequest模块管理网络请求，与标准HTML中的XMLHttpRequest用途一致，差别在于前者可以进行跨域访问。通过plus.net可获取网络请求管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
  */
@js.native
trait PlusNet extends js.Object {
  /**
    * HTTP请求进度事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var ProgressEvent: js.UndefOr[PlusNetProgressEvent] = js.native
  /**
    * 跨域网络请求对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var XMLHttpRequest: js.UndefOr[PlusNetXMLHttpRequest] = js.native
}

object PlusNet {
  @scala.inline
  def apply(): PlusNet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNet]
  }
  @scala.inline
  implicit class PlusNetOps[Self <: PlusNet] (val x: Self) extends AnyVal {
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
    def setProgressEvent(value: PlusNetProgressEvent): Self = this.set("ProgressEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressEvent: Self = this.set("ProgressEvent", js.undefined)
    @scala.inline
    def setXMLHttpRequest(value: PlusNetXMLHttpRequest): Self = this.set("XMLHttpRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMLHttpRequest: Self = this.set("XMLHttpRequest", js.undefined)
  }
  
}

