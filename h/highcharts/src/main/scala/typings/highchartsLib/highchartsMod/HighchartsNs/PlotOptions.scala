package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The plotOptions is a wrapper object for config objects for each series type. The config objects for each series can
  * also be overridden for each series item as given in the series array.
  *
  * Configuration options for the series are given in three levels. Options for all series in a chart are given in the
  * plotOptions.series object. Then options for all series of a specific type are given in the plotOptions of that type,
  * for example plotOptions.line. Next, options for one single series are given in the series array.
  */
trait PlotOptions extends js.Object {
  var area: js.UndefOr[AreaChart] = js.undefined
  var arearange: js.UndefOr[AreaRangeChart] = js.undefined
  var areaspline: js.UndefOr[AreaSplineChart] = js.undefined
  var areasplinerange: js.UndefOr[AreaSplineRangeChart] = js.undefined
  var bar: js.UndefOr[BarChart] = js.undefined
  var boxplot: js.UndefOr[BoxPlotChart] = js.undefined
  var bubble: js.UndefOr[BubbleChart] = js.undefined
  var column: js.UndefOr[ColumnChart] = js.undefined
  var columnrange: js.UndefOr[ColumnRangeChart] = js.undefined
  var errorbar: js.UndefOr[ErrorBarChart] = js.undefined
  var funnel: js.UndefOr[FunnelChart] = js.undefined
  var gauge: js.UndefOr[GaugeChart] = js.undefined
  var heatmap: js.UndefOr[HeatMapChart] = js.undefined
  var line: js.UndefOr[LineChart] = js.undefined
  var pie: js.UndefOr[PieChart] = js.undefined
  var polygon: js.UndefOr[PolygonChart] = js.undefined
  var pyramid: js.UndefOr[PyramidChart] = js.undefined
  var scatter: js.UndefOr[ScatterChart] = js.undefined
  var series: js.UndefOr[SeriesChart] = js.undefined
  var solidgauge: js.UndefOr[SolidGaugeChart] = js.undefined
  var spline: js.UndefOr[SplineChart] = js.undefined
  var treemap: js.UndefOr[TreeMapChart] = js.undefined
  var waterfall: js.UndefOr[WaterFallChart] = js.undefined
}

object PlotOptions {
  @scala.inline
  def apply(
    area: AreaChart = null,
    arearange: AreaRangeChart = null,
    areaspline: AreaSplineChart = null,
    areasplinerange: AreaSplineRangeChart = null,
    bar: BarChart = null,
    boxplot: BoxPlotChart = null,
    bubble: BubbleChart = null,
    column: ColumnChart = null,
    columnrange: ColumnRangeChart = null,
    errorbar: ErrorBarChart = null,
    funnel: FunnelChart = null,
    gauge: GaugeChart = null,
    heatmap: HeatMapChart = null,
    line: LineChart = null,
    pie: PieChart = null,
    polygon: PolygonChart = null,
    pyramid: PyramidChart = null,
    scatter: ScatterChart = null,
    series: SeriesChart = null,
    solidgauge: SolidGaugeChart = null,
    spline: SplineChart = null,
    treemap: TreeMapChart = null,
    waterfall: WaterFallChart = null
  ): PlotOptions = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (arearange != null) __obj.updateDynamic("arearange")(arearange)
    if (areaspline != null) __obj.updateDynamic("areaspline")(areaspline)
    if (areasplinerange != null) __obj.updateDynamic("areasplinerange")(areasplinerange)
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (boxplot != null) __obj.updateDynamic("boxplot")(boxplot)
    if (bubble != null) __obj.updateDynamic("bubble")(bubble)
    if (column != null) __obj.updateDynamic("column")(column)
    if (columnrange != null) __obj.updateDynamic("columnrange")(columnrange)
    if (errorbar != null) __obj.updateDynamic("errorbar")(errorbar)
    if (funnel != null) __obj.updateDynamic("funnel")(funnel)
    if (gauge != null) __obj.updateDynamic("gauge")(gauge)
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap)
    if (line != null) __obj.updateDynamic("line")(line)
    if (pie != null) __obj.updateDynamic("pie")(pie)
    if (polygon != null) __obj.updateDynamic("polygon")(polygon)
    if (pyramid != null) __obj.updateDynamic("pyramid")(pyramid)
    if (scatter != null) __obj.updateDynamic("scatter")(scatter)
    if (series != null) __obj.updateDynamic("series")(series)
    if (solidgauge != null) __obj.updateDynamic("solidgauge")(solidgauge)
    if (spline != null) __obj.updateDynamic("spline")(spline)
    if (treemap != null) __obj.updateDynamic("treemap")(treemap)
    if (waterfall != null) __obj.updateDynamic("waterfall")(waterfall)
    __obj.asInstanceOf[PlotOptions]
  }
}

