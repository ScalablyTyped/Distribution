package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingRequest extends StObject {
  
  var body: js.UndefOr[String] = js.native
  
  var call_id: String = js.native
  
  var cseq: Double = js.native
  
  var from: NameAddrHeader = js.native
  
  def getHeader(name: String): String = js.native
  
  def getHeaders(name: String): js.Array[String] = js.native
  
  def hasHeader(name: String): Boolean = js.native
  
  var method: String = js.native
  
  var ruri: URI = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  
  var to: NameAddrHeader = js.native
}
object OutgoingRequest {
  
  @scala.inline
  def apply(
    call_id: String,
    cseq: Double,
    from: NameAddrHeader,
    getHeader: String => String,
    getHeaders: String => js.Array[String],
    hasHeader: String => Boolean,
    method: String,
    ruri: URI,
    setHeader: (String, String) => Unit,
    to: NameAddrHeader
  ): OutgoingRequest = {
    val __obj = js.Dynamic.literal(call_id = call_id.asInstanceOf[js.Any], cseq = cseq.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getHeader = js.Any.fromFunction1(getHeader), getHeaders = js.Any.fromFunction1(getHeaders), hasHeader = js.Any.fromFunction1(hasHeader), method = method.asInstanceOf[js.Any], ruri = ruri.asInstanceOf[js.Any], setHeader = js.Any.fromFunction2(setHeader), to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingRequest]
  }
  
  @scala.inline
  implicit class OutgoingRequestMutableBuilder[Self <: OutgoingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCall_id(value: String): Self = StObject.set(x, "call_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCseq(value: Double): Self = StObject.set(x, "cseq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: NameAddrHeader): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeaders(value: String => js.Array[String]): Self = StObject.set(x, "getHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasHeader(value: String => Boolean): Self = StObject.set(x, "hasHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuri(value: URI): Self = StObject.set(x, "ruri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTo(value: NameAddrHeader): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
