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
    
    inline def setSignalPeriod(value: Double): Self = StObject.set(x, "signalPeriod", value.asInstanceOf[js.Any])
    
    inline def setSignalPeriodUndefined: Self = StObject.set(x, "signalPeriod", js.undefined)
    
    inline def setSlowAvgPeriod(value: Double): Self = StObject.set(x, "slowAvgPeriod", value.asInstanceOf[js.Any])
    
    inline def setSlowAvgPeriodUndefined: Self = StObject.set(x, "slowAvgPeriod", js.undefined)
    
    inline def setVolumeSeriesID(value: String): Self = StObject.set(x, "volumeSeriesID", value.asInstanceOf[js.Any])
    
    inline def setVolumeSeriesIDUndefined: Self = StObject.set(x, "volumeSeriesID", js.undefined)
  }
}
