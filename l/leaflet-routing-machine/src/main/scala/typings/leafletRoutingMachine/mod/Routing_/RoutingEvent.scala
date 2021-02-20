package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Event Objects
@js.native
trait RoutingEvent extends StObject {
  
  var waypoints: js.Array[Waypoint_] = js.native
}
object RoutingEvent {
  
  @scala.inline
  def apply(waypoints: js.Array[Waypoint_]): RoutingEvent = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingEvent]
  }
  
  @scala.inline
  implicit class RoutingEventMutableBuilder[Self <: RoutingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaypoints(value: js.Array[Waypoint_]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: Waypoint_ *): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
