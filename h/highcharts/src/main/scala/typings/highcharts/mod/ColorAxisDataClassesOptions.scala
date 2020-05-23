package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAxisDataClassesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The color of each data class. If not
    * set, the color is pulled from the global or chart-specific colors array.
    * In styled mode, this option is ignored. Instead, use colors defined in
    * CSS.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The start of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The name of the data class as it
    * appears in the legend. If no name is given, it is automatically created
    * based on the `from` and `to` values. For full programmatic control,
    * legend.labelFormatter can be used. In the formatter, `this.from` and
    * `this.to` can be accessed.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The end of the value range that the
    * data class represents, relating to the point value.
    *
    * The range of each `dataClass` is closed in both ends, but can be
    * overridden by the next `dataClass`.
    */
  var to: js.UndefOr[Double] = js.undefined
}

object ColorAxisDataClassesOptions {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject = null,
    from: js.UndefOr[Double] = js.undefined,
    name: String = null,
    to: js.UndefOr[Double] = js.undefined
  ): ColorAxisDataClassesOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorAxisDataClassesOptions]
  }
}

