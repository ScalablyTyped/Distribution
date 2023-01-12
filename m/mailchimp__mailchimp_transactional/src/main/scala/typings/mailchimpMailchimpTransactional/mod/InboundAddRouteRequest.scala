package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundAddRouteRequest
  extends StObject
     with BaseRequest {
  
  /** an existing inbound domain */
  var domain: String
  
  /** the search pattern that the mailbox name should match */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** the webhook URL where the inbound messages will be published */
  var url: js.UndefOr[String] = js.undefined
}
object InboundAddRouteRequest {
  
  inline def apply(domain: String): InboundAddRouteRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundAddRouteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboundAddRouteRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
