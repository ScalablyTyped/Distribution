package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * XMLHttpRequest模块管理网络请求，与标准HTML中的XMLHttpRequest用途一致，差别在于前者可以进行跨域访问。通过plus.net可获取网络请求管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
  */
trait PlusNet extends js.Object {
  /**
    * HTTP请求进度事件
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var ProgressEvent: js.UndefOr[PlusNetProgressEvent] = js.undefined
  /**
    * 跨域网络请求对象
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
    */
  var XMLHttpRequest: js.UndefOr[PlusNetXMLHttpRequest] = js.undefined
}

object PlusNet {
  @scala.inline
  def apply(ProgressEvent: PlusNetProgressEvent = null, XMLHttpRequest: PlusNetXMLHttpRequest = null): PlusNet = {
    val __obj = js.Dynamic.literal()
    if (ProgressEvent != null) __obj.updateDynamic("ProgressEvent")(ProgressEvent)
    if (XMLHttpRequest != null) __obj.updateDynamic("XMLHttpRequest")(XMLHttpRequest)
    __obj.asInstanceOf[PlusNet]
  }
}

