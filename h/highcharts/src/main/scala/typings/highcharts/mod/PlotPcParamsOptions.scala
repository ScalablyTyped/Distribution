package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPcParamsOptions extends StObject {
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotPcParamsOptions {
  
  inline def apply(): PlotPcParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcParamsOptions]
  }
  
  extension [Self <: PlotPcParamsOptions](x: Self) {
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
