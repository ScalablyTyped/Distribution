package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationButtonOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
    * the button.
    */
  var symbolFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
    * or line.
    */
  var symbolStroke: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
    * symbol on the button.
    */
  var symbolStrokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
    * individual button.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
    * button theme. The object accepts SVG properties like `stroke-width`,
    * `stroke` and `fill`. Tri-state button styles are supported by the
    * `states.hover` and `states.select` objects.
    */
  var theme: js.UndefOr[NavigationButtonThemeOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * button's position relative to its `verticalAlign`.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigationButtonOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    symbolFill: ColorString | GradientColorObject | PatternObject = null,
    symbolStroke: ColorString = null,
    symbolStrokeWidth: Int | Double = null,
    text: String = null,
    theme: NavigationButtonThemeOptions = null,
    y: Int | Double = null
  ): NavigationButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (symbolFill != null) __obj.updateDynamic("symbolFill")(symbolFill.asInstanceOf[js.Any])
    if (symbolStroke != null) __obj.updateDynamic("symbolStroke")(symbolStroke)
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationButtonOptions]
  }
}

