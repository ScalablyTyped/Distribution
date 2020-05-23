package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisPlotLinesOptions extends AxisPlotLinesOptions {
  /**
    * (Highstock) Flag to decide if plotLine should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A custom class name, in addition to the
    * default `highcharts-plot-line`, to apply to each individual line.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The color of the line.
    */
  var color: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The dashing or dot style for the plot
    * line. For possible values see this overview.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An object defining mouse events for the
    * plot line. Supported properties are `click`, `mouseover`, `mouseout`,
    * `mousemove`.
    */
  var events: js.UndefOr[ZAxisPlotLinesEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id used for identifying the plot line
    * in Axis.removePlotLine.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[ZAxisPlotLinesLabelOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The position of the line in axis units.
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The width or thickness of the plot line.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The z index of the plot line within the
    * chart.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ZAxisPlotLinesOptions {
  @scala.inline
  def apply(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: ColorString = null,
    dashStyle: DashStyleValue = null,
    events: ZAxisPlotLinesEventsOptions = null,
    id: String = null,
    label: ZAxisPlotLinesLabelOptions = null,
    value: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): ZAxisPlotLinesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAxisPlotLinesOptions]
  }
}

