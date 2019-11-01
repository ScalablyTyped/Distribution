package typings.highcharts.highchartsMod

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
  var dataGrouping: js.UndefOr[NavigatorSeriesDataGroupingOptions] = js.undefined
  /**
    * (Highstock, Gantt) Data label options for the navigator series. Data
    * labels are disabled by default on the navigator series.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.undefined
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
    dataGrouping: NavigatorSeriesDataGroupingOptions = null,
    dataLabels: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject] = null,
    fillOpacity: Int | Double = null,
    id: String = null,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    marker: NavigatorSeriesMarkerOptions = null,
    pointRange: Int | Double = null,
    threshold: Int | Double = null,
    `type`: String = null
  ): NavigatorSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(dataGrouping)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (pointRange != null) __obj.updateDynamic("pointRange")(pointRange.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NavigatorSeriesOptions]
  }
}

