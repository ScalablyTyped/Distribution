package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodingEvent extends js.Object {
  var waypoint: Waypoint_
  var waypointIndex: Double
}

object GeocodingEvent {
  @scala.inline
  def apply(waypoint: Waypoint_, waypointIndex: Double): GeocodingEvent = {
    val __obj = js.Dynamic.literal(waypoint = waypoint.asInstanceOf[js.Any], waypointIndex = waypointIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodingEvent]
  }
}

