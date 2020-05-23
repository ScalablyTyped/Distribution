package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorSeriesOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) Sets the fill color of the navigator series.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) Unless data is explicitly defined, the data is borrowed from
    * the first series in the chart.
    */
  var data: js.UndefOr[js.Array[Double | (js.Array[Double | String | Null]) | js.Object | Null]] = js.undefined
  /**
    * (Highstock) Data grouping options for the navigator series.
    */
  var dataGrouping: js.UndefOr[DataGroupingOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Data label options for the
    * navigator series. Data labels are disabled by default on the navigator
    * series.
    */
  var dataLabels: js.UndefOr[NavigatorSeriesDataLabelsOptions | js.Array[NavigatorSeriesDataLabelsOptions]] = js.undefined
  /**
    * (Highstock, Gantt) The fill opacity of the navigator series.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) Line color for the navigator series. Allows setting
    * the color while disallowing the default candlestick setting.
    */
  var lineColor: js.UndefOr[ColorString | Null] = js.undefined
  /**
    * (Highstock, Gantt) The pixel line width of the navigator series.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  var marker: js.UndefOr[NavigatorSeriesMarkerOptions] = js.undefined
  /**
    * (Highstock) Since Highstock v8, default value is the same as default
    * `pointRange` defined for a specific type (e.g. `null` for column type).
    *
    * In Highstock version < 8, defaults to 0.
    */
  var pointRange: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highstock, Gantt) The threshold option. Setting it to 0 will make the
    * default navigator area series draw its area from the 0 value and up.
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highstock, Gantt) The type of the navigator series. Defaults to
    * `areaspline` if defined, otherwise `line`.
    *
    * Heads up: In column-type navigator, zooming is limited to at least one
    * point with its `pointRange`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NavigatorSeriesOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    data: js.Array[Double | (js.Array[Double | String | Null]) | js.Object | Null] = null,
    dataGrouping: DataGroupingOptionsObject = null,
    dataLabels: NavigatorSeriesDataLabelsOptions | js.Array[NavigatorSeriesDataLabelsOptions] = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    id: String = null,
    lineColor: js.UndefOr[Null | ColorString] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    marker: NavigatorSeriesMarkerOptions = null,
    pointRange: js.UndefOr[Null | Double] = js.undefined,
    threshold: js.UndefOr[Null | Double] = js.undefined,
    `type`: String = null
  ): NavigatorSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lineColor)) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(pointRange)) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorSeriesOptions]
  }
}

