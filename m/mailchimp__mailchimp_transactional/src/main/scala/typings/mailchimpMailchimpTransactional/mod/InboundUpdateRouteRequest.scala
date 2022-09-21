package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundUpdateRouteRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of an existing mailbox route */
  var id: String
  
  /** the search pattern that the mailbox name should match */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** the webhook URL where the inbound messages will be published; Validation: webhookexists */
  var url: js.UndefOr[String] = js.undefined
}
object InboundUpdateRouteRequest {
  
  inline def apply(id: String): InboundUpdateRouteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundUpdateRouteRequest]
  }
  
  extension [Self <: InboundUpdateRouteRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
