package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.raster
import typings.mapboxDashGl.mapboxDashGlStrings.tms
import typings.mapboxDashGl.mapboxDashGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterSource
  extends Source
     with AnySourceData
     with AnySourceImpl {
  var attribution: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var scheme: js.UndefOr[xyz | tms] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tiles: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("type")
  var type_RasterSource: raster
  var url: js.UndefOr[String] = js.undefined
}

object RasterSource {
  @scala.inline
  def apply(
    `type`: raster,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    scheme: xyz | tms = null,
    tileSize: Int | Double = null,
    tiles: js.Array[String] = null,
    url: String = null
  ): RasterSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterSource]
  }
}

