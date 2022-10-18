package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSelectedEvent extends StObject {
  
  var route: IRoute
}
object RouteSelectedEvent {
  
  inline def apply(route: IRoute): RouteSelectedEvent = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSelectedEvent]
  }
  
  extension [Self <: RouteSelectedEvent](x: Self) {
    
    inline def setRoute(value: IRoute): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
