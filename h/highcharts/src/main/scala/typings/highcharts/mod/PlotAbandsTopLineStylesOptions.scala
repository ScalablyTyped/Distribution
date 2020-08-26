package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotAbandsTopLineStylesOptions extends js.Object {
  /**
    * (Highstock) Pixel width of the line.
    */
  var lineWidth: js.UndefOr[Double] = js.native
}

object PlotAbandsTopLineStylesOptions {
  @scala.inline
  def apply(): PlotAbandsTopLineStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAbandsTopLineStylesOptions]
  }
  @scala.inline
  implicit class PlotAbandsTopLineStylesOptionsOps[Self <: PlotAbandsTopLineStylesOptions] (val x: Self) extends AnyVal {
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
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
  }
  
}

