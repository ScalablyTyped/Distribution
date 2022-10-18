package typings.leafletRoutingMachine.leafletMod

import typings.leaflet.mod.LatLng_
import typings.leafletRoutingMachine.leafletMod.Routing_.AutoCompleteOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.AutoComplete_
import typings.leafletRoutingMachine.leafletMod.Routing_.Control_
import typings.leafletRoutingMachine.leafletMod.Routing_.ErrorControlOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.ErrorControl_
import typings.leafletRoutingMachine.leafletMod.Routing_.FormatterOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.Formatter_
import typings.leafletRoutingMachine.leafletMod.Routing_.GeocoderElementOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.GeocoderElement_
import typings.leafletRoutingMachine.leafletMod.Routing_.IRoute
import typings.leafletRoutingMachine.leafletMod.Routing_.ItineraryBuilderOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.ItineraryBuilder_
import typings.leafletRoutingMachine.leafletMod.Routing_.ItineraryOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.Itinerary_
import typings.leafletRoutingMachine.leafletMod.Routing_.LineOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.Line_
import typings.leafletRoutingMachine.leafletMod.Routing_.LocalizationOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.Localization_
import typings.leafletRoutingMachine.leafletMod.Routing_.MapBox_
import typings.leafletRoutingMachine.leafletMod.Routing_.OSRMOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.OSRMv1_
import typings.leafletRoutingMachine.leafletMod.Routing_.PlanOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.Plan_
import typings.leafletRoutingMachine.leafletMod.Routing_.RoutingControlOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.WaypointOptions
import typings.leafletRoutingMachine.leafletMod.Routing_.Waypoint_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routing {
  
  @JSImport("leaflet", "routing")
  @js.native
  val ^ : js.Any = js.native
  
  inline def autocomplete(element: HTMLElement, callback: Any, context: Any, options: AutoCompleteOptions): AutoComplete_ = (^.asInstanceOf[js.Dynamic].applyDynamic("autocomplete")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AutoComplete_]
  
  inline def control(): Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("control")().asInstanceOf[Control_]
  inline def control(options: RoutingControlOptions): Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("control")(options.asInstanceOf[js.Any]).asInstanceOf[Control_]
  
  inline def errorControl(routingControl: Control_, options: ErrorControlOptions): ErrorControl_ = (^.asInstanceOf[js.Dynamic].applyDynamic("errorControl")(routingControl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ErrorControl_]
  
  inline def formatter(): Formatter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("formatter")().asInstanceOf[Formatter_]
  inline def formatter(options: FormatterOptions): Formatter_ = ^.asInstanceOf[js.Dynamic].applyDynamic("formatter")(options.asInstanceOf[js.Any]).asInstanceOf[Formatter_]
  
  inline def geocoderElement(waypoint: Waypoint_, i: Double, numberOfWaypoints: Double, options: GeocoderElementOptions): GeocoderElement_ = (^.asInstanceOf[js.Dynamic].applyDynamic("geocoderElement")(waypoint.asInstanceOf[js.Any], i.asInstanceOf[js.Any], numberOfWaypoints.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeocoderElement_]
  
  inline def itinerary(): Itinerary_ = ^.asInstanceOf[js.Dynamic].applyDynamic("itinerary")().asInstanceOf[Itinerary_]
  inline def itinerary(options: ItineraryOptions): Itinerary_ = ^.asInstanceOf[js.Dynamic].applyDynamic("itinerary")(options.asInstanceOf[js.Any]).asInstanceOf[Itinerary_]
  
  inline def itineraryBuilder(): ItineraryBuilder_ = ^.asInstanceOf[js.Dynamic].applyDynamic("itineraryBuilder")().asInstanceOf[ItineraryBuilder_]
  inline def itineraryBuilder(options: ItineraryBuilderOptions): ItineraryBuilder_ = ^.asInstanceOf[js.Dynamic].applyDynamic("itineraryBuilder")(options.asInstanceOf[js.Any]).asInstanceOf[ItineraryBuilder_]
  
  inline def line(route: IRoute): Line_ = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(route.asInstanceOf[js.Any]).asInstanceOf[Line_]
  inline def line(route: IRoute, options: LineOptions): Line_ = (^.asInstanceOf[js.Dynamic].applyDynamic("line")(route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Line_]
  
  inline def localization(): Localization_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localization")().asInstanceOf[Localization_]
  inline def localization(options: LocalizationOptions): Localization_ = ^.asInstanceOf[js.Dynamic].applyDynamic("localization")(options.asInstanceOf[js.Any]).asInstanceOf[Localization_]
  
  inline def mapbox(accessToken: String, options: OSRMOptions): MapBox_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mapbox")(accessToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MapBox_]
  
  inline def osrmv1(): OSRMv1_ = ^.asInstanceOf[js.Dynamic].applyDynamic("osrmv1")().asInstanceOf[OSRMv1_]
  inline def osrmv1(options: OSRMOptions): OSRMv1_ = ^.asInstanceOf[js.Dynamic].applyDynamic("osrmv1")(options.asInstanceOf[js.Any]).asInstanceOf[OSRMv1_]
  
  inline def plan(waypoints: js.Array[LatLng_ | Waypoint_]): Plan_ = ^.asInstanceOf[js.Dynamic].applyDynamic("plan")(waypoints.asInstanceOf[js.Any]).asInstanceOf[Plan_]
  inline def plan(waypoints: js.Array[LatLng_ | Waypoint_], options: PlanOptions): Plan_ = (^.asInstanceOf[js.Dynamic].applyDynamic("plan")(waypoints.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Plan_]
  
  inline def waypoint(latLng: LatLng_): Waypoint_ = ^.asInstanceOf[js.Dynamic].applyDynamic("waypoint")(latLng.asInstanceOf[js.Any]).asInstanceOf[Waypoint_]
  inline def waypoint(latLng: LatLng_, name: String): Waypoint_ = (^.asInstanceOf[js.Dynamic].applyDynamic("waypoint")(latLng.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Waypoint_]
  inline def waypoint(latLng: LatLng_, name: String, options: WaypointOptions): Waypoint_ = (^.asInstanceOf[js.Dynamic].applyDynamic("waypoint")(latLng.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Waypoint_]
  inline def waypoint(latLng: LatLng_, name: Unit, options: WaypointOptions): Waypoint_ = (^.asInstanceOf[js.Dynamic].applyDynamic("waypoint")(latLng.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Waypoint_]
}
