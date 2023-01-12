package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBindingsSaveChartOptions extends StObject {
  
  var noDataState: js.UndefOr[String] = js.undefined
}
object NavigationBindingsSaveChartOptions {
  
  inline def apply(): NavigationBindingsSaveChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsSaveChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationBindingsSaveChartOptions] (val x: Self) extends AnyVal {
    
    inline def setNoDataState(value: String): Self = StObject.set(x, "noDataState", value.asInstanceOf[js.Any])
    
    inline def setNoDataStateUndefined: Self = StObject.set(x, "noDataState", js.undefined)
  }
}
