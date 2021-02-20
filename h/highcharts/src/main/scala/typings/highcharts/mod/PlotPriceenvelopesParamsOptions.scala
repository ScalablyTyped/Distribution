package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPriceenvelopesParamsOptions extends StObject {
  
  /**
    * (Highstock) Percentage below the moving average that should be displayed.
    * 0.1 means 90%. Relative to the calculated value.
    */
  var bottomBand: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Percentage above the moving average that should be displayed.
    * 0.1 means 110%. Relative to the calculated value.
    */
  var topBand: js.UndefOr[Double] = js.native
}
object PlotPriceenvelopesParamsOptions {
  
  @scala.inline
  def apply(): PlotPriceenvelopesParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPriceenvelopesParamsOptions]
  }
  
  @scala.inline
  implicit class PlotPriceenvelopesParamsOptionsMutableBuilder[Self <: PlotPriceenvelopesParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomBand(value: Double): Self = StObject.set(x, "bottomBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBandUndefined: Self = StObject.set(x, "bottomBand", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setTopBand(value: Double): Self = StObject.set(x, "topBand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBandUndefined: Self = StObject.set(x, "topBand", js.undefined)
  }
}
