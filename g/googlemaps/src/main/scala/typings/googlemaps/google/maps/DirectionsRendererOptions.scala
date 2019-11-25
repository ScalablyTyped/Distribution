package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRendererOptions extends js.Object {
  var directions: js.UndefOr[DirectionsResult] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var hideRouteList: js.UndefOr[Boolean] = js.undefined
  var infoWindow: js.UndefOr[InfoWindow] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  var panel: js.UndefOr[Element] = js.undefined
  var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
  var preserveViewport: js.UndefOr[Boolean] = js.undefined
  var routeIndex: js.UndefOr[Double] = js.undefined
  var suppressBicyclingLayer: js.UndefOr[Boolean] = js.undefined
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  var suppressMarkers: js.UndefOr[Boolean] = js.undefined
  var suppressPolylines: js.UndefOr[Boolean] = js.undefined
}

object DirectionsRendererOptions {
  @scala.inline
  def apply(
    directions: DirectionsResult = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    hideRouteList: js.UndefOr[Boolean] = js.undefined,
    infoWindow: InfoWindow = null,
    map: Map = null,
    markerOptions: MarkerOptions = null,
    panel: Element = null,
    polylineOptions: PolylineOptions = null,
    preserveViewport: js.UndefOr[Boolean] = js.undefined,
    routeIndex: Int | Double = null,
    suppressBicyclingLayer: js.UndefOr[Boolean] = js.undefined,
    suppressInfoWindows: js.UndefOr[Boolean] = js.undefined,
    suppressMarkers: js.UndefOr[Boolean] = js.undefined,
    suppressPolylines: js.UndefOr[Boolean] = js.undefined
  ): DirectionsRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (directions != null) __obj.updateDynamic("directions")(directions.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRouteList)) __obj.updateDynamic("hideRouteList")(hideRouteList.asInstanceOf[js.Any])
    if (infoWindow != null) __obj.updateDynamic("infoWindow")(infoWindow.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveViewport)) __obj.updateDynamic("preserveViewport")(preserveViewport.asInstanceOf[js.Any])
    if (routeIndex != null) __obj.updateDynamic("routeIndex")(routeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressBicyclingLayer)) __obj.updateDynamic("suppressBicyclingLayer")(suppressBicyclingLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMarkers)) __obj.updateDynamic("suppressMarkers")(suppressMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressPolylines)) __obj.updateDynamic("suppressPolylines")(suppressPolylines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRendererOptions]
  }
}

