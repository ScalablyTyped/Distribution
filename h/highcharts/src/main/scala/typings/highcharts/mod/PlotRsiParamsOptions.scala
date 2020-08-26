package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotRsiParamsOptions extends js.Object {
  /**
    * (Highstock) Number of maximum decimals that are used in RSI calculations.
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
}

object PlotRsiParamsOptions {
  @scala.inline
  def apply(): PlotRsiParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotRsiParamsOptions]
  }
  @scala.inline
  implicit class PlotRsiParamsOptionsOps[Self <: PlotRsiParamsOptions] (val x: Self) extends AnyVal {
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
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
  
}

