package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleZonesOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Styled mode only. A custom class name for the
    * zone.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock) Defines the color of the series.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) A name for the dash style to use for the graph.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts, Highstock) Defines the fill color for the series (in area
    * type series)
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The value up to where the zone extends, if
    * undefined the zones stretches to the last value in the series.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object PlotPackedbubbleZonesOptions {
  @scala.inline
  def apply(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    dashStyle: DashStyleValue = null,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    value: Int | Double = null
  ): PlotPackedbubbleZonesOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleZonesOptions]
  }
}

