package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.mapbox
import typings.mapboxGl.mapboxGlStrings.terrarium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterDemSource
  extends Source
     with AnySourceData
     with AnySourceImpl {
  var attribution: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  var encoding: js.UndefOr[terrarium | mapbox] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tiles: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("type")
  var type_RasterDemSource: `raster-dem`
  var url: js.UndefOr[String] = js.undefined
}

object RasterDemSource {
  @scala.inline
  def apply(
    `type`: `raster-dem`,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    encoding: terrarium | mapbox = null,
    maxzoom: js.UndefOr[Double] = js.undefined,
    minzoom: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tiles: js.Array[String] = null,
    url: String = null
  ): RasterDemSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minzoom)) __obj.updateDynamic("minzoom")(minzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterDemSource]
  }
}

