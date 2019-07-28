package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotChaikinStatesSelectMarkerStatesHoverOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation when hovering over the marker.
    */
  var animation: js.UndefOr[
    Boolean | AnimationOptionsObject | PlotChaikinStatesSelectMarkerStatesHoverAnimationOptions
  ] = js.undefined
  /**
    * (Highcharts, Highstock) Enable or disable the point marker.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The fill color of the marker in hover state. When
    * `undefined`, the series' or point's fillColor for normal state is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's lineColor for normal state is used.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock) The width of the point marker's outline. When
    * `undefined`, the series' or point's lineWidth for normal state is used.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The additional line width for a hovered point.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The radius of the point marker. In hover state,
    * it defaults to the normal state's radius + 2 as per the radiusPlus
    * option.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The number of pixels to increase the radius of
    * the hovered point.
    */
  var radiusPlus: js.UndefOr[Double] = js.undefined
}

object PlotChaikinStatesSelectMarkerStatesHoverOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject | PlotChaikinStatesSelectMarkerStatesHoverAnimationOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    lineWidthPlus: Int | Double = null,
    radius: Int | Double = null,
    radiusPlus: Int | Double = null
  ): PlotChaikinStatesSelectMarkerStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusPlus != null) __obj.updateDynamic("radiusPlus")(radiusPlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotChaikinStatesSelectMarkerStatesHoverOptions]
  }
}

