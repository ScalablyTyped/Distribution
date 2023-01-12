package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundRoutesRequest
  extends StObject
     with BaseRequest {
  
  /**
    * the domain to check
    */
  var domain: String
}
object InboundRoutesRequest {
  
  inline def apply(domain: String): InboundRoutesRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundRoutesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboundRoutesRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
