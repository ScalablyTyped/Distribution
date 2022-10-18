package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Event Objects
trait RoutingEvent extends StObject {
  
  var waypoints: js.Array[Waypoint_]
}
object RoutingEvent {
  
  inline def apply(waypoints: js.Array[Waypoint_]): RoutingEvent = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingEvent]
  }
  
  extension [Self <: RoutingEvent](x: Self) {
    
    inline def setWaypoints(value: js.Array[Waypoint_]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsVarargs(value: Waypoint_ *): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
