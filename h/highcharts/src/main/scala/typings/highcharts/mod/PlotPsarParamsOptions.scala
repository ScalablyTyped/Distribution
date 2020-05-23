package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPsarParamsOptions extends js.Object {
  /**
    * (Highstock) Number of maximum decimals that are used in PSAR
    * calculations.
    */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Acceleration factor increases by increment each time the
    * extreme point makes a new high.
    */
  var increment: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Index from which PSAR is starting calculation
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The initial value for acceleration factor. Acceleration
    * factor is starting with this value and increases by specified increment
    * each time the extreme point makes a new high. AF can reach a maximum of
    * maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var initialAccelerationFactor: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The Maximum value for acceleration factor. AF can reach a
    * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var maxAccelerationFactor: js.UndefOr[Double] = js.undefined
}

object PlotPsarParamsOptions {
  @scala.inline
  def apply(
    decimals: js.UndefOr[Double] = js.undefined,
    increment: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    initialAccelerationFactor: js.UndefOr[Double] = js.undefined,
    maxAccelerationFactor: js.UndefOr[Double] = js.undefined
  ): PlotPsarParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialAccelerationFactor)) __obj.updateDynamic("initialAccelerationFactor")(initialAccelerationFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAccelerationFactor)) __obj.updateDynamic("maxAccelerationFactor")(maxAccelerationFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPsarParamsOptions]
  }
}

