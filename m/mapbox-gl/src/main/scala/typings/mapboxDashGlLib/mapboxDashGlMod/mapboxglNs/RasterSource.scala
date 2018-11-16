package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RasterSource extends Source {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var bounds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var maxzoom: js.UndefOr[scala.Double] = js.undefined
  var minzoom: js.UndefOr[scala.Double] = js.undefined
  var scheme: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.xyz | mapboxDashGlLib.mapboxDashGlLibStrings.tms
  ] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
  var tiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("type")
  var type_RasterSource: mapboxDashGlLib.mapboxDashGlLibStrings.raster
  var url: js.UndefOr[java.lang.String] = js.undefined
}

