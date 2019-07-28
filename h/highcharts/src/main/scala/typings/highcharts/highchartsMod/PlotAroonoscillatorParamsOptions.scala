package typings.highcharts.highchartsMod

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
  def apply(period: Int | Double = null): PlotAroonoscillatorParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAroonoscillatorParamsOptions]
  }
}

