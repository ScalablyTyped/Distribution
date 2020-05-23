package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGaugeDialOptions extends js.Object {
  /**
    * (Highcharts) The background or fill color of the gauge's dial.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The length of the dial's base part, relative to the total
    * radius or length of the dial.
    */
  var baseLength: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The pixel width of the base of the gauge dial. The base is
    * the part closest to the pivot, defined by baseLength.
    */
  var baseWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The border color or stroke of the gauge's dial. By default,
    * the borderWidth is 0, so this must be set in addition to a custom border
    * color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The width of the gauge dial border in pixels.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The radius or length of the dial, in percentages relative to
    * the radius of the gauge itself.
    */
  var radius: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The length of the dial's rear end, the part that extends out
    * on the other side of the pivot. Relative to the dial's length.
    */
  var rearLength: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The width of the top of the dial, closest to the perimeter.
    * The pivot narrows in from the base to the top.
    */
  var topWidth: js.UndefOr[Double] = js.undefined
}

object PlotGaugeDialOptions {
  @scala.inline
  def apply(
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    baseLength: String = null,
    baseWidth: js.UndefOr[Double] = js.undefined,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    radius: String = null,
    rearLength: String = null,
    topWidth: js.UndefOr[Double] = js.undefined
  ): PlotGaugeDialOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (baseLength != null) __obj.updateDynamic("baseLength")(baseLength.asInstanceOf[js.Any])
    if (!js.isUndefined(baseWidth)) __obj.updateDynamic("baseWidth")(baseWidth.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rearLength != null) __obj.updateDynamic("rearLength")(rearLength.asInstanceOf[js.Any])
    if (!js.isUndefined(topWidth)) __obj.updateDynamic("topWidth")(topWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotGaugeDialOptions]
  }
}

