package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorOptions extends js.Object {
  /**
    * (Highstock, Gantt) Whether the navigator and scrollbar should adapt to
    * updated data in the base X axis. When loading data async, as in the demo
    * below, this should be `false`. Otherwise new data will trigger navigator
    * redraw, which will cause unwanted looping. In the demo below, the data in
    * the navigator is set only once. On navigating, only the main chart
    * content is updated.
    */
  var adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) Enable or disable the navigator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) Options for the handles for dragging the zoomed area.
    */
  var handles: js.UndefOr[NavigatorHandlesOptions] = js.undefined
  /**
    * (Highstock, Gantt) The height of the navigator.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The distance from the nearest element, the X axis or X
    * axis labels.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The color of the mask covering the areas of the
    * navigator series that are currently not visible in the main series. The
    * default color is bluish with an opacity of 0.3 to see the series below.
    */
  var maskFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock, Gantt) Whether the mask should be inside the range marking
    * the zoomed range, or outside. In Highstock 1.x it was always `false`.
    */
  var maskInside: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) When the chart is inverted, whether to draw the
    * navigator on the opposite side.
    */
  var opposite: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) The color of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock, Gantt) The width of the line marking the currently zoomed
    * area in the navigator.
    */
  var outlineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Options for the navigator series. Available options
    * are the same as any series, documented at plotOptions and series.
    *
    * Unless data is explicitly defined on navigator.series, the data is
    * borrowed from the first series in the chart.
    *
    * Default series options for the navigator series are: (see online
    * documentation for example)
    */
  var series: js.UndefOr[
    NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType])
  ] = js.undefined
  /**
    * (Highstock, Gantt) Options for the navigator X axis. Default series
    * options for the navigator xAxis are: (see online documentation for
    * example)
    */
  var xAxis: js.UndefOr[NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions]] = js.undefined
  /**
    * (Highstock, Gantt) Options for the navigator Y axis. Default series
    * options for the navigator yAxis are: (see online documentation for
    * example)
    */
  var yAxis: js.UndefOr[NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions]] = js.undefined
}

object NavigatorOptions {
  @scala.inline
  def apply(
    adaptToUpdatedData: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    handles: NavigatorHandlesOptions = null,
    height: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    maskFill: ColorString | GradientColorObject | PatternObject = null,
    maskInside: js.UndefOr[Boolean] = js.undefined,
    opposite: js.UndefOr[Boolean] = js.undefined,
    outlineColor: ColorString | GradientColorObject | PatternObject = null,
    outlineWidth: js.UndefOr[Double] = js.undefined,
    series: NavigatorSeriesOptions | SeriesOptionsType | (js.Array[NavigatorSeriesOptions | SeriesOptionsType]) = null,
    xAxis: NavigatorXAxisOptions | js.Array[NavigatorXAxisOptions] = null,
    yAxis: NavigatorYAxisOptions | js.Array[NavigatorYAxisOptions] = null
  ): NavigatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptToUpdatedData)) __obj.updateDynamic("adaptToUpdatedData")(adaptToUpdatedData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (maskFill != null) __obj.updateDynamic("maskFill")(maskFill.asInstanceOf[js.Any])
    if (!js.isUndefined(maskInside)) __obj.updateDynamic("maskInside")(maskInside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opposite)) __obj.updateDynamic("opposite")(opposite.get.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(outlineWidth)) __obj.updateDynamic("outlineWidth")(outlineWidth.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorOptions]
  }
}

