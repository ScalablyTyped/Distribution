package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsInfoRequest
  extends StObject
     with BaseRequest {
  
  /** a dedicated IP address */
  var ip: js.UndefOr[String] = js.undefined
}
object IpsInfoRequest {
  
  inline def apply(): IpsInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpsInfoRequest]
  }
  
  extension [Self <: IpsInfoRequest](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
  }
}
