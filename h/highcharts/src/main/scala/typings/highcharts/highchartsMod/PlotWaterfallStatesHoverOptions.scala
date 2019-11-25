package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWaterfallStatesHoverOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotWaterfallStatesHoverAnimationOptions] = js.undefined
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
    * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
    * series to visualize that the user hovers either the series itself or the
    * legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var lineWidthPlus: js.UndefOr[Double] = js.undefined
}

object PlotWaterfallStatesHoverOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotWaterfallStatesHoverAnimationOptions = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    brightness: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    lineWidthPlus: Int | Double = null
  ): PlotWaterfallStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWaterfallStatesHoverOptions]
  }
}

