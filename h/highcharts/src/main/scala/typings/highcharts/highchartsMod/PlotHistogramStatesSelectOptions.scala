package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotHistogramStatesSelectOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[PlotHistogramStatesSelectAnimationOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A specific border color for the selected
    * point.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A specific color for the selected point.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
    * series to visualize that the user hovers either the series itself or the
    * legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotHistogramStatesSelectOptions {
  @scala.inline
  def apply(
    animation: PlotHistogramStatesSelectAnimationOptions = null,
    borderColor: ColorString = null,
    borderWidth: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): PlotHistogramStatesSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[PlotHistogramStatesSelectOptions]
  }
}

