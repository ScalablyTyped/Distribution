package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingResultEvent extends StObject {
  
  var routes: js.Array[IRoute]
  
  var waypoints: js.Array[Waypoint_]
}
object RoutingResultEvent {
  
  inline def apply(routes: js.Array[IRoute], waypoints: js.Array[Waypoint_]): RoutingResultEvent = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingResultEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoutingResultEvent] (val x: Self) extends AnyVal {
    
    inline def setRoutes(value: js.Array[IRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: IRoute*): Self = StObject.set(x, "routes", js.Array(value*))
    
    inline def setWaypoints(value: js.Array[Waypoint_]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: Waypoint_ *): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
