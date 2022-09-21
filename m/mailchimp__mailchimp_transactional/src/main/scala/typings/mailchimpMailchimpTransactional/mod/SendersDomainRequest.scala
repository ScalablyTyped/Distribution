package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendersDomainRequest
  extends StObject
     with BaseRequest {
  
  /** a domain name */
  var domain: String
}
object SendersDomainRequest {
  
  inline def apply(domain: String): SendersDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendersDomainRequest]
  }
  
  extension [Self <: SendersDomainRequest](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
