package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPsarParamsOptions extends js.Object {
  /**
    * (Highstock) Number of maximum decimals that are used in PSAR
    * calculations.
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Acceleration factor increases by increment each time the
    * extreme point makes a new high.
    */
  var increment: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Index from which PSAR is starting calculation
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The initial value for acceleration factor. Acceleration
    * factor is starting with this value and increases by specified increment
    * each time the extreme point makes a new high. AF can reach a maximum of
    * maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var initialAccelerationFactor: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The Maximum value for acceleration factor. AF can reach a
    * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var maxAccelerationFactor: js.UndefOr[Double] = js.native
}

object PlotPsarParamsOptions {
  @scala.inline
  def apply(): PlotPsarParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPsarParamsOptions]
  }
  @scala.inline
  implicit class PlotPsarParamsOptionsOps[Self <: PlotPsarParamsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setInitialAccelerationFactor(value: Double): Self = this.set("initialAccelerationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialAccelerationFactor: Self = this.set("initialAccelerationFactor", js.undefined)
    @scala.inline
    def setMaxAccelerationFactor(value: Double): Self = this.set("maxAccelerationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAccelerationFactor: Self = this.set("maxAccelerationFactor", js.undefined)
  }
  
}

