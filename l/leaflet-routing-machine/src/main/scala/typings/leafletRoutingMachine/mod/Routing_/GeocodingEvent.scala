package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocodingEvent extends StObject {
  
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
  implicit class GeocodingEventMutableBuilder[Self <: GeocodingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWaypoint(value: Waypoint_): Self = StObject.set(x, "waypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointIndex(value: Double): Self = StObject.set(x, "waypointIndex", value.asInstanceOf[js.Any])
  }
}
