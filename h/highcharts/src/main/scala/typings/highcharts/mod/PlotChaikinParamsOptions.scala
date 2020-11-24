package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotChaikinParamsOptions extends js.Object {
  
  /**
    * (Highstock) Periods for Chaikin Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.native
}
object PlotChaikinParamsOptions {
  
  @scala.inline
  def apply(): PlotChaikinParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotChaikinParamsOptions]
  }
  
  @scala.inline
  implicit class PlotChaikinParamsOptionsOps[Self <: PlotChaikinParamsOptions] (val x: Self) extends AnyVal {
    
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
    def setPeriodsVarargs(value: Double*): Self = this.set("periods", js.Array(value :_*))
    
    @scala.inline
    def setPeriods(value: js.Array[Double]): Self = this.set("periods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriods: Self = this.set("periods", js.undefined)
    
    @scala.inline
    def setVolumeSeriesID(value: String): Self = this.set("volumeSeriesID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSeriesID: Self = this.set("volumeSeriesID", js.undefined)
  }
}
