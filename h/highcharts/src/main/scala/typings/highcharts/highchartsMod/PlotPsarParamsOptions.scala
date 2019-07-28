package typings.highcharts.highchartsMod

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
    decimals: Int | Double = null,
    increment: Int | Double = null,
    index: Int | Double = null,
    initialAccelerationFactor: Int | Double = null,
    maxAccelerationFactor: Int | Double = null
  ): PlotPsarParamsOptions = {
    val __obj = js.Dynamic.literal()
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (initialAccelerationFactor != null) __obj.updateDynamic("initialAccelerationFactor")(initialAccelerationFactor.asInstanceOf[js.Any])
    if (maxAccelerationFactor != null) __obj.updateDynamic("maxAccelerationFactor")(maxAccelerationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPsarParamsOptions]
  }
}

