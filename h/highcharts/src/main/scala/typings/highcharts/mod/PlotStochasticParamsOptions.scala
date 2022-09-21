package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotStochasticParamsOptions extends StObject {
  
  var index: js.UndefOr[String] = js.undefined
  
  var period: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Periods for Stochastic oscillator: [%K, %D].
    */
  var periods: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object PlotStochasticParamsOptions {
  
  inline def apply(): PlotStochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStochasticParamsOptions]
  }
  
  extension [Self <: PlotStochasticParamsOptions](x: Self) {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriods(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
  }
}
