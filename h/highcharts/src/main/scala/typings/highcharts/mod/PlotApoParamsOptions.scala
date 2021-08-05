package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotApoParamsOptions extends StObject {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    *
    * By default index value used to be set to 0. Since Highstock 7 by default
    * index is set to 3 which means that the ema indicator will be calculated
    * using Close values.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Periods for Absolute Price Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.undefined
}
object PlotApoParamsOptions {
  
  inline def apply(): PlotApoParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotApoParamsOptions]
  }
  
  extension [Self <: PlotApoParamsOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriods(value: js.Array[Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
    
    inline def setPeriodsVarargs(value: Double*): Self = StObject.set(x, "periods", js.Array(value :_*))
  }
}
