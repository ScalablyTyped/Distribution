package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisResizeOptions extends js.Object {
  /**
    * (Highstock) Contains two arrays of axes that are controlled by control
    * line of the axis.
    */
  var controlledAxis: js.UndefOr[YAxisResizeControlledAxisOptions] = js.undefined
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

object YAxisResizeOptions {
  @scala.inline
  def apply(
    controlledAxis: YAxisResizeControlledAxisOptions = null,
    cursor: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    lineColor: ColorString = null,
    lineDashStyle: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): YAxisResizeOptions = {
    val __obj = js.Dynamic.literal()
    if (controlledAxis != null) __obj.updateDynamic("controlledAxis")(controlledAxis.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineDashStyle != null) __obj.updateDynamic("lineDashStyle")(lineDashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisResizeOptions]
  }
}

