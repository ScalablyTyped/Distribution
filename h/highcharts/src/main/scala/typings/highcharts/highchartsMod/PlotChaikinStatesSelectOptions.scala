package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotChaikinStatesSelectOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[PlotChaikinStatesSelectAnimationOptions] = js.undefined
  /**
    * (Highmaps) The border color of the point in this state.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The color of the shape in this state.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) Enable separate styles for the hovered series to visualize
    * that the user hovers either the series itself or the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Options for the halo appearing around the hovered
    * point in line-type series as well as outside the hovered slice in pie
    * charts. By default the halo is filled by the current point or series
    * color with an opacity of 0.25\. The halo can be disabled by setting the
    * `halo` option to `null`.
    *
    * In styled mode, the halo is styled with the `.highcharts-halo` class,
    * with colors inherited from `.highcharts-color-{n}`.
    */
  var halo: js.UndefOr[PlotChaikinStatesSelectHaloOptions | Null] = js.undefined
  /**
    * (Highcharts, Highstock) Pixel width of the graph line. By default this
    * property is undefined, and the `lineWidthPlus` property dictates how much
    * to increase the linewidth from normal state.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The additional line width for the graph of a
    * hovered series.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) In Highcharts 1.0, the appearance of all markers
    * belonging to the hovered series. For settings on the hover state of the
    * individual point, see marker.states.hover.
    */
  var marker: js.UndefOr[PlotChaikinStatesSelectMarkerOptions] = js.undefined
}

object PlotChaikinStatesSelectOptions {
  @scala.inline
  def apply(
    animation: PlotChaikinStatesSelectAnimationOptions = null,
    borderColor: ColorString = null,
    borderWidth: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    halo: PlotChaikinStatesSelectHaloOptions = null,
    lineWidth: Int | Double = null,
    lineWidthPlus: Int | Double = null,
    marker: PlotChaikinStatesSelectMarkerOptions = null
  ): PlotChaikinStatesSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (halo != null) __obj.updateDynamic("halo")(halo)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[PlotChaikinStatesSelectOptions]
  }
}

