package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendBubbleLegendRangesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The color of the border for individual
    * range.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The color of the bubble for individual
    * range.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The color of the connector for
    * individual range.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Range size value, similar to bubble Z
    * data.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object LegendBubbleLegendRangesOptions {
  @scala.inline
  def apply(
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    connectorColor: ColorString | GradientColorObject | PatternObject = null,
    value: Int | Double = null
  ): LegendBubbleLegendRangesOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendBubbleLegendRangesOptions]
  }
}

