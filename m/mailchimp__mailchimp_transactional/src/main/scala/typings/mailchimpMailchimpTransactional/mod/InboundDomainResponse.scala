package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundDomainResponse extends StObject {
  
  /** the date and time that the inbound domain was added as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** the domain name that is accepting mail */
  var domain: String
  
  /** true if this inbound domain has successfully set up an MX record to deliver mail to the Mandrill servers */
  var valid_mx: Boolean
}
object InboundDomainResponse {
  
  inline def apply(created_at: String, domain: String, valid_mx: Boolean): InboundDomainResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], valid_mx = valid_mx.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboundDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setValid_mx(value: Boolean): Self = StObject.set(x, "valid_mx", value.asInstanceOf[js.Any])
  }
}
