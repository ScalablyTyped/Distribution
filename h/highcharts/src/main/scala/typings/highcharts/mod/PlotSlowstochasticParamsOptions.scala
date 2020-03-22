package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSlowstochasticParamsOptions extends js.Object {
  /**
    * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
    */
  var periods: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
}

object PlotSlowstochasticParamsOptions {
  @scala.inline
  def apply(periods: js.Tuple3[Double, Double, Double] = null): PlotSlowstochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (periods != null) __obj.updateDynamic("periods")(periods.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSlowstochasticParamsOptions]
  }
}

