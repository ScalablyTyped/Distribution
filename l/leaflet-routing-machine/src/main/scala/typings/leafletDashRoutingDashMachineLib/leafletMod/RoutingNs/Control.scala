package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

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
  def on(`type`: java.lang.String, fn: js.Function1[/* event */ js.Any, scala.Unit]): this.type = js.native
  def on(`type`: java.lang.String, fn: js.Function1[/* event */ js.Any, scala.Unit], context: js.Any): this.type = js.native
  def route(): scala.Unit = js.native
  def setWaypoints(waypoints: js.Array[Waypoint | leafletLib.leafletMod.LatLng]): this.type = js.native
  def spliceWaypoints(index: scala.Double, waypointsToRemove: scala.Double, wayPoints: Waypoint*): js.Array[Waypoint] = js.native
}

