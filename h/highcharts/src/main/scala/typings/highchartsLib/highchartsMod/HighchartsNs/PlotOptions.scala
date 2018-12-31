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

