package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotMacdParamsOptions extends js.Object {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The long period for indicator calculations.
    */
  var longPeriod: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The short period for indicator calculations.
    */
  var shortPeriod: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for signal calculations.
    */
  var signalPeriod: js.UndefOr[Double] = js.native
}
object PlotMacdParamsOptions {
  
  @scala.inline
  def apply(): PlotMacdParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMacdParamsOptions]
  }
  
  @scala.inline
  implicit class PlotMacdParamsOptionsOps[Self <: PlotMacdParamsOptions] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLongPeriod(value: Double): Self = this.set("longPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongPeriod: Self = this.set("longPeriod", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setShortPeriod(value: Double): Self = this.set("shortPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortPeriod: Self = this.set("shortPeriod", js.undefined)
    
    @scala.inline
    def setSignalPeriod(value: Double): Self = this.set("signalPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignalPeriod: Self = this.set("signalPeriod", js.undefined)
  }
}
