package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersInfoRequest
  extends StObject
     with BaseRequest {
  
  /** the email address of the sender */
  var address: String
}
object SendersInfoRequest {
  
  inline def apply(address: String): SendersInfoRequest = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersInfoRequest]
  }
  
  extension [Self <: SendersInfoRequest](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
