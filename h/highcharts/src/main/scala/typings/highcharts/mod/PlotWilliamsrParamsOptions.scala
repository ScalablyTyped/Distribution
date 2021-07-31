package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotWilliamsrParamsOptions extends StObject {
  
  /**
    * (Highstock) Period for Williams %R oscillator
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotWilliamsrParamsOptions {
  
  @scala.inline
  def apply(): PlotWilliamsrParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWilliamsrParamsOptions]
  }
  
  @scala.inline
  implicit class PlotWilliamsrParamsOptionsMutableBuilder[Self <: PlotWilliamsrParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
