package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotTrendlineParamsOptions extends StObject {
  
  /**
    * (Highstock) The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be calculated
    * using Low values.
    */
  var index: js.UndefOr[Double | String] = js.native
}
object PlotTrendlineParamsOptions {
  
  @scala.inline
  def apply(): PlotTrendlineParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTrendlineParamsOptions]
  }
  
  @scala.inline
  implicit class PlotTrendlineParamsOptionsMutableBuilder[Self <: PlotTrendlineParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
