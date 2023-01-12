package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTokenPayload extends StObject {
  
  var sid: String
  
  var submit_url: js.UndefOr[String] = js.undefined
}
object RequestTokenPayload {
  
  inline def apply(sid: String): RequestTokenPayload = {
    val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTokenPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestTokenPayload] (val x: Self) extends AnyVal {
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSubmit_url(value: String): Self = StObject.set(x, "submit_url", value.asInstanceOf[js.Any])
    
    inline def setSubmit_urlUndefined: Self = StObject.set(x, "submit_url", js.undefined)
  }
}
