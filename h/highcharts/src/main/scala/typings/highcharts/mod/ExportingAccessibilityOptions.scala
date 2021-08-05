package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingAccessibilityOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
    * the export menu.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ExportingAccessibilityOptions {
  
  inline def apply(): ExportingAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingAccessibilityOptions]
  }
  
  extension [Self <: ExportingAccessibilityOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
