package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotMacdParamsOptions extends StObject {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The long period for indicator calculations.
    */
  var longPeriod: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The short period for indicator calculations.
    */
  var shortPeriod: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for signal calculations.
    */
  var signalPeriod: js.UndefOr[Double] = js.native
}
object PlotMacdParamsOptions {
  
  @scala.inline
  def apply(): PlotMacdParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotMacdParamsOptions]
  }
  
  @scala.inline
  implicit class PlotMacdParamsOptionsMutableBuilder[Self <: PlotMacdParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLongPeriod(value: Double): Self = StObject.set(x, "longPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongPeriodUndefined: Self = StObject.set(x, "longPeriod", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setShortPeriod(value: Double): Self = StObject.set(x, "shortPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortPeriodUndefined: Self = StObject.set(x, "shortPeriod", js.undefined)
    
    @scala.inline
    def setSignalPeriod(value: Double): Self = StObject.set(x, "signalPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalPeriodUndefined: Self = StObject.set(x, "signalPeriod", js.undefined)
  }
}
