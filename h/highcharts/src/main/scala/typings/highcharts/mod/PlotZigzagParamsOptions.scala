package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotZigzagParamsOptions extends js.Object {
  /**
    * (Highstock) The threshold for the value change.
    *
    * For example deviation=1 means the indicator will ignore all price
    * movements less than 1%.
    */
  var deviation: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The point index which indicator calculations will base - high
    * value.
    *
    * For example using OHLC data, index=1 means the indicator will be
    * calculated using High values.
    */
  var highIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The point index which indicator calculations will base - low
    * value.
    *
    * For example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.
    */
  var lowIndex: js.UndefOr[Double] = js.undefined
}

object PlotZigzagParamsOptions {
  @scala.inline
  def apply(deviation: Int | Double = null, highIndex: Int | Double = null, lowIndex: Int | Double = null): PlotZigzagParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (deviation != null) __obj.updateDynamic("deviation")(deviation.asInstanceOf[js.Any])
    if (highIndex != null) __obj.updateDynamic("highIndex")(highIndex.asInstanceOf[js.Any])
    if (lowIndex != null) __obj.updateDynamic("lowIndex")(lowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotZigzagParamsOptions]
  }
}

