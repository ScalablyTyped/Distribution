package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesResizeOptions extends js.Object {
  /**
    * (Highstock) Contains two arrays of axes that are controlled by control
    * line of the axis.
    */
  var controlledAxis: js.UndefOr[ChartParallelAxesResizeControlledAxisOptions] = js.undefined
  /**
    * (Highstock) Cursor style for the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Enable or disable resize by drag for the axis.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Color of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) Dash style of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineDashStyle: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Width of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Horizontal offset of the control line.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Vertical offset of the control line.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ChartParallelAxesResizeOptions {
  @scala.inline
  def apply(
    controlledAxis: ChartParallelAxesResizeControlledAxisOptions = null,
    cursor: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    lineColor: ColorString = null,
    lineDashStyle: String = null,
    lineWidth: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ChartParallelAxesResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (controlledAxis != null) __obj.updateDynamic("controlledAxis")(controlledAxis)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineDashStyle != null) __obj.updateDynamic("lineDashStyle")(lineDashStyle)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesResizeOptions]
  }
}

