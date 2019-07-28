package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleStatesHoverMarkerStatesSelectOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Enable or disable visible feedback for selection.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The fill color of the point marker.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The radius of the point marker. In hover state,
    * it defaults to the normal state's radius + 2.
    */
  var radius: js.UndefOr[Double] = js.undefined
}

object PlotPackedbubbleStatesHoverMarkerStatesSelectOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    lineColor: ColorString = null,
    lineWidth: Int | Double = null,
    radius: Int | Double = null
  ): PlotPackedbubbleStatesHoverMarkerStatesSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleStatesHoverMarkerStatesSelectOptions]
  }
}

