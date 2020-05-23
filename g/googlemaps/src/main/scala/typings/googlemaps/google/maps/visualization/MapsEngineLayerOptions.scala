package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait MapsEngineLayerOptions extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var fitBounds: js.UndefOr[Boolean] = js.undefined
  var layerId: js.UndefOr[String] = js.undefined
  var layerKey: js.UndefOr[String] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
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
    map: Map[Element] = null,
    mapId: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    suppressInfoWindows: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): MapsEngineLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fitBounds)) __obj.updateDynamic("fitBounds")(fitBounds.get.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (layerKey != null) __obj.updateDynamic("layerKey")(layerKey.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapId != null) __obj.updateDynamic("mapId")(mapId.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsEngineLayerOptions]
  }
}

