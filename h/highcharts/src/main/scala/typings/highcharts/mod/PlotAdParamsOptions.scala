package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAdParamsOptions extends StObject {
  
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
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}
object PlotAdParamsOptions {
  
  @scala.inline
  def apply(): PlotAdParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAdParamsOptions]
  }
  
  @scala.inline
  implicit class PlotAdParamsOptionsMutableBuilder[Self <: PlotAdParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setVolumeSeriesID(value: String): Self = StObject.set(x, "volumeSeriesID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSeriesIDUndefined: Self = StObject.set(x, "volumeSeriesID", js.undefined)
  }
}
