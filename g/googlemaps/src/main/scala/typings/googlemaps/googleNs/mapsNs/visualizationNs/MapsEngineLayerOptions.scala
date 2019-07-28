package typings.googlemaps.googleNs.mapsNs.visualizationNs

import typings.googlemaps.googleNs.mapsNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapsEngineLayerOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var fitBounds: js.UndefOr[Boolean] = js.undefined
  var layerId: js.UndefOr[String] = js.undefined
  var layerKey: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var mapId: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var suppressInfoWindows: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object MapsEngineLayerOptions {
  @scala.inline
  def apply(
    accessToken: String = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    fitBounds: js.UndefOr[Boolean] = js.undefined,
    layerId: String = null,
    layerKey: String = null,
    map: Map = null,
    mapId: String = null,
    opacity: Int | Double = null,
    suppressInfoWindows: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
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

