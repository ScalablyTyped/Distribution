package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWilliamsrParamsOptions extends js.Object {
  /**
    * (Highstock) Period for Williams %R oscillator
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotWilliamsrParamsOptions {
  @scala.inline
  def apply(period: js.UndefOr[Double] = js.undefined): PlotWilliamsrParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWilliamsrParamsOptions]
  }
}

