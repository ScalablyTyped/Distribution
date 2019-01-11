package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing")
@js.native
object ^ extends js.Object {
  def control(): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Control = js.native
  def control(options: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.RoutingControlOptions): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Control = js.native
  def formatter(): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Formatter = js.native
  def formatter(options: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.FormatterOptions): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Formatter = js.native
  def itinerary(): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Itinerary = js.native
  def itinerary(options: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.ItineraryOptions): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Itinerary = js.native
  def line(route: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.IRoute): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Line = js.native
  def line(
    route: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.IRoute,
    options: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.LineOptions
  ): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Line = js.native
  def osrmv1(): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.OSRMv1 = js.native
  def osrmv1(options: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.OSRMOptions): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.OSRMv1 = js.native
  def plan(
    waypoints: js.Array[
      leafletLib.leafletMod.LatLng | leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Waypoint
    ]
  ): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Plan = js.native
  def plan(
    waypoints: js.Array[
      leafletLib.leafletMod.LatLng | leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Waypoint
    ],
    options: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.PlanOptions
  ): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Plan = js.native
  def waypoint(latLng: leafletLib.leafletMod.LatLng): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Waypoint = js.native
  def waypoint(latLng: leafletLib.leafletMod.LatLng, name: java.lang.String): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Waypoint = js.native
  def waypoint(
    latLng: leafletLib.leafletMod.LatLng,
    name: java.lang.String,
    options: leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.WaypointOptions
  ): leafletDashRoutingDashMachineLib.leafletMod.RoutingNs.Waypoint = js.native
}

