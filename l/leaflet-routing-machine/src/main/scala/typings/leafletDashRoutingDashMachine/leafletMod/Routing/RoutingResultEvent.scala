package typings.leafletDashRoutingDashMachine.leafletMod.Routing

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
    val __obj = js.Dynamic.literal(routes = routes, waypoints = waypoints)
  
    __obj.asInstanceOf[RoutingResultEvent]
  }
}

