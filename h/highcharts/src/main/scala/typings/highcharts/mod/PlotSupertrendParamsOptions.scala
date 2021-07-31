package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSupertrendParamsOptions extends StObject {
  
  /**
    * (Highstock) Multiplier for Supertrend Indicator.
    */
  var multiplier: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for indicator Supertrend Indicator
    * calculations. This is the number of data points which are taken into
    * account for the indicator calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotSupertrendParamsOptions {
  
  @scala.inline
  def apply(): PlotSupertrendParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendParamsOptions]
  }
  
  @scala.inline
  implicit class PlotSupertrendParamsOptionsMutableBuilder[Self <: PlotSupertrendParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplier(value: Double): Self = StObject.set(x, "multiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplierUndefined: Self = StObject.set(x, "multiplier", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
