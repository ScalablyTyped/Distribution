package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Event Objects
@js.native
trait RoutingEvent extends js.Object {
  
  var waypoints: js.Array[Waypoint_] = js.native
}
object RoutingEvent {
  
  @scala.inline
  def apply(waypoints: js.Array[Waypoint_]): RoutingEvent = {
    val __obj = js.Dynamic.literal(waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingEvent]
  }
  
  @scala.inline
  implicit class RoutingEventOps[Self <: RoutingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWaypointsVarargs(value: Waypoint_ *): Self = this.set("waypoints", js.Array(value :_*))
    
    @scala.inline
    def setWaypoints(value: js.Array[Waypoint_]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
}
