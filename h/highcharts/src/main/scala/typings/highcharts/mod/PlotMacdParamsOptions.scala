package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotMacdParamsOptions extends StObject {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The long period for indicator calculations.
    */
  var longPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The short period for indicator calculations.
    */
  var shortPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for signal calculations.
    */
  var signalPeriod: js.UndefOr[Double] = js.undefined
}
object PlotMacdParamsOptions {
  
  inline def apply(): PlotMacdParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMacdParamsOptions]
  }
  
  extension [Self <: PlotMacdParamsOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLongPeriod(value: Double): Self = StObject.set(x, "longPeriod", value.asInstanceOf[js.Any])
    
    inline def setLongPeriodUndefined: Self = StObject.set(x, "longPeriod", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setShortPeriod(value: Double): Self = StObject.set(x, "shortPeriod", value.asInstanceOf[js.Any])
    
    inline def setShortPeriodUndefined: Self = StObject.set(x, "shortPeriod", js.undefined)
    
    inline def setSignalPeriod(value: Double): Self = StObject.set(x, "signalPeriod", value.asInstanceOf[js.Any])
    
    inline def setSignalPeriodUndefined: Self = StObject.set(x, "signalPeriod", js.undefined)
  }
}
