package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

import typings.leaflet.leafletMod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing.Control")
@js.native
class Control () extends Itinerary {
  def this(options: RoutingControlOptions) = this()
  def getPlan(): Plan = js.native
  def getRouter(): IRouter = js.native
  def getWaypoints(): js.Array[Waypoint] = js.native
  def on(`type`: String, fn: js.Function1[/* event */ js.Any, Unit]): this.type = js.native
  def on(`type`: String, fn: js.Function1[/* event */ js.Any, Unit], context: js.Any): this.type = js.native
  def route(): Unit = js.native
  def setWaypoints(waypoints: js.Array[LatLng | Waypoint]): this.type = js.native
  def spliceWaypoints(index: Double, waypointsToRemove: Double, wayPoints: Waypoint*): js.Array[Waypoint] = js.native
}

