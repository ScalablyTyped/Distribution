package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingResultEvent extends js.Object {
  var routes: js.Array[IRoute]
  var waypoints: js.Array[Waypoint_]
}

object RoutingResultEvent {
  @scala.inline
  def apply(routes: js.Array[IRoute], waypoints: js.Array[Waypoint_]): RoutingResultEvent = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingResultEvent]
  }
}

