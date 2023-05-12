package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotAoParamsOptions extends StObject {
  
  var index: js.UndefOr[String] = js.undefined
  
  var period: js.UndefOr[String] = js.undefined
}
object PlotAoParamsOptions {
  
  inline def apply(): PlotAoParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotAoParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotAoParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
