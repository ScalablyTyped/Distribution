package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSupertrendParamsOptions extends js.Object {
  /**
    * (Highstock) Multiplier for Supertrend Indicator.
    */
  var multiplier: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The base period for indicator Supertrend Indicator
    * calculations. This is the number of data points which are taken into
    * account for the indicator calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotSupertrendParamsOptions {
  @scala.inline
  def apply(multiplier: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotSupertrendParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiplier)) __obj.updateDynamic("multiplier")(multiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSupertrendParamsOptions]
  }
}

