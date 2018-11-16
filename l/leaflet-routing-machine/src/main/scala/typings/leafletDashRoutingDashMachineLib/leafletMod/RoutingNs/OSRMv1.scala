package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing.OSRMv1")
@js.native
class OSRMv1 () extends IRouter {
  def this(options: OSRMOptions) = this()
  def buildRouteUrl(waypoints: js.Array[Waypoint], options: RoutingOptions): java.lang.String = js.native
  def route(waypoints: js.Array[Waypoint], callback: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  def route(
    waypoints: js.Array[Waypoint],
    callback: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit],
    context: js.Object
  ): scala.Unit = js.native
  def route(
    waypoints: js.Array[Waypoint],
    callback: js.Function1[/* args */ js.UndefOr[js.Any], scala.Unit],
    context: js.Object,
    options: RoutingOptions
  ): scala.Unit = js.native
}

