package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.`fill-extrusion`
import typings.mapboxDashGl.mapboxDashGlStrings.background
import typings.mapboxDashGl.mapboxDashGlStrings.circle
import typings.mapboxDashGl.mapboxDashGlStrings.fill
import typings.mapboxDashGl.mapboxDashGlStrings.heatmap
import typings.mapboxDashGl.mapboxDashGlStrings.hillshade
import typings.mapboxDashGl.mapboxDashGlStrings.line
import typings.mapboxDashGl.mapboxDashGlStrings.raster
import typings.mapboxDashGl.mapboxDashGlStrings.symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var id: String
  var interactive: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[
    BackgroundLayout | FillLayout | FillExtrusionLayout | LineLayout | SymbolLayout | RasterLayout | CircleLayout | HeatmapLayout | HillshadeLayout
  ] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var paint: js.UndefOr[
    BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
  ] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String | AnySourceData] = js.undefined
  var `source-layer`: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[
    fill | line | symbol | circle | `fill-extrusion` | raster | background | heatmap | hillshade
  ] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    id: String,
    filter: js.Array[_] = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    layout: BackgroundLayout | FillLayout | FillExtrusionLayout | LineLayout | SymbolLayout | RasterLayout | CircleLayout | HeatmapLayout | HillshadeLayout = null,
    maxzoom: Int | Double = null,
    metadata: js.Any = null,
    minzoom: Int | Double = null,
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint = null,
    ref: String = null,
    source: String | AnySourceData = null,
    `source-layer`: String = null,
    `type`: fill | line | symbol | circle | `fill-extrusion` | raster | background | heatmap | hillshade = null
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

