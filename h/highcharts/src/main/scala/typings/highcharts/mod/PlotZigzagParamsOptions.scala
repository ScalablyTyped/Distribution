package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotZigzagParamsOptions extends StObject {
  
  /**
    * (Highstock) The threshold for the value change.
    *
    * For example deviation=1 means the indicator will ignore all price
    * movements less than 1%.
    */
  var deviation: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The point index which indicator calculations will base - high
    * value.
    *
    * For example using OHLC data, index=1 means the indicator will be
    * calculated using High values.
    */
  var highIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The point index which indicator calculations will base - low
    * value.
    *
    * For example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.
    */
  var lowIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[String] = js.undefined
}
object PlotZigzagParamsOptions {
  
  inline def apply(): PlotZigzagParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotZigzagParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotZigzagParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setDeviation(value: Double): Self = StObject.set(x, "deviation", value.asInstanceOf[js.Any])
    
    inline def setDeviationUndefined: Self = StObject.set(x, "deviation", js.undefined)
    
    inline def setHighIndex(value: Double): Self = StObject.set(x, "highIndex", value.asInstanceOf[js.Any])
    
    inline def setHighIndexUndefined: Self = StObject.set(x, "highIndex", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLowIndex(value: Double): Self = StObject.set(x, "lowIndex", value.asInstanceOf[js.Any])
    
    inline def setLowIndexUndefined: Self = StObject.set(x, "lowIndex", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
