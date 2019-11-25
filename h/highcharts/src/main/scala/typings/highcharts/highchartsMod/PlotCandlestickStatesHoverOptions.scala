package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCandlestickStatesHoverOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotCandlestickStatesHoverAnimationOptions] = js.undefined
  /**
    * (Highcharts, Gantt) A specific border color for the hovered point.
    * Defaults to inherit the normal state border color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) How much to brighten the point on
    * interaction. Requires the main color to be defined in hex or rgb(a)
    * format.
    *
    * In styled mode, the hover brightening is by default replaced with a
    * fill-opacity set in the `.highcharts-point:hover` rule.
    */
  var brightness: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Gantt) A specific color for the hovered point.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) Enable separate styles for the hovered series to visualize
    * that the user hovers either the series itself or the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The pixel width of the line/border around the candlestick.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotCandlestickStatesHoverOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotCandlestickStatesHoverAnimationOptions = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    brightness: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    lineWidth: Int | Double = null
  ): PlotCandlestickStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCandlestickStatesHoverOptions]
  }
}

