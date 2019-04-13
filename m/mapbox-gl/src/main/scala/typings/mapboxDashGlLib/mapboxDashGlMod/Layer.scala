package typings
package mapboxDashGlLib.mapboxDashGlMod

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
  var source: js.UndefOr[java.lang.String | AnySourceData] = js.undefined
  var `source-layer`: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.fill | mapboxDashGlLib.mapboxDashGlLibStrings.line | mapboxDashGlLib.mapboxDashGlLibStrings.symbol | mapboxDashGlLib.mapboxDashGlLibStrings.circle | mapboxDashGlLib.mapboxDashGlLibStrings.`fill-extrusion` | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.background | mapboxDashGlLib.mapboxDashGlLibStrings.heatmap | mapboxDashGlLib.mapboxDashGlLibStrings.hillshade
  ] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    id: java.lang.String,
    filter: js.Array[_] = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    layout: BackgroundLayout | FillLayout | FillExtrusionLayout | LineLayout | SymbolLayout | RasterLayout | CircleLayout | HeatmapLayout | HillshadeLayout = null,
    maxzoom: scala.Int | scala.Double = null,
    metadata: js.Any = null,
    minzoom: scala.Int | scala.Double = null,
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint = null,
    ref: java.lang.String = null,
    source: java.lang.String | AnySourceData = null,
    `source-layer`: java.lang.String = null,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.fill | mapboxDashGlLib.mapboxDashGlLibStrings.line | mapboxDashGlLib.mapboxDashGlLibStrings.symbol | mapboxDashGlLib.mapboxDashGlLibStrings.circle | mapboxDashGlLib.mapboxDashGlLibStrings.`fill-extrusion` | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.background | mapboxDashGlLib.mapboxDashGlLibStrings.heatmap | mapboxDashGlLib.mapboxDashGlLibStrings.hillshade = null
  ): Layer = {
    val __obj = js.Dynamic.literal(id = id)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (paint != null) __obj.updateDynamic("paint")(paint.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (`source-layer` != null) __obj.updateDynamic("source-layer")(`source-layer`)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

