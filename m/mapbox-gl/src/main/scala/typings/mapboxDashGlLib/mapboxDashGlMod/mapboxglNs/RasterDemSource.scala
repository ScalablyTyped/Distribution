package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RasterDemSource extends Source {
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

