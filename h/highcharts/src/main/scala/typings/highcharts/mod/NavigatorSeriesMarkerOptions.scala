package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorSeriesMarkerOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object NavigatorSeriesMarkerOptions {
  
  inline def apply(): NavigatorSeriesMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorSeriesMarkerOptions]
  }
  
  extension [Self <: NavigatorSeriesMarkerOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
