package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBindingsSeriesTypeHLCOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object NavigationBindingsSeriesTypeHLCOptions {
  
  inline def apply(): NavigationBindingsSeriesTypeHLCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsSeriesTypeHLCOptions]
  }
  
  extension [Self <: NavigationBindingsSeriesTypeHLCOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
