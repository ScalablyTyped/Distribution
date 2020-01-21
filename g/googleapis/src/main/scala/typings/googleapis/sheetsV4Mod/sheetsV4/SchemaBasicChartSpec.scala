package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for a basic chart.  See BasicChartType for the list of
  * charts this supports.
  */
@js.native
trait SchemaBasicChartSpec extends js.Object {
  /**
    * The axis on the chart.
    */
  var axis: js.UndefOr[js.Array[SchemaBasicChartAxis]] = js.native
  /**
    * The type of the chart.
    */
  var chartType: js.UndefOr[String] = js.native
  /**
    * The behavior of tooltips and data highlighting when hovering on data and
    * chart area.
    */
  var compareMode: js.UndefOr[String] = js.native
  /**
    * The domain of data this is charting. Only a single domain is supported.
    */
  var domains: js.UndefOr[js.Array[SchemaBasicChartDomain]] = js.native
  /**
    * The number of rows or columns in the data that are &quot;headers&quot;.
    * If not set, Google Sheets will guess how many rows are headers based on
    * the data.  (Note that BasicChartAxis.title may override the axis title
    * inferred from the header values.)
    */
  var headerCount: js.UndefOr[Double] = js.native
  /**
    * If some values in a series are missing, gaps may appear in the chart
    * (e.g, segments of lines in a line chart will be missing).  To eliminate
    * these gaps set this to true. Applies to Line, Area, and Combo charts.
    */
  var interpolateNulls: js.UndefOr[Boolean] = js.native
  /**
    * The position of the chart legend.
    */
  var legendPosition: js.UndefOr[String] = js.native
  /**
    * Gets whether all lines should be rendered smooth or straight by default.
    * Applies to Line charts.
    */
  var lineSmoothing: js.UndefOr[Boolean] = js.native
  /**
    * The data this chart is visualizing.
    */
  var series: js.UndefOr[js.Array[SchemaBasicChartSeries]] = js.native
  /**
    * The stacked type for charts that support vertical stacking. Applies to
    * Area, Bar, Column, Combo, and Stepped Area charts.
    */
  var stackedType: js.UndefOr[String] = js.native
  /**
    * True to make the chart 3D. Applies to Bar and Column charts.
    */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}

object SchemaBasicChartSpec {
  @scala.inline
  def apply(
    axis: js.Array[SchemaBasicChartAxis] = null,
    chartType: String = null,
    compareMode: String = null,
    domains: js.Array[SchemaBasicChartDomain] = null,
    headerCount: Int | Double = null,
    interpolateNulls: js.UndefOr[Boolean] = js.undefined,
    legendPosition: String = null,
    lineSmoothing: js.UndefOr[Boolean] = js.undefined,
    series: js.Array[SchemaBasicChartSeries] = null,
    stackedType: String = null,
    threeDimensional: js.UndefOr[Boolean] = js.undefined
  ): SchemaBasicChartSpec = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (chartType != null) __obj.updateDynamic("chartType")(chartType.asInstanceOf[js.Any])
    if (compareMode != null) __obj.updateDynamic("compareMode")(compareMode.asInstanceOf[js.Any])
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (headerCount != null) __obj.updateDynamic("headerCount")(headerCount.asInstanceOf[js.Any])
    if (!js.isUndefined(interpolateNulls)) __obj.updateDynamic("interpolateNulls")(interpolateNulls.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(lineSmoothing)) __obj.updateDynamic("lineSmoothing")(lineSmoothing.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType.asInstanceOf[js.Any])
    if (!js.isUndefined(threeDimensional)) __obj.updateDynamic("threeDimensional")(threeDimensional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicChartSpec]
  }
}

