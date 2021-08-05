package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotVbpParamsOptions extends StObject {
  
  /**
    * (Highstock) The number of price zones.
    */
  var ranges: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}
object PlotVbpParamsOptions {
  
  inline def apply(): PlotVbpParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpParamsOptions]
  }
  
  extension [Self <: PlotVbpParamsOptions](x: Self) {
    
    inline def setRanges(value: Double): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setVolumeSeriesID(value: String): Self = StObject.set(x, "volumeSeriesID", value.asInstanceOf[js.Any])
    
    inline def setVolumeSeriesIDUndefined: Self = StObject.set(x, "volumeSeriesID", js.undefined)
  }
}
