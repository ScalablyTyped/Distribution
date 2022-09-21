package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InboundDeleteRouteRequest
  extends StObject
     with BaseRequest {
  
  /** the unique identifier of an existing route */
  var id: String
}
object InboundDeleteRouteRequest {
  
  inline def apply(id: String): InboundDeleteRouteRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InboundDeleteRouteRequest]
  }
  
  extension [Self <: InboundDeleteRouteRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
