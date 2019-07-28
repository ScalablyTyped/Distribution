package typings.leafletDashDeepzoom.leafletMod.TileLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepZoomOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var imageFormat: js.UndefOr[String] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DeepZoomOptions {
  @scala.inline
  def apply(
    height: Int | Double = null,
    imageFormat: String = null,
    maxZoom: Int | Double = null,
    tileSize: Int | Double = null,
    width: Int | Double = null
  ): DeepZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageFormat != null) __obj.updateDynamic("imageFormat")(imageFormat)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepZoomOptions]
  }
}

