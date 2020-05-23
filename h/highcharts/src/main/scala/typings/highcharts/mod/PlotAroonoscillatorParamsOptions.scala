package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonoscillatorParamsOptions extends js.Object {
  /**
    * (Highstock) Period for Aroon Oscillator
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotAroonoscillatorParamsOptions {
  @scala.inline
  def apply(period: js.UndefOr[Double] = js.undefined): PlotAroonoscillatorParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAroonoscillatorParamsOptions]
  }
}

