package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotKeltnerchannelsParamsOptions extends StObject {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The ATR multiplier.
    */
  var multiplierATR: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The ATR period.
    */
  var periodATR: js.UndefOr[Double] = js.undefined
}
object PlotKeltnerchannelsParamsOptions {
  
  inline def apply(): PlotKeltnerchannelsParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKeltnerchannelsParamsOptions]
  }
  
  extension [Self <: PlotKeltnerchannelsParamsOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMultiplierATR(value: Double): Self = StObject.set(x, "multiplierATR", value.asInstanceOf[js.Any])
    
    inline def setMultiplierATRUndefined: Self = StObject.set(x, "multiplierATR", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodATR(value: Double): Self = StObject.set(x, "periodATR", value.asInstanceOf[js.Any])
    
    inline def setPeriodATRUndefined: Self = StObject.set(x, "periodATR", js.undefined)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
