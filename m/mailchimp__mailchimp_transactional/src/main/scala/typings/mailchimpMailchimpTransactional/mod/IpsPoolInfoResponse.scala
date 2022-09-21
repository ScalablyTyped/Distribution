package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsPoolInfoResponse extends StObject {
  
  /** the date and time that this pool was created as a UTC timestamp in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** the dedicated IPs in this pool */
  var ips: js.Array[IpsInfoResponse]
  
  /** this pool's name */
  var name: String
}
object IpsPoolInfoResponse {
  
  inline def apply(created_at: String, ips: js.Array[IpsInfoResponse], name: String): IpsPoolInfoResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ips = ips.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsPoolInfoResponse]
  }
  
  extension [Self <: IpsPoolInfoResponse](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setIps(value: js.Array[IpsInfoResponse]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
    
    inline def setIpsVarargs(value: IpsInfoResponse*): Self = StObject.set(x, "ips", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
