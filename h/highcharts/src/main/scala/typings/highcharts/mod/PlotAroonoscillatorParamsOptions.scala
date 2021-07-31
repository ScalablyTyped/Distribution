package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAroonoscillatorParamsOptions extends StObject {
  
  /**
    * (Highstock) Period for Aroon Oscillator
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotAroonoscillatorParamsOptions {
  
  @scala.inline
  def apply(): PlotAroonoscillatorParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAroonoscillatorParamsOptions]
  }
  
  @scala.inline
  implicit class PlotAroonoscillatorParamsOptionsMutableBuilder[Self <: PlotAroonoscillatorParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
