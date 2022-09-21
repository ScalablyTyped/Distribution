package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsFindByDomainRequest
  extends StObject
     with BaseRequest {
  
  /** a domain name */
  var domain: String
}
object UrlsFindByDomainRequest {
  
  inline def apply(domain: String): UrlsFindByDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsFindByDomainRequest]
  }
  
  extension [Self <: UrlsFindByDomainRequest](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
