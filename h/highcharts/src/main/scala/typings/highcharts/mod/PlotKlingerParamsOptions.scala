package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotKlingerParamsOptions extends StObject {
  
  /**
    * (Highstock) The fast period for indicator calculations.
    */
  var fastAvgPeriod: js.UndefOr[Double] = js.undefined
  
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
  
  /**
    * (Highstock) The base period for signal calculations.
    */
  var signalPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The slow period for indicator calculations.
    */
  var slowAvgPeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The id of another series to use its data as volume data for
    * the indiator calculation.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}
object PlotKlingerParamsOptions {
  
  inline def apply(): PlotKlingerParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotKlingerParamsOptions]
  }
  
  extension [Self <: PlotKlingerParamsOptions](x: Self) {
    
    inline def setFastAvgPeriod(value: Double): Self = StObject.set(x, "fastAvgPeriod", value.asInstanceOf[js.Any])
    
    inline def setFastAvgPeriodUndefined: Self = StObject.set(x, "fastAvgPeriod", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setSignalPeriod(value: Double): Self = StObject.set(x, "signalPeriod", value.asInstanceOf[js.Any])
    
    inline def setSignalPeriodUndefined: Self = StObject.set(x, "signalPeriod", js.undefined)
    
    inline def setSlowAvgPeriod(value: Double): Self = StObject.set(x, "slowAvgPeriod", value.asInstanceOf[js.Any])
    
    inline def setSlowAvgPeriodUndefined: Self = StObject.set(x, "slowAvgPeriod", js.undefined)
    
    inline def setVolumeSeriesID(value: String): Self = StObject.set(x, "volumeSeriesID", value.asInstanceOf[js.Any])
    
    inline def setVolumeSeriesIDUndefined: Self = StObject.set(x, "volumeSeriesID", js.undefined)
  }
}
