package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsDeleteRequest
  extends StObject
     with BaseRequest {
  
  /** the dedicated ip to remove from your account */
  var ip: String
}
object IpsDeleteRequest {
  
  inline def apply(ip: String): IpsDeleteRequest = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsDeleteRequest]
  }
  
  extension [Self <: IpsDeleteRequest](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
