package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGaugePivotOptions extends js.Object {
  /**
    * (Highcharts) The background color or fill of the pivot.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The border or stroke color of the pivot. In able to change
    * this, the borderWidth must also be set to something other than the
    * default 0.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) The border or stroke width of the pivot.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The pixel radius of the pivot.
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object PlotGaugePivotOptions {
  @scala.inline
  def apply(
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString = null,
    borderWidth: Int | Double = null,
    radius: Int | Double = null
  ): PlotGaugePivotOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotGaugePivotOptions]
  }
}

