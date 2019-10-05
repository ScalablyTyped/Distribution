package typings.leafletDashRoutingDashMachine.leafletMod

import typings.leaflet.leafletMod.LatLng
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.Control
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.Formatter
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.FormatterOptions
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.IRoute
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.Itinerary
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.ItineraryOptions
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.Line
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.LineOptions
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.OSRMOptions
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.OSRMv1
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.Plan
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.PlanOptions
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.RoutingControlOptions
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.Waypoint
import typings.leafletDashRoutingDashMachine.leafletMod.Routing.WaypointOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "routing")
@js.native
object routing extends js.Object {
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

