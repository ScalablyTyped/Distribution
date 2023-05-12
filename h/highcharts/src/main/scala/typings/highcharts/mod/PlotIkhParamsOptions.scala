package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotIkhParamsOptions extends StObject {
  
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for Senkou Span B calculations
    */
  var periodSenkouSpanB: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for Tenkan calculations.
    */
  var periodTenkan: js.UndefOr[Double] = js.undefined
}
object PlotIkhParamsOptions {
  
  inline def apply(): PlotIkhParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotIkhParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotIkhParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodSenkouSpanB(value: Double): Self = StObject.set(x, "periodSenkouSpanB", value.asInstanceOf[js.Any])
    
    inline def setPeriodSenkouSpanBUndefined: Self = StObject.set(x, "periodSenkouSpanB", js.undefined)
    
    inline def setPeriodTenkan(value: Double): Self = StObject.set(x, "periodTenkan", value.asInstanceOf[js.Any])
    
    inline def setPeriodTenkanUndefined: Self = StObject.set(x, "periodTenkan", js.undefined)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
