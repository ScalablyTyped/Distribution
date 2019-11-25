package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleMarkerStatesHoverOptions extends js.Object {
  /**
    * (Highmaps) Animation when hovering over the marker.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highmaps) Enable or disable the point marker.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highmaps) The fill color of the marker in hover state. When `undefined`,
    * the series' or point's fillColor for normal state is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The color of the point marker's outline. When `undefined`, the
    * series' or point's lineColor for normal state is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The width of the point marker's outline. When `undefined`, the
    * series' or point's lineWidth for normal state is used.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The additional line width for a hovered point.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The radius of the point marker. In hover state, it defaults to
    * the normal state's radius + 2 as per the radiusPlus option.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The number of pixels to increase the radius of the hovered
    * point.
    */
  var radiusPlus: js.UndefOr[Double] = js.undefined
}

object PlotMapbubbleMarkerStatesHoverOptions {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: Int | Double = null,
    lineWidthPlus: Int | Double = null,
    radius: Int | Double = null,
    radiusPlus: Int | Double = null
  ): PlotMapbubbleMarkerStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusPlus != null) __obj.updateDynamic("radiusPlus")(radiusPlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapbubbleMarkerStatesHoverOptions]
  }
}

