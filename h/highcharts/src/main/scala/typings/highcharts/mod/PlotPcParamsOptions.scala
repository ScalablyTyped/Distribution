package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPcParamsOptions extends StObject {
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
}
object PlotPcParamsOptions {
  
  @scala.inline
  def apply(): PlotPcParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPcParamsOptions]
  }
  
  @scala.inline
  implicit class PlotPcParamsOptionsMutableBuilder[Self <: PlotPcParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
