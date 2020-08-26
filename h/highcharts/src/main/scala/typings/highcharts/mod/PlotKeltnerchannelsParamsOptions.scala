package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotKeltnerchannelsParamsOptions extends js.Object {
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The ATR multiplier.
    */
  var multiplierATR: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The ATR period.
    */
  var periodATR: js.UndefOr[Double] = js.native
}

object PlotKeltnerchannelsParamsOptions {
  @scala.inline
  def apply(): PlotKeltnerchannelsParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsParamsOptions]
  }
  @scala.inline
  implicit class PlotKeltnerchannelsParamsOptionsOps[Self <: PlotKeltnerchannelsParamsOptions] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setMultiplierATR(value: Double): Self = this.set("multiplierATR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiplierATR: Self = this.set("multiplierATR", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setPeriodATR(value: Double): Self = this.set("periodATR", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodATR: Self = this.set("periodATR", js.undefined)
  }
  
}

