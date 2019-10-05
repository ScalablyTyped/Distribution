package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.PathOptions
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingControlOptions extends ItineraryOptions {
  var altLineOptions: js.UndefOr[LineOptions] = js.undefined
  var autoRoute: js.UndefOr[Boolean] = js.undefined
   // IGeocorder is from other library;
  var fitSelectedRoutes: js.UndefOr[smart | Boolean] = js.undefined
  var geocoder: js.UndefOr[js.Any] = js.undefined
  var lineOptions: js.UndefOr[LineOptions] = js.undefined
  var plan: js.UndefOr[Plan] = js.undefined
  var routeDragInterval: js.UndefOr[Double] = js.undefined
  var routeLine: js.UndefOr[js.Function2[/* route */ IRoute, /* options */ LineOptions, Line]] = js.undefined
  var routeWhileDragging: js.UndefOr[Boolean] = js.undefined
  var router: js.UndefOr[IRouter] = js.undefined
  var showAlternatives: js.UndefOr[Boolean] = js.undefined
  var useZoomParameter: js.UndefOr[Boolean] = js.undefined
  var waypointMode: js.UndefOr[String] = js.undefined
  var waypoints: js.UndefOr[js.Array[LatLng | Waypoint]] = js.undefined
}

object RoutingControlOptions {
  @scala.inline
  def apply(
    altLineOptions: LineOptions = null,
    alternativeClassName: String = null,
    autoRoute: js.UndefOr[Boolean] = js.undefined,
    collapseBtn: /* itinerary */ Itinerary => Unit = null,
    collapseBtnClass: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    distanceTemplate: String = null,
    fitSelectedRoutes: smart | Boolean = null,
    formatter: Formatter = null,
    geocoder: js.Any = null,
    itineraryClassName: String = null,
    itineraryFormatter: ItineraryBuilder = null,
    lineOptions: LineOptions = null,
    minimizedClassName: String = null,
    plan: Plan = null,
    pointMarkerStyle: PathOptions = null,
    routeDragInterval: Int | Double = null,
    routeLine: (/* route */ IRoute, /* options */ LineOptions) => Line = null,
    routeWhileDragging: js.UndefOr[Boolean] = js.undefined,
    router: IRouter = null,
    show: js.UndefOr[Boolean] = js.undefined,
    showAlternatives: js.UndefOr[Boolean] = js.undefined,
    summaryTemplate: String = null,
    timeTemplate: String = null,
    totalDistanceRoundingSensitivity: Int | Double = null,
    useZoomParameter: js.UndefOr[Boolean] = js.undefined,
    waypointMode: String = null,
    waypoints: js.Array[LatLng | Waypoint] = null
  ): RoutingControlOptions = {
    val __obj = js.Dynamic.literal()
    if (altLineOptions != null) __obj.updateDynamic("altLineOptions")(altLineOptions)
    if (alternativeClassName != null) __obj.updateDynamic("alternativeClassName")(alternativeClassName)
    if (!js.isUndefined(autoRoute)) __obj.updateDynamic("autoRoute")(autoRoute)
    if (collapseBtn != null) __obj.updateDynamic("collapseBtn")(js.Any.fromFunction1(collapseBtn))
    if (collapseBtnClass != null) __obj.updateDynamic("collapseBtnClass")(collapseBtnClass)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (distanceTemplate != null) __obj.updateDynamic("distanceTemplate")(distanceTemplate)
    if (fitSelectedRoutes != null) __obj.updateDynamic("fitSelectedRoutes")(fitSelectedRoutes.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (geocoder != null) __obj.updateDynamic("geocoder")(geocoder)
    if (itineraryClassName != null) __obj.updateDynamic("itineraryClassName")(itineraryClassName)
    if (itineraryFormatter != null) __obj.updateDynamic("itineraryFormatter")(itineraryFormatter)
    if (lineOptions != null) __obj.updateDynamic("lineOptions")(lineOptions)
    if (minimizedClassName != null) __obj.updateDynamic("minimizedClassName")(minimizedClassName)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (pointMarkerStyle != null) __obj.updateDynamic("pointMarkerStyle")(pointMarkerStyle)
    if (routeDragInterval != null) __obj.updateDynamic("routeDragInterval")(routeDragInterval.asInstanceOf[js.Any])
    if (routeLine != null) __obj.updateDynamic("routeLine")(js.Any.fromFunction2(routeLine))
    if (!js.isUndefined(routeWhileDragging)) __obj.updateDynamic("routeWhileDragging")(routeWhileDragging)
    if (router != null) __obj.updateDynamic("router")(router)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(showAlternatives)) __obj.updateDynamic("showAlternatives")(showAlternatives)
    if (summaryTemplate != null) __obj.updateDynamic("summaryTemplate")(summaryTemplate)
    if (timeTemplate != null) __obj.updateDynamic("timeTemplate")(timeTemplate)
    if (totalDistanceRoundingSensitivity != null) __obj.updateDynamic("totalDistanceRoundingSensitivity")(totalDistanceRoundingSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(useZoomParameter)) __obj.updateDynamic("useZoomParameter")(useZoomParameter)
    if (waypointMode != null) __obj.updateDynamic("waypointMode")(waypointMode)
    if (waypoints != null) __obj.updateDynamic("waypoints")(waypoints)
    __obj.asInstanceOf[RoutingControlOptions]
  }
}

