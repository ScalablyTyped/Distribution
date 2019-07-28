package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStochasticParamsOptions extends js.Object {
  /**
    * (Highstock) Periods for Stochastic oscillator: [%K, %D].
    */
  var periods: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object PlotStochasticParamsOptions {
  @scala.inline
  def apply(periods: js.Tuple2[Double, Double] = null): PlotStochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (periods != null) __obj.updateDynamic("periods")(periods)
    __obj.asInstanceOf[PlotStochasticParamsOptions]
  }
}

