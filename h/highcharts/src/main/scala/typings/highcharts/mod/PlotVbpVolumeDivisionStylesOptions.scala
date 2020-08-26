package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotVbpVolumeDivisionStylesOptions extends js.Object {
  /**
    * (Highstock) Color of negative volume bars.
    */
  var negativeColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock) Color of positive volume bars.
    */
  var positiveColor: js.UndefOr[ColorString] = js.native
}

object PlotVbpVolumeDivisionStylesOptions {
  @scala.inline
  def apply(): PlotVbpVolumeDivisionStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpVolumeDivisionStylesOptions]
  }
  @scala.inline
  implicit class PlotVbpVolumeDivisionStylesOptionsOps[Self <: PlotVbpVolumeDivisionStylesOptions] (val x: Self) extends AnyVal {
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
    def setNegativeColor(value: ColorString): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    @scala.inline
    def setPositiveColor(value: ColorString): Self = this.set("positiveColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveColor: Self = this.set("positiveColor", js.undefined)
  }
  
}

