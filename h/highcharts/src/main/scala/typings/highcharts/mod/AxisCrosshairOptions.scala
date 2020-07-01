package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisCrosshairOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A class name for the crosshair,
    * especially as a hook for styling.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the crosshair.
    * Defaults to `#cccccc` for numeric and datetime axes, and
    * `rgba(204,214,235,0.25)` for category axes, where the crosshair by
    * default highlights the whole category.
    */
  var color: js.UndefOr[ColorType] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The dash style for the
    * crosshair. See plotOptions.series.dashStyle for possible values.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highstock) A label on the axis next to the crosshair.
    *
    * In styled mode, the label is styled with the
    * `.highcharts-crosshair-label` class.
    */
  var label: js.UndefOr[AxisCrosshairLabelOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the crosshair should
    * snap to the point or follow the pointer independent of points.
    */
  var snap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the
    * crosshair. Defaults to 1 for numeric or datetime axes, and for one
    * category width for category axes.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Z index of the crosshair.
    * Higher Z indices allow drawing the crosshair on top of the series or
    * behind the grid lines.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object AxisCrosshairOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorType = null,
    dashStyle: DashStyleValue = null,
    label: AxisCrosshairLabelOptions = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): AxisCrosshairOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisCrosshairOptions]
  }
}

