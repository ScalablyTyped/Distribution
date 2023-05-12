package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotWilliamsrParamsOptions extends StObject {
  
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Period for Williams %R oscillator
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotWilliamsrParamsOptions {
  
  inline def apply(): PlotWilliamsrParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWilliamsrParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotWilliamsrParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
