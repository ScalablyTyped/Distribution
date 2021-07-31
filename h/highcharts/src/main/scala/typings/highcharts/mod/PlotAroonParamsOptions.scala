package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAroonParamsOptions extends StObject {
  
  /**
    * (Highstock) Period for Aroon indicator
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotAroonParamsOptions {
  
  @scala.inline
  def apply(): PlotAroonParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonParamsOptions]
  }
  
  @scala.inline
  implicit class PlotAroonParamsOptionsMutableBuilder[Self <: PlotAroonParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
