package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStatesSelectOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock) Enable or disable visible feedback for selection.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The fill color of the point marker.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highmaps) Set the marker's fixed height on select state.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The number of pixels to increase the height of
    * the hovered point.
    */
  var heightPlus: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The radius of the point marker. In hover state,
    * it defaults to the normal state's radius + 2.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) Set the marker's fixed width on select state.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The number of pixels to increase the width of the
    * hovered point.
    */
  var widthPlus: js.UndefOr[Double] = js.undefined
}

object PointStatesSelectOptionsObject {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    height: js.UndefOr[Double] = js.undefined,
    heightPlus: js.UndefOr[Double] = js.undefined,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    widthPlus: js.UndefOr[Double] = js.undefined
  ): PointStatesSelectOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPlus)) __obj.updateDynamic("heightPlus")(heightPlus.get.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPlus)) __obj.updateDynamic("widthPlus")(widthPlus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointStatesSelectOptionsObject]
  }
}

