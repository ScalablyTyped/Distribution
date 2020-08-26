package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotMfiParamsOptions extends js.Object {
  /**
    * (Highstock) Number of maximum decimals that are used in MFI calculations.
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.native
}

object PlotMfiParamsOptions {
  @scala.inline
  def apply(): PlotMfiParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMfiParamsOptions]
  }
  @scala.inline
  implicit class PlotMfiParamsOptionsOps[Self <: PlotMfiParamsOptions] (val x: Self) extends AnyVal {
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
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setVolumeSeriesID(value: String): Self = this.set("volumeSeriesID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSeriesID: Self = this.set("volumeSeriesID", js.undefined)
  }
  
}

