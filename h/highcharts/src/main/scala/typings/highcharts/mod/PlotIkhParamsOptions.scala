package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotIkhParamsOptions extends js.Object {
  
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
    * (Highstock) The base period for Senkou Span B calculations
    */
  var periodSenkouSpanB: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for Tenkan calculations.
    */
  var periodTenkan: js.UndefOr[Double] = js.native
}
object PlotIkhParamsOptions {
  
  @scala.inline
  def apply(): PlotIkhParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhParamsOptions]
  }
  
  @scala.inline
  implicit class PlotIkhParamsOptionsOps[Self <: PlotIkhParamsOptions] (val x: Self) extends AnyVal {
    
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
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPeriodSenkouSpanB(value: Double): Self = this.set("periodSenkouSpanB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodSenkouSpanB: Self = this.set("periodSenkouSpanB", js.undefined)
    
    @scala.inline
    def setPeriodTenkan(value: Double): Self = this.set("periodTenkan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodTenkan: Self = this.set("periodTenkan", js.undefined)
  }
}
