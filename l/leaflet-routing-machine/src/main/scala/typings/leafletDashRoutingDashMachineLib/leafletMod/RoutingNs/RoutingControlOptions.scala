package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingControlOptions extends ItineraryOptions {
  var altLineOptions: js.UndefOr[LineOptions] = js.undefined
  var autoRoute: js.UndefOr[scala.Boolean] = js.undefined
   // IGeocorder is from other library;
  var fitSelectedRoutes: js.UndefOr[
    leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.smart | scala.Boolean
  ] = js.undefined
  var geocoder: js.UndefOr[js.Any] = js.undefined
  var lineOptions: js.UndefOr[LineOptions] = js.undefined
  var plan: js.UndefOr[Plan] = js.undefined
  var routeDragInterval: js.UndefOr[scala.Double] = js.undefined
  var routeLine: js.UndefOr[js.Function2[/* route */ IRoute, /* options */ LineOptions, Line]] = js.undefined
  var routeWhileDragging: js.UndefOr[scala.Boolean] = js.undefined
  var router: js.UndefOr[IRouter] = js.undefined
  var showAlternatives: js.UndefOr[scala.Boolean] = js.undefined
  var useZoomParameter: js.UndefOr[scala.Boolean] = js.undefined
  var waypointMode: js.UndefOr[java.lang.String] = js.undefined
  var waypoints: js.UndefOr[js.Array[leafletLib.leafletMod.LatLng | Waypoint]] = js.undefined
}

object RoutingControlOptions {
  @scala.inline
  def apply(
    altLineOptions: LineOptions = null,
    alternativeClassName: java.lang.String = null,
    autoRoute: js.UndefOr[scala.Boolean] = js.undefined,
    collapseBtn: /* itinerary */ Itinerary => scala.Unit = null,
    collapseBtnClass: java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    containerClassName: java.lang.String = null,
    distanceTemplate: java.lang.String = null,
    fitSelectedRoutes: leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.smart | scala.Boolean = null,
    formatter: Formatter = null,
    geocoder: js.Any = null,
    itineraryClassName: java.lang.String = null,
    itineraryFormatter: ItineraryBuilder = null,
    lineOptions: LineOptions = null,
    minimizedClassName: java.lang.String = null,
    plan: Plan = null,
    pointMarkerStyle: leafletLib.leafletMod.PathOptions = null,
    routeDragInterval: scala.Int | scala.Double = null,
    routeLine: (/* route */ IRoute, /* options */ LineOptions) => Line = null,
    routeWhileDragging: js.UndefOr[scala.Boolean] = js.undefined,
    router: IRouter = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    showAlternatives: js.UndefOr[scala.Boolean] = js.undefined,
    summaryTemplate: java.lang.String = null,
    timeTemplate: java.lang.String = null,
    totalDistanceRoundingSensitivity: scala.Int | scala.Double = null,
    useZoomParameter: js.UndefOr[scala.Boolean] = js.undefined,
    waypointMode: java.lang.String = null,
    waypoints: js.Array[leafletLib.leafletMod.LatLng | Waypoint] = null
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

