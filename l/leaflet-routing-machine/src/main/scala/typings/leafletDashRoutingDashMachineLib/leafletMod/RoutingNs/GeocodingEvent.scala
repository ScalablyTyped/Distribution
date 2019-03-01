package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodingEvent extends js.Object {
  var waypoint: Waypoint
  var waypointIndex: scala.Double
}

object GeocodingEvent {
  @scala.inline
  def apply(waypoint: Waypoint, waypointIndex: scala.Double): GeocodingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("waypoint")(waypoint)
    __obj.updateDynamic("waypointIndex")(waypointIndex)
    __obj.asInstanceOf[GeocodingEvent]
  }
}

