package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPriceenvelopesParamsOptions extends js.Object {
  
  /**
    * (Highstock) Percentage below the moving average that should be displayed.
    * 0.1 means 90%. Relative to the calculated value.
    */
  var bottomBand: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Percentage above the moving average that should be displayed.
    * 0.1 means 110%. Relative to the calculated value.
    */
  var topBand: js.UndefOr[Double] = js.native
}
object PlotPriceenvelopesParamsOptions {
  
  @scala.inline
  def apply(): PlotPriceenvelopesParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesParamsOptions]
  }
  
  @scala.inline
  implicit class PlotPriceenvelopesParamsOptionsOps[Self <: PlotPriceenvelopesParamsOptions] (val x: Self) extends AnyVal {
    
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
    def setBottomBand(value: Double): Self = this.set("bottomBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomBand: Self = this.set("bottomBand", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setTopBand(value: Double): Self = this.set("topBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopBand: Self = this.set("topBand", js.undefined)
  }
}
