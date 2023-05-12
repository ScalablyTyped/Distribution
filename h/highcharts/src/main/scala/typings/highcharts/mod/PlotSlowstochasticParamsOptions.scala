package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSlowstochasticParamsOptions extends StObject {
  
  var index: js.UndefOr[String] = js.undefined
  
  var period: js.UndefOr[String] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotSlowstochasticParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriods(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
  }
}
