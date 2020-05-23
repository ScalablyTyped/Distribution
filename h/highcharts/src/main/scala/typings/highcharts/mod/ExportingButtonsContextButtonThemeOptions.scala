package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportingButtonsContextButtonThemeOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The default fill exists only to
    * capture hover events.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Padding for the button.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default stroke for the buttons.
    */
  var stroke: js.UndefOr[ColorString] = js.undefined
}

object ExportingButtonsContextButtonThemeOptions {
  @scala.inline
  def apply(
    fill: ColorString | GradientColorObject | PatternObject = null,
    padding: js.UndefOr[Double] = js.undefined,
    stroke: ColorString = null
  ): ExportingButtonsContextButtonThemeOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportingButtonsContextButtonThemeOptions]
  }
}

