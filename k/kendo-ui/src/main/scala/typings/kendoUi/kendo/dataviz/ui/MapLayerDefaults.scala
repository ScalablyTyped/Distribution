package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaults extends js.Object {
  var bing: js.UndefOr[MapLayerDefaultsBing] = js.undefined
  var bubble: js.UndefOr[MapLayerDefaultsBubble] = js.undefined
  var marker: js.UndefOr[MapLayerDefaultsMarker] = js.undefined
  var shape: js.UndefOr[MapLayerDefaultsShape] = js.undefined
  var tile: js.UndefOr[MapLayerDefaultsTile] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
}

object MapLayerDefaults {
  @scala.inline
  def apply(
    bing: MapLayerDefaultsBing = null,
    bubble: MapLayerDefaultsBubble = null,
    marker: MapLayerDefaultsMarker = null,
    shape: MapLayerDefaultsShape = null,
    tile: MapLayerDefaultsTile = null,
    tileSize: Int | Double = null
  ): MapLayerDefaults = {
    val __obj = js.Dynamic.literal()
    if (bing != null) __obj.updateDynamic("bing")(bing.asInstanceOf[js.Any])
    if (bubble != null) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaults]
  }
}

