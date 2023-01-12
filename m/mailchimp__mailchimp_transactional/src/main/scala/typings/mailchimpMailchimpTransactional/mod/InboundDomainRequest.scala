package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundDomainRequest
  extends StObject
     with BaseRequest {
  
  /** a domain name; Validation: strip_tags, required */
  var domain: String
}
object InboundDomainRequest {
  
  inline def apply(domain: String): InboundDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboundDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
