package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendAccessibilityKeyboardNavigationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object LegendAccessibilityKeyboardNavigationOptions {
  
  inline def apply(): LegendAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendAccessibilityKeyboardNavigationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendAccessibilityKeyboardNavigationOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
