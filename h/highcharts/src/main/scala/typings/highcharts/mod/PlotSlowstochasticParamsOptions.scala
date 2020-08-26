package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSlowstochasticParamsOptions extends js.Object {
  /**
    * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
    */
  var periods: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
}

object PlotSlowstochasticParamsOptions {
  @scala.inline
  def apply(): PlotSlowstochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticParamsOptions]
  }
  @scala.inline
  implicit class PlotSlowstochasticParamsOptionsOps[Self <: PlotSlowstochasticParamsOptions] (val x: Self) extends AnyVal {
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
    def setPeriods(value: js.Tuple3[Double, Double, Double]): Self = this.set("periods", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriods: Self = this.set("periods", js.undefined)
  }
  
}

