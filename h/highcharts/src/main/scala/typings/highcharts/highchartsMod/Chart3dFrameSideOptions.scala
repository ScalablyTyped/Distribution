package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart3dFrameSideOptions extends js.Object {
  /**
    * (Highcharts) The color of the panel.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The thickness of the panel.
    */
  var size: js.UndefOr[Double] = js.undefined
}

object Chart3dFrameSideOptions {
  @scala.inline
  def apply(color: ColorString | GradientColorObject | PatternObject = null, size: Int | Double = null): Chart3dFrameSideOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart3dFrameSideOptions]
  }
}

