package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotChaikinParamsOptions extends StObject {
  
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Parameter used indirectly for calculating the `AD` indicator.
    * Decides about the number of data points that are taken into account for
    * the indicator calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Periods for Chaikin Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}
object PlotChaikinParamsOptions {
  
  inline def apply(): PlotChaikinParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotChaikinParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotChaikinParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriods(value: js.Array[Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
    
    inline def setPeriodsVarargs(value: Double*): Self = StObject.set(x, "periods", js.Array(value*))
    
    inline def setVolumeSeriesID(value: String): Self = StObject.set(x, "volumeSeriesID", value.asInstanceOf[js.Any])
    
    inline def setVolumeSeriesIDUndefined: Self = StObject.set(x, "volumeSeriesID", js.undefined)
  }
}
