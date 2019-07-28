package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.auto
import typings.highcharts.highchartsStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart3dFrameBackOptions extends js.Object {
  /**
    * (Highcharts) The color of the panel.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The thickness of the panel.
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Whether to display the frame. Possible values are `true`,
    * `false`, `"auto"` to display only the frames behind the data, and
    * `"default"` to display faces behind the data based on the axis layout,
    * ignoring the point of view.
    */
  var visible: js.UndefOr[auto | default | Boolean] = js.undefined
}

object Chart3dFrameBackOptions {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject = null,
    size: Int | Double = null,
    visible: auto | default | Boolean = null
  ): Chart3dFrameBackOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart3dFrameBackOptions]
  }
}

