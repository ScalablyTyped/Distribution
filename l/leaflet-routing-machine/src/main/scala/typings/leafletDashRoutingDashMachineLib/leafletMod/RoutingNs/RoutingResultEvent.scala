package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingResultEvent extends js.Object {
  var routes: js.Array[IRoute]
  var waypoints: js.Array[Waypoint]
}

object RoutingResultEvent {
  @scala.inline
  def apply(routes: js.Array[IRoute], waypoints: js.Array[Waypoint]): RoutingResultEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("routes")(routes)
    __obj.updateDynamic("waypoints")(waypoints)
    __obj.asInstanceOf[RoutingResultEvent]
  }
}

