package typings.leafletDotLocatecontrol.leafletMod.ControlNs

import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.MarkerOptions
import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateOptions extends js.Object {
  var cacheLocation: js.UndefOr[Boolean] = js.undefined
  var circlePadding: js.UndefOr[js.Array[Double]] = js.undefined
  var circleStyle: js.UndefOr[PathOptions] = js.undefined
  var clickBehavior: js.UndefOr[js.Any] = js.undefined
  var drawCircle: js.UndefOr[Boolean] = js.undefined
  var drawMarker: js.UndefOr[Boolean] = js.undefined
  var flyTo: js.UndefOr[Boolean] = js.undefined
  var followCircleStyle: js.UndefOr[PathOptions] = js.undefined
  var followMarkerStyle: js.UndefOr[PathOptions] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var iconElementTag: js.UndefOr[String] = js.undefined
  var iconLoading: js.UndefOr[String] = js.undefined
  var keepCurrentZoomLevel: js.UndefOr[Boolean] = js.undefined
  var layer: js.UndefOr[Layer] = js.undefined
  var locateOptions: js.UndefOr[typings.leaflet.leafletMod.LocateOptions] = js.undefined
  var markerClass: js.UndefOr[js.Any] = js.undefined
  var markerStyle: js.UndefOr[PathOptions | MarkerOptions] = js.undefined
  var onLocationError: js.UndefOr[js.Any] = js.undefined
  var onLocationOutsideMapBounds: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var returnToPrevBounds: js.UndefOr[Boolean] = js.undefined
  var setView: js.UndefOr[Boolean | String] = js.undefined
  var showPopup: js.UndefOr[Boolean] = js.undefined
  var strings: js.UndefOr[js.Any] = js.undefined
}

object LocateOptions {
  @scala.inline
  def apply(
    cacheLocation: js.UndefOr[Boolean] = js.undefined,
    circlePadding: js.Array[Double] = null,
    circleStyle: PathOptions = null,
    clickBehavior: js.Any = null,
    drawCircle: js.UndefOr[Boolean] = js.undefined,
    drawMarker: js.UndefOr[Boolean] = js.undefined,
    flyTo: js.UndefOr[Boolean] = js.undefined,
    followCircleStyle: PathOptions = null,
    followMarkerStyle: PathOptions = null,
    icon: String = null,
    iconElementTag: String = null,
    iconLoading: String = null,
    keepCurrentZoomLevel: js.UndefOr[Boolean] = js.undefined,
    layer: Layer = null,
    locateOptions: typings.leaflet.leafletMod.LocateOptions = null,
    markerClass: js.Any = null,
    markerStyle: PathOptions | MarkerOptions = null,
    onLocationError: js.Any = null,
    onLocationOutsideMapBounds: js.Any = null,
    position: String = null,
    returnToPrevBounds: js.UndefOr[Boolean] = js.undefined,
    setView: Boolean | String = null,
    showPopup: js.UndefOr[Boolean] = js.undefined,
    strings: js.Any = null
  ): LocateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheLocation)) __obj.updateDynamic("cacheLocation")(cacheLocation)
    if (circlePadding != null) __obj.updateDynamic("circlePadding")(circlePadding)
    if (circleStyle != null) __obj.updateDynamic("circleStyle")(circleStyle)
    if (clickBehavior != null) __obj.updateDynamic("clickBehavior")(clickBehavior)
    if (!js.isUndefined(drawCircle)) __obj.updateDynamic("drawCircle")(drawCircle)
    if (!js.isUndefined(drawMarker)) __obj.updateDynamic("drawMarker")(drawMarker)
    if (!js.isUndefined(flyTo)) __obj.updateDynamic("flyTo")(flyTo)
    if (followCircleStyle != null) __obj.updateDynamic("followCircleStyle")(followCircleStyle)
    if (followMarkerStyle != null) __obj.updateDynamic("followMarkerStyle")(followMarkerStyle)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconElementTag != null) __obj.updateDynamic("iconElementTag")(iconElementTag)
    if (iconLoading != null) __obj.updateDynamic("iconLoading")(iconLoading)
    if (!js.isUndefined(keepCurrentZoomLevel)) __obj.updateDynamic("keepCurrentZoomLevel")(keepCurrentZoomLevel)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (locateOptions != null) __obj.updateDynamic("locateOptions")(locateOptions)
    if (markerClass != null) __obj.updateDynamic("markerClass")(markerClass)
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (onLocationError != null) __obj.updateDynamic("onLocationError")(onLocationError)
    if (onLocationOutsideMapBounds != null) __obj.updateDynamic("onLocationOutsideMapBounds")(onLocationOutsideMapBounds)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(returnToPrevBounds)) __obj.updateDynamic("returnToPrevBounds")(returnToPrevBounds)
    if (setView != null) __obj.updateDynamic("setView")(setView.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopup)) __obj.updateDynamic("showPopup")(showPopup)
    if (strings != null) __obj.updateDynamic("strings")(strings)
    __obj.asInstanceOf[LocateOptions]
  }
}

