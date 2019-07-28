package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhSenkouSpanStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the area between Senkou Span A and B.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
}

object PlotIkhSenkouSpanStylesOptions {
  @scala.inline
  def apply(fill: ColorString | GradientColorObject | PatternObject = null): PlotIkhSenkouSpanStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhSenkouSpanStylesOptions]
  }
}

