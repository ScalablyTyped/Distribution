package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPcTopLineStylesOptions extends js.Object {
  /**
    * (Highstock) Color of the top line. If not set, it's inherited from
    * plotOptions.pc.color.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.native
}

object PlotPcTopLineStylesOptions {
  @scala.inline
  def apply(): PlotPcTopLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcTopLineStylesOptions]
  }
  @scala.inline
  implicit class PlotPcTopLineStylesOptionsOps[Self <: PlotPcTopLineStylesOptions] (val x: Self) extends AnyVal {
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
    def setLineColor(value: ColorString): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
  }
  
}

