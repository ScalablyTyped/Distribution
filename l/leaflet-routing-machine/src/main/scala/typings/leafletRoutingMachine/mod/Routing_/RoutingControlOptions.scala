package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.PathOptions
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.smart
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
  var plan: js.UndefOr[Plan_] = js.undefined
  var routeDragInterval: js.UndefOr[Double] = js.undefined
  var routeLine: js.UndefOr[js.Function2[/* route */ IRoute, /* options */ LineOptions, Line_]] = js.undefined
  var routeWhileDragging: js.UndefOr[Boolean] = js.undefined
  var router: js.UndefOr[IRouter] = js.undefined
  var showAlternatives: js.UndefOr[Boolean] = js.undefined
  var useZoomParameter: js.UndefOr[Boolean] = js.undefined
  var waypointMode: js.UndefOr[String] = js.undefined
  var waypoints: js.UndefOr[js.Array[LatLng_ | Waypoint_]] = js.undefined
}

object RoutingControlOptions {
  @scala.inline
  def apply(
    altLineOptions: LineOptions = null,
    alternativeClassName: String = null,
    autoRoute: js.UndefOr[Boolean] = js.undefined,
    collapseBtn: /* itinerary */ Itinerary_ => Unit = null,
    collapseBtnClass: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    distanceTemplate: String = null,
    fitSelectedRoutes: smart | Boolean = null,
    formatter: Formatter_ = null,
    geocoder: js.Any = null,
    itineraryClassName: String = null,
    itineraryFormatter: ItineraryBuilder = null,
    lineOptions: LineOptions = null,
    minimizedClassName: String = null,
    plan: Plan_ = null,
    pointMarkerStyle: PathOptions = null,
    routeDragInterval: js.UndefOr[Double] = js.undefined,
    routeLine: (/* route */ IRoute, /* options */ LineOptions) => Line_ = null,
    routeWhileDragging: js.UndefOr[Boolean] = js.undefined,
    router: IRouter = null,
    show: js.UndefOr[Boolean] = js.undefined,
    showAlternatives: js.UndefOr[Boolean] = js.undefined,
    summaryTemplate: String = null,
    timeTemplate: String = null,
    totalDistanceRoundingSensitivity: js.UndefOr[Double] = js.undefined,
    useZoomParameter: js.UndefOr[Boolean] = js.undefined,
    waypointMode: String = null,
    waypoints: js.Array[LatLng_ | Waypoint_] = null
  ): RoutingControlOptions = {
    val __obj = js.Dynamic.literal()
    if (altLineOptions != null) __obj.updateDynamic("altLineOptions")(altLineOptions.asInstanceOf[js.Any])
    if (alternativeClassName != null) __obj.updateDynamic("alternativeClassName")(alternativeClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRoute)) __obj.updateDynamic("autoRoute")(autoRoute.get.asInstanceOf[js.Any])
    if (collapseBtn != null) __obj.updateDynamic("collapseBtn")(js.Any.fromFunction1(collapseBtn))
    if (collapseBtnClass != null) __obj.updateDynamic("collapseBtnClass")(collapseBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.get.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (distanceTemplate != null) __obj.updateDynamic("distanceTemplate")(distanceTemplate.asInstanceOf[js.Any])
    if (fitSelectedRoutes != null) __obj.updateDynamic("fitSelectedRoutes")(fitSelectedRoutes.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (geocoder != null) __obj.updateDynamic("geocoder")(geocoder.asInstanceOf[js.Any])
    if (itineraryClassName != null) __obj.updateDynamic("itineraryClassName")(itineraryClassName.asInstanceOf[js.Any])
    if (itineraryFormatter != null) __obj.updateDynamic("itineraryFormatter")(itineraryFormatter.asInstanceOf[js.Any])
    if (lineOptions != null) __obj.updateDynamic("lineOptions")(lineOptions.asInstanceOf[js.Any])
    if (minimizedClassName != null) __obj.updateDynamic("minimizedClassName")(minimizedClassName.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (pointMarkerStyle != null) __obj.updateDynamic("pointMarkerStyle")(pointMarkerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(routeDragInterval)) __obj.updateDynamic("routeDragInterval")(routeDragInterval.get.asInstanceOf[js.Any])
    if (routeLine != null) __obj.updateDynamic("routeLine")(js.Any.fromFunction2(routeLine))
    if (!js.isUndefined(routeWhileDragging)) __obj.updateDynamic("routeWhileDragging")(routeWhileDragging.get.asInstanceOf[js.Any])
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showAlternatives)) __obj.updateDynamic("showAlternatives")(showAlternatives.get.asInstanceOf[js.Any])
    if (summaryTemplate != null) __obj.updateDynamic("summaryTemplate")(summaryTemplate.asInstanceOf[js.Any])
    if (timeTemplate != null) __obj.updateDynamic("timeTemplate")(timeTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(totalDistanceRoundingSensitivity)) __obj.updateDynamic("totalDistanceRoundingSensitivity")(totalDistanceRoundingSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useZoomParameter)) __obj.updateDynamic("useZoomParameter")(useZoomParameter.get.asInstanceOf[js.Any])
    if (waypointMode != null) __obj.updateDynamic("waypointMode")(waypointMode.asInstanceOf[js.Any])
    if (waypoints != null) __obj.updateDynamic("waypoints")(waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingControlOptions]
  }
}

