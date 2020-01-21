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
  def apply(multiplier: Int | Double = null, period: Int | Double = null): PlotSupertrendParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (multiplier != null) __obj.updateDynamic("multiplier")(multiplier.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSupertrendParamsOptions]
  }
}

