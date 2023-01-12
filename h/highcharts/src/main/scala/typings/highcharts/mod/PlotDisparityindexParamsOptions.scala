package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotDisparityindexParamsOptions extends StObject {
  
  /**
    * (Highstock) The average used to calculate the Disparity Index indicator.
    * By default it uses SMA, with EMA as an option. To use other averages,
    * e.g. TEMA, the `stock/indicators/tema.js` file needs to be loaded.
    *
    * If value is different than `ema`, `dema`, `tema` or `wma`, then sma is
    * used.
    */
  var average: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotDisparityindexParamsOptions {
  
  inline def apply(): PlotDisparityindexParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotDisparityindexParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotDisparityindexParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: String): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
