package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhSenkouSpanOptions extends js.Object {
  /**
    * (Highstock) Color of the area between Senkou Span A and B, when Senkou
    * Span A is above Senkou Span B. Note that if a `style.fill` is defined,
    * the `color` takes precedence and the `style.fill` is ignored.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) Color of the area between Senkou Span A and B, when Senkou
    * Span A is under Senkou Span B.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object PlotIkhSenkouSpanOptions {
  @scala.inline
  def apply(
    color: ColorString | GradientColorObject | PatternObject = null,
    negativeColor: ColorString | GradientColorObject | PatternObject = null,
    styles: js.Any = null
  ): PlotIkhSenkouSpanOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhSenkouSpanOptions]
  }
}

