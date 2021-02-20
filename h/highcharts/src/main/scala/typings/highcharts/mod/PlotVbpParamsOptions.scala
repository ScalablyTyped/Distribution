package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotVbpParamsOptions extends StObject {
  
  /**
    * (Highstock) The number of price zones.
    */
  var ranges: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID='volume' means the indicator will be calculated
    * using OHLC and volume values.
    */
  var volumeSeriesID: js.UndefOr[String] = js.native
}
object PlotVbpParamsOptions {
  
  @scala.inline
  def apply(): PlotVbpParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotVbpParamsOptions]
  }
  
  @scala.inline
  implicit class PlotVbpParamsOptionsMutableBuilder[Self <: PlotVbpParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: Double): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setVolumeSeriesID(value: String): Self = StObject.set(x, "volumeSeriesID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSeriesIDUndefined: Self = StObject.set(x, "volumeSeriesID", js.undefined)
  }
}
