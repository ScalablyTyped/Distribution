package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterDemSource
  extends Source
     with AnySourceData
     with AnySourceImpl {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var bounds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var encoding: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.terrarium | mapboxDashGlLib.mapboxDashGlLibStrings.mapbox
  ] = js.undefined
  var maxzoom: js.UndefOr[scala.Double] = js.undefined
  var minzoom: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var tiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("type")
  var type_RasterDemSource: mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem`
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RasterDemSource {
  @scala.inline
  def apply(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem`,
    attribution: java.lang.String = null,
    bounds: js.Array[scala.Double] = null,
    encoding: mapboxDashGlLib.mapboxDashGlLibStrings.terrarium | mapboxDashGlLib.mapboxDashGlLibStrings.mapbox = null,
    maxzoom: scala.Int | scala.Double = null,
    minzoom: scala.Int | scala.Double = null,
    tileSize: scala.Int | scala.Double = null,
    tiles: js.Array[java.lang.String] = null,
    url: java.lang.String = null
  ): RasterDemSource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RasterDemSource]
  }
}

