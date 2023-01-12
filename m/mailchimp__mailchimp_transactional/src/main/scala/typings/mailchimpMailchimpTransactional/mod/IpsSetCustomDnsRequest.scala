package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpsSetCustomDnsRequest
  extends StObject
     with BaseRequest {
  
  /** a domain name to set as the dedicated IP's custom dns name. */
  var domain: String
  
  /** a dedicated ip address */
  var ip: String
}
object IpsSetCustomDnsRequest {
  
  inline def apply(domain: String, ip: String): IpsSetCustomDnsRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpsSetCustomDnsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpsSetCustomDnsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}
