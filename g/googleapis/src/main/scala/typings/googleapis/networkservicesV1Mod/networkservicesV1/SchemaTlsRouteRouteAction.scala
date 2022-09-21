package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsRouteRouteAction extends StObject {
  
  /**
    * Required. The destination services to which traffic should be forwarded. At least one destination service is required.
    */
  var destinations: js.UndefOr[js.Array[SchemaTlsRouteRouteDestination]] = js.undefined
}
object SchemaTlsRouteRouteAction {
  
  inline def apply(): SchemaTlsRouteRouteAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsRouteRouteAction]
  }
  
  extension [Self <: SchemaTlsRouteRouteAction](x: Self) {
    
    inline def setDestinations(value: js.Array[SchemaTlsRouteRouteDestination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: SchemaTlsRouteRouteDestination*): Self = StObject.set(x, "destinations", js.Array(value*))
  }
}
