package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundRouteResponse extends StObject {
  
  /** the unique identifier of the route */
  var id: String
  
  /** the search pattern that the mailbox name should match */
  var pattern: js.UndefOr[String | Null] = js.undefined
  
  /** the webhook URL where inbound messages will be published */
  var url: js.UndefOr[String | Null] = js.undefined
}
object InboundRouteResponse {
  
  inline def apply(id: String): InboundRouteResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundRouteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InboundRouteResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
