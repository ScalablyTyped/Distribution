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
  
  inline def apply(): PlotWilliamsrParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWilliamsrParamsOptions]
  }
  
  extension [Self <: PlotWilliamsrParamsOptions](x: Self) {
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
