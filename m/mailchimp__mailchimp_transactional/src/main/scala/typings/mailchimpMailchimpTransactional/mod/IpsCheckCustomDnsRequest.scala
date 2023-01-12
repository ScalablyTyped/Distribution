package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsCheckCustomDnsRequest
  extends StObject
     with BaseRequest {
  
  /** the domain name to test */
  var domain: String
  
  /** a dedicated ip address */
  var ip: String
}
object IpsCheckCustomDnsRequest {
  
  inline def apply(domain: String, ip: String): IpsCheckCustomDnsRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsCheckCustomDnsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpsCheckCustomDnsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
