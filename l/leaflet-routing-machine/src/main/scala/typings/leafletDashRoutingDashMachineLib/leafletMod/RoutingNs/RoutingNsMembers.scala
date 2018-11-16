package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing")
@js.native
object RoutingNsMembers extends js.Object {
  def control(): Control = js.native
  def control(options: RoutingControlOptions): Control = js.native
  def formatter(): Formatter = js.native
  def formatter(options: FormatterOptions): Formatter = js.native
  def itinerary(): Itinerary = js.native
  def itinerary(options: ItineraryOptions): Itinerary = js.native
  def line(route: IRoute): Line = js.native
  def line(route: IRoute, options: LineOptions): Line = js.native
  def osrmv1(): OSRMv1 = js.native
  def osrmv1(options: OSRMOptions): OSRMv1 = js.native
  def plan(waypoints: js.Array[Waypoint | leafletLib.leafletMod.LatLng]): Plan = js.native
  def plan(waypoints: js.Array[Waypoint | leafletLib.leafletMod.LatLng], options: PlanOptions): Plan = js.native
  def waypoint(latLng: leafletLib.leafletMod.LatLng): Waypoint = js.native
  def waypoint(latLng: leafletLib.leafletMod.LatLng, name: java.lang.String): Waypoint = js.native
  def waypoint(latLng: leafletLib.leafletMod.LatLng, name: java.lang.String, options: WaypointOptions): Waypoint = js.native
}

