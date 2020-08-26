package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotVbpParamsOptions extends js.Object {
  /**
    * (Highstock) The number of price zones.
    */
  var ranges: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.native
}

object PlotVbpParamsOptions {
  @scala.inline
  def apply(): PlotVbpParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpParamsOptions]
  }
  @scala.inline
  implicit class PlotVbpParamsOptionsOps[Self <: PlotVbpParamsOptions] (val x: Self) extends AnyVal {
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
    def setRanges(value: Double): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setVolumeSeriesID(value: String): Self = this.set("volumeSeriesID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSeriesID: Self = this.set("volumeSeriesID", js.undefined)
  }
  
}

