package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTcpRouteRouteAction extends StObject {
  
  /**
    * Optional. The destination services to which traffic should be forwarded. At least one destination service is required.
    */
  var destinations: js.UndefOr[js.Array[SchemaTcpRouteRouteDestination]] = js.undefined
  
  /**
    * Optional. If true, Router will use the destination IP and port of the original connection as the destination of the request. Default is false.
    */
  var originalDestination: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTcpRouteRouteAction {
  
  inline def apply(): SchemaTcpRouteRouteAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTcpRouteRouteAction]
  }
  
  extension [Self <: SchemaTcpRouteRouteAction](x: Self) {
    
    inline def setDestinations(value: js.Array[SchemaTcpRouteRouteDestination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: SchemaTcpRouteRouteDestination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setOriginalDestination(value: Boolean): Self = StObject.set(x, "originalDestination", value.asInstanceOf[js.Any])
    
    inline def setOriginalDestinationNull: Self = StObject.set(x, "originalDestination", null)
    
    inline def setOriginalDestinationUndefined: Self = StObject.set(x, "originalDestination", js.undefined)
  }
}
