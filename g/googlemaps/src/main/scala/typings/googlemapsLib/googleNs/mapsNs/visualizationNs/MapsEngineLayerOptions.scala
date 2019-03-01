package typings
package googlemapsLib.googleNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapsEngineLayerOptions extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var fitBounds: js.UndefOr[scala.Boolean] = js.undefined
  var layerId: js.UndefOr[java.lang.String] = js.undefined
  var layerKey: js.UndefOr[java.lang.String] = js.undefined
  var map: js.UndefOr[googlemapsLib.googleNs.mapsNs.Map] = js.undefined
  var mapId: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MapsEngineLayerOptions {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    fitBounds: js.UndefOr[scala.Boolean] = js.undefined,
    layerId: java.lang.String = null,
    layerKey: java.lang.String = null,
    map: googlemapsLib.googleNs.mapsNs.Map = null,
    mapId: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): MapsEngineLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(fitBounds)) __obj.updateDynamic("fitBounds")(fitBounds)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId)
    if (layerKey != null) __obj.updateDynamic("layerKey")(layerKey)
    if (map != null) __obj.updateDynamic("map")(map)
    if (mapId != null) __obj.updateDynamic("mapId")(mapId)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsEngineLayerOptions]
  }
}

