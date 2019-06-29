package typings
package leafletDashDeepzoomLib.leafletMod.TileLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepZoomOptions extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var imageFormat: js.UndefOr[java.lang.String] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DeepZoomOptions {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    imageFormat: java.lang.String = null,
    maxZoom: scala.Int | scala.Double = null,
    tileSize: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
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

