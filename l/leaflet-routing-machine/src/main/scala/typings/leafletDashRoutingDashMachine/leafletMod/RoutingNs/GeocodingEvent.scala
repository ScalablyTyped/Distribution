package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodingEvent extends js.Object {
  var waypoint: Waypoint
  var waypointIndex: Double
}

object GeocodingEvent {
  @scala.inline
  def apply(waypoint: Waypoint, waypointIndex: Double): GeocodingEvent = {
    val __obj = js.Dynamic.literal(waypoint = waypoint, waypointIndex = waypointIndex)
  
    __obj.asInstanceOf[GeocodingEvent]
  }
}

