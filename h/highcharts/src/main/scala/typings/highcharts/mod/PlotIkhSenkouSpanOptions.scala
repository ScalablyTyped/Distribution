package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotIkhSenkouSpanOptions extends js.Object {
  /**
    * (Highstock) Color of the area between Senkou Span A and B, when Senkou
    * Span A is above Senkou Span B. Note that if a `style.fill` is defined,
    * the `color` takes precedence and the `style.fill` is ignored.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) Color of the area between Senkou Span A and B, when Senkou
    * Span A is under Senkou Span B.
    */
  var negativeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  var styles: js.UndefOr[js.Any] = js.native
}

object PlotIkhSenkouSpanOptions {
  @scala.inline
  def apply(): PlotIkhSenkouSpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhSenkouSpanOptions]
  }
  @scala.inline
  implicit class PlotIkhSenkouSpanOptionsOps[Self <: PlotIkhSenkouSpanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setNegativeColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

