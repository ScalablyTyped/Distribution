package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBulletTargetOptions extends js.Object {
  /**
    * (Highcharts) The border color of the rectangle representing the target.
    * When not set, the point's border color is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) The border width of the rectangle representing the target.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The color of the rectangle representing the target. When not
    * set, point's color (if set in point's options - `color`) or zone of the
    * target value (if `zones` or `negativeColor` are set) or the same color as
    * the point has is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The height of the rectangle representing the target.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The width of the rectangle representing the target. Could be
    * set as a pixel value or as a percentage of a column width.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object PlotBulletTargetOptions {
  @scala.inline
  def apply(
    borderColor: ColorString = null,
    borderWidth: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    height: Int | Double = null,
    width: Double | String = null
  ): PlotBulletTargetOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBulletTargetOptions]
  }
}

