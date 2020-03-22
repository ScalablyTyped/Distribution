package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesStatesHoverOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highmaps) The border color of the point in this state.
    */
  var borderColor: js.UndefOr[String | ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The relative brightness of the point when hovered, relative to
    * the normal point color.
    */
  var brightness: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The color of the shape in this state.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The additional connector line width for a hovered
    * point.
    */
  var connectorWidthPlus: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Enable separate styles for the hovered series to visualize
    * that the user hovers either the series itself or the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The fill or background color of the flag.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
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
  var halo: js.UndefOr[SeriesStatesHoverHaloOptionsObject | Null] = js.undefined
  /**
    * (Highstock) The color of the line/border of the flag.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
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
    * (Highcharts, Highstock, Gantt) Opacity for the links between nodes in the
    * sankey diagram in hover mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The opacity of a point in treemap. When a point has
    * children, the visibility of the children is determined by the opacity.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The shadow option for hovered state.
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
}

object SeriesStatesHoverOptionsObject {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    borderColor: String | ColorString | GradientColorObject | PatternObject = null,
    borderWidth: Int | Double = null,
    brightness: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    connectorWidthPlus: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    halo: SeriesStatesHoverHaloOptionsObject = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: Int | Double = null,
    lineWidthPlus: Int | Double = null,
    linkOpacity: Int | Double = null,
    opacity: Int | Double = null,
    shadow: js.UndefOr[Boolean] = js.undefined
  ): SeriesStatesHoverOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (connectorWidthPlus != null) __obj.updateDynamic("connectorWidthPlus")(connectorWidthPlus.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (halo != null) __obj.updateDynamic("halo")(halo.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    if (linkOpacity != null) __obj.updateDynamic("linkOpacity")(linkOpacity.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesStatesHoverOptionsObject]
  }
}

