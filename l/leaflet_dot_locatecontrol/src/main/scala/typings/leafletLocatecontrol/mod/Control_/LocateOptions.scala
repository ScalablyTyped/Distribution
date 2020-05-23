package typings.leafletLocatecontrol.mod.Control_

import typings.leaflet.mod.Layer
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PathOptions
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
  var locateOptions: js.UndefOr[typings.leaflet.mod.LocateOptions] = js.undefined
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
    locateOptions: typings.leaflet.mod.LocateOptions = null,
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
    if (!js.isUndefined(cacheLocation)) __obj.updateDynamic("cacheLocation")(cacheLocation.get.asInstanceOf[js.Any])
    if (circlePadding != null) __obj.updateDynamic("circlePadding")(circlePadding.asInstanceOf[js.Any])
    if (circleStyle != null) __obj.updateDynamic("circleStyle")(circleStyle.asInstanceOf[js.Any])
    if (clickBehavior != null) __obj.updateDynamic("clickBehavior")(clickBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(drawCircle)) __obj.updateDynamic("drawCircle")(drawCircle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawMarker)) __obj.updateDynamic("drawMarker")(drawMarker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flyTo)) __obj.updateDynamic("flyTo")(flyTo.get.asInstanceOf[js.Any])
    if (followCircleStyle != null) __obj.updateDynamic("followCircleStyle")(followCircleStyle.asInstanceOf[js.Any])
    if (followMarkerStyle != null) __obj.updateDynamic("followMarkerStyle")(followMarkerStyle.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconElementTag != null) __obj.updateDynamic("iconElementTag")(iconElementTag.asInstanceOf[js.Any])
    if (iconLoading != null) __obj.updateDynamic("iconLoading")(iconLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(keepCurrentZoomLevel)) __obj.updateDynamic("keepCurrentZoomLevel")(keepCurrentZoomLevel.get.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (locateOptions != null) __obj.updateDynamic("locateOptions")(locateOptions.asInstanceOf[js.Any])
    if (markerClass != null) __obj.updateDynamic("markerClass")(markerClass.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (onLocationError != null) __obj.updateDynamic("onLocationError")(onLocationError.asInstanceOf[js.Any])
    if (onLocationOutsideMapBounds != null) __obj.updateDynamic("onLocationOutsideMapBounds")(onLocationOutsideMapBounds.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(returnToPrevBounds)) __obj.updateDynamic("returnToPrevBounds")(returnToPrevBounds.get.asInstanceOf[js.Any])
    if (setView != null) __obj.updateDynamic("setView")(setView.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopup)) __obj.updateDynamic("showPopup")(showPopup.get.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateOptions]
  }
}

