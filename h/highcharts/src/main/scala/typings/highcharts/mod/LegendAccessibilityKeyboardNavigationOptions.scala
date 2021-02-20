package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendAccessibilityKeyboardNavigationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable keyboard navigation for
    * the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object LegendAccessibilityKeyboardNavigationOptions {
  
  @scala.inline
  def apply(): LegendAccessibilityKeyboardNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendAccessibilityKeyboardNavigationOptions]
  }
  
  @scala.inline
  implicit class LegendAccessibilityKeyboardNavigationOptionsMutableBuilder[Self <: LegendAccessibilityKeyboardNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
