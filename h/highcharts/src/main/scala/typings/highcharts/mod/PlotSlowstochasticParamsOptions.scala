package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSlowstochasticParamsOptions extends StObject {
  
  /**
    * (Highstock) Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].
    */
  var periods: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
}
object PlotSlowstochasticParamsOptions {
  
  inline def apply(): PlotSlowstochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSlowstochasticParamsOptions]
  }
  
  extension [Self <: PlotSlowstochasticParamsOptions](x: Self) {
    
    inline def setPeriods(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
  }
}
