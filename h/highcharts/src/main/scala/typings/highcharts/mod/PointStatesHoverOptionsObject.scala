package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStatesHoverOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) Animation when hovering over the marker.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
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
    * (Highcharts, Highmaps) Set the marker's fixed height on hover state.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The number of pixels to increase the height of
    * the hovered point.
    */
  var heightPlus: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's lineColor for normal state is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
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
  /**
    * (Highcharts, Highmaps) Set the marker's fixed width on hover state.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The number of pixels to increase the width of the
    * hovered point.
    */
  var widthPlus: js.UndefOr[Double] = js.undefined
}

object PointStatesHoverOptionsObject {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    height: js.UndefOr[Double] = js.undefined,
    heightPlus: js.UndefOr[Double] = js.undefined,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    lineWidthPlus: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    radiusPlus: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    widthPlus: js.UndefOr[Double] = js.undefined
  ): PointStatesHoverOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPlus)) __obj.updateDynamic("heightPlus")(heightPlus.get.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidthPlus)) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusPlus)) __obj.updateDynamic("radiusPlus")(radiusPlus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPlus)) __obj.updateDynamic("widthPlus")(widthPlus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStatesHoverOptionsObject]
  }
}

