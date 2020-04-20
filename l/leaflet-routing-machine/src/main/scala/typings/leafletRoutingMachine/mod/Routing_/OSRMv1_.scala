package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.OSRMv1")
@js.native
class OSRMv1_ () extends IRouter {
  def this(options: OSRMOptions) = this()
  def buildRouteUrl(waypoints: js.Array[Waypoint_], options: RoutingOptions): String = js.native
  def route(waypoints: js.Array[Waypoint_], callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
    context: js.Object
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function1[/* args */ js.UndefOr[js.Any], Unit],
    context: js.Object,
    options: RoutingOptions
  ): Unit = js.native
}

