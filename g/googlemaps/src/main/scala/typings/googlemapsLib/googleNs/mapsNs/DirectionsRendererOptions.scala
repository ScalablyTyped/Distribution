package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRendererOptions extends js.Object {
  var directions: js.UndefOr[DirectionsResult] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var hideRouteList: js.UndefOr[scala.Boolean] = js.undefined
  var infoWindow: js.UndefOr[InfoWindow] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  var panel: js.UndefOr[stdLib.Element] = js.undefined
  var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
  var preserveViewport: js.UndefOr[scala.Boolean] = js.undefined
  var routeIndex: js.UndefOr[scala.Double] = js.undefined
  var suppressBicyclingLayer: js.UndefOr[scala.Boolean] = js.undefined
  var suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMarkers: js.UndefOr[scala.Boolean] = js.undefined
  var suppressPolylines: js.UndefOr[scala.Boolean] = js.undefined
}

object DirectionsRendererOptions {
  @scala.inline
  def apply(
    directions: DirectionsResult = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    hideRouteList: js.UndefOr[scala.Boolean] = js.undefined,
    infoWindow: InfoWindow = null,
    map: Map = null,
    markerOptions: MarkerOptions = null,
    panel: stdLib.Element = null,
    polylineOptions: PolylineOptions = null,
    preserveViewport: js.UndefOr[scala.Boolean] = js.undefined,
    routeIndex: scala.Int | scala.Double = null,
    suppressBicyclingLayer: js.UndefOr[scala.Boolean] = js.undefined,
    suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined,
    suppressMarkers: js.UndefOr[scala.Boolean] = js.undefined,
    suppressPolylines: js.UndefOr[scala.Boolean] = js.undefined
  ): DirectionsRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (directions != null) __obj.updateDynamic("directions")(directions)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(hideRouteList)) __obj.updateDynamic("hideRouteList")(hideRouteList)
    if (infoWindow != null) __obj.updateDynamic("infoWindow")(infoWindow)
    if (map != null) __obj.updateDynamic("map")(map)
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions)
    if (!js.isUndefined(preserveViewport)) __obj.updateDynamic("preserveViewport")(preserveViewport)
    if (routeIndex != null) __obj.updateDynamic("routeIndex")(routeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressBicyclingLayer)) __obj.updateDynamic("suppressBicyclingLayer")(suppressBicyclingLayer)
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows)
    if (!js.isUndefined(suppressMarkers)) __obj.updateDynamic("suppressMarkers")(suppressMarkers)
    if (!js.isUndefined(suppressPolylines)) __obj.updateDynamic("suppressPolylines")(suppressPolylines)
    __obj.asInstanceOf[DirectionsRendererOptions]
  }
}

