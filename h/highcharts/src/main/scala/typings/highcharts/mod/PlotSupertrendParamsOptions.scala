package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotSupertrendParamsOptions extends js.Object {
  
  /**
    * (Highstock) Multiplier for Supertrend Indicator.
    */
  var multiplier: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for indicator Supertrend Indicator
    * calculations. This is the number of data points which are taken into
    * account for the indicator calculations.
    */
  var period: js.UndefOr[Double] = js.native
}
object PlotSupertrendParamsOptions {
  
  @scala.inline
  def apply(): PlotSupertrendParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendParamsOptions]
  }
  
  @scala.inline
  implicit class PlotSupertrendParamsOptionsOps[Self <: PlotSupertrendParamsOptions] (val x: Self) extends AnyVal {
    
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
    def setMultiplier(value: Double): Self = this.set("multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplier: Self = this.set("multiplier", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
