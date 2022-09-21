package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsStartWarmupRequest
  extends StObject
     with BaseRequest {
  
  /** a dedicated ip address */
  var ip: String
}
object IpsStartWarmupRequest {
  
  inline def apply(ip: String): IpsStartWarmupRequest = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsStartWarmupRequest]
  }
  
  extension [Self <: IpsStartWarmupRequest](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
