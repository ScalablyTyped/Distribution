package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XMLHttpRequest模块管理网络请求，与标准HTML中的XMLHttpRequest用途一致，差别在于前者可以进行跨域访问。通过plus.net可获取网络请求管理对象。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/net.html](http://www.html5plus.org/doc/zh_cn/net.html)
  */
@js.native
trait PlusNet extends StObject {
  
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
  implicit class PlusNetMutableBuilder[Self <: PlusNet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgressEvent(value: PlusNetProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressEventUndefined: Self = StObject.set(x, "ProgressEvent", js.undefined)
    
    @scala.inline
    def setXMLHttpRequest(value: PlusNetXMLHttpRequest): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
  }
}
