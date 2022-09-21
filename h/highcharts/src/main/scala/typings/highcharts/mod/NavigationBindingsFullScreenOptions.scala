package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBindingsFullScreenOptions extends StObject {
  
  var noDataState: js.UndefOr[String] = js.undefined
}
object NavigationBindingsFullScreenOptions {
  
  inline def apply(): NavigationBindingsFullScreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBindingsFullScreenOptions]
  }
  
  extension [Self <: NavigationBindingsFullScreenOptions](x: Self) {
    
    inline def setNoDataState(value: String): Self = StObject.set(x, "noDataState", value.asInstanceOf[js.Any])
    
    inline def setNoDataStateUndefined: Self = StObject.set(x, "noDataState", js.undefined)
  }
}
