package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotChaikinParamsOptions extends StObject {
  
  /**
    * (Highstock) Periods for Chaikin Oscillator calculations.
    */
  var periods: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.native
}
object PlotChaikinParamsOptions {
  
  @scala.inline
  def apply(): PlotChaikinParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotChaikinParamsOptions]
  }
  
  @scala.inline
  implicit class PlotChaikinParamsOptionsMutableBuilder[Self <: PlotChaikinParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriods(value: js.Array[Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
    
    @scala.inline
    def setPeriodsVarargs(value: Double*): Self = StObject.set(x, "periods", js.Array(value :_*))
    
    @scala.inline
    def setVolumeSeriesID(value: String): Self = StObject.set(x, "volumeSeriesID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSeriesIDUndefined: Self = StObject.set(x, "volumeSeriesID", js.undefined)
  }
}
