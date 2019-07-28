package typings.highcharts.highchartsMod

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
  def apply(period: Int | Double = null): PlotWilliamsrParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWilliamsrParamsOptions]
  }
}

