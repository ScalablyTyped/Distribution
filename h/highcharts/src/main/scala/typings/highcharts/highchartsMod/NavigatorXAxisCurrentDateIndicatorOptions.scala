package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisCurrentDateIndicatorOptions extends js.Object {
  /**
    * (Highstock) Flag to decide if plotLine should be rendered across all
    * panes.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) A custom class name, in addition to the default
    * `highcharts-plot-line`, to apply to each individual line.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The color of the line.
    */
  var color: js.UndefOr[ColorString] = js.undefined
  /**
    * (Gantt) The dashing or dot style for the plot line. For possible values
    * see this overview.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Gantt) An object defining mouse events for the plot line. Supported
    * properties are `click`, `mouseover`, `mouseout`, `mousemove`.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /**
    * (Gantt) An id used for identifying the plot line in Axis.removePlotLine.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) Text labels for the plot bands
    */
  var label: js.UndefOr[NavigatorXAxisCurrentDateIndicatorLabelOptions] = js.undefined
  /**
    * (Gantt) The width or thickness of the plot line.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) The z index of the plot line within the chart.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NavigatorXAxisCurrentDateIndicatorOptions {
  @scala.inline
  def apply(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: ColorString = null,
    dashStyle: DashStyleValue = null,
    events: js.Any = null,
    id: String = null,
    label: NavigatorXAxisCurrentDateIndicatorLabelOptions = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): NavigatorXAxisCurrentDateIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorXAxisCurrentDateIndicatorOptions]
  }
}

