package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsDeleteResponse extends StObject {
  
  /** a boolean indicating whether the ip was successfully deleted */
  var deleted: Boolean
  
  /** the ip address */
  var ip: String
}
object IpsDeleteResponse {
  
  inline def apply(deleted: Boolean, ip: String): IpsDeleteResponse = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsDeleteResponse]
  }
  
  extension [Self <: IpsDeleteResponse](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
