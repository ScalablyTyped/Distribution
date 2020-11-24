package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodingEvent extends js.Object {
  
  var waypoint: Waypoint_ = js.native
  
  var waypointIndex: Double = js.native
}
object GeocodingEvent {
  
  @scala.inline
  def apply(waypoint: Waypoint_, waypointIndex: Double): GeocodingEvent = {
    val __obj = js.Dynamic.literal(waypoint = waypoint.asInstanceOf[js.Any], waypointIndex = waypointIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodingEvent]
  }
  
  @scala.inline
  implicit class GeocodingEventOps[Self <: GeocodingEvent] (val x: Self) extends AnyVal {
    
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
    def setWaypoint(value: Waypoint_): Self = this.set("waypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointIndex(value: Double): Self = this.set("waypointIndex", value.asInstanceOf[js.Any])
  }
}
