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
  def apply(
    deviation: js.UndefOr[Double] = js.undefined,
    highIndex: js.UndefOr[Double] = js.undefined,
    lowIndex: js.UndefOr[Double] = js.undefined
  ): PlotZigzagParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviation)) __obj.updateDynamic("deviation")(deviation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highIndex)) __obj.updateDynamic("highIndex")(highIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowIndex)) __obj.updateDynamic("lowIndex")(lowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotZigzagParamsOptions]
  }
}

