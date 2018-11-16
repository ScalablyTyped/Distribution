package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Layer extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var id: java.lang.String
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var layout: js.UndefOr[
    BackgroundLayout | FillLayout | FillExtrusionLayout | LineLayout | SymbolLayout | RasterLayout | CircleLayout | HeatmapLayout | HillshadeLayout
  ] = js.undefined
  var maxzoom: js.UndefOr[scala.Double] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var minzoom: js.UndefOr[scala.Double] = js.undefined
  var paint: js.UndefOr[
    BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
  ] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[
    java.lang.String | VectorSource | RasterSource | RasterDemSource | GeoJSONSource | ImageSource | VideoSource | GeoJSONSourceRaw
  ] = js.undefined
  var `source-layer`: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.fill | mapboxDashGlLib.mapboxDashGlLibStrings.line | mapboxDashGlLib.mapboxDashGlLibStrings.symbol | mapboxDashGlLib.mapboxDashGlLibStrings.circle | mapboxDashGlLib.mapboxDashGlLibStrings.`fill-extrusion` | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.background | mapboxDashGlLib.mapboxDashGlLibStrings.heatmap | mapboxDashGlLib.mapboxDashGlLibStrings.hillshade
  ] = js.undefined
}

