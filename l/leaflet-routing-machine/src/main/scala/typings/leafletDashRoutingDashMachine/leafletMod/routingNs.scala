package typings.leafletDashRoutingDashMachine.leafletMod

import typings.leaflet.leafletMod.LatLng
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.Control
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.Formatter
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.FormatterOptions
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.IRoute
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.Itinerary
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.ItineraryOptions
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.Line
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.LineOptions
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.OSRMOptions
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.OSRMv1
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.Plan
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.PlanOptions
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.RoutingControlOptions
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.Waypoint
import typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs.WaypointOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.routing")
@js.native
object routingNs extends js.Object {
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
  def plan(waypoints: js.Array[LatLng | Waypoint]): Plan = js.native
  def plan(waypoints: js.Array[LatLng | Waypoint], options: PlanOptions): Plan = js.native
  def waypoint(latLng: LatLng): Waypoint = js.native
  def waypoint(latLng: LatLng, name: String): Waypoint = js.native
  def waypoint(latLng: LatLng, name: String, options: WaypointOptions): Waypoint = js.native
}

