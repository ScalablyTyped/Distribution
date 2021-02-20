package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendAccessibilityOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
    * the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation
    * for the legend.
    */
  var keyboardNavigation: js.UndefOr[LegendAccessibilityKeyboardNavigationOptions] = js.native
}
object LegendAccessibilityOptions {
  
  @scala.inline
  def apply(): LegendAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendAccessibilityOptions]
  }
  
  @scala.inline
  implicit class LegendAccessibilityOptionsMutableBuilder[Self <: LegendAccessibilityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: LegendAccessibilityKeyboardNavigationOptions): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
  }
}
