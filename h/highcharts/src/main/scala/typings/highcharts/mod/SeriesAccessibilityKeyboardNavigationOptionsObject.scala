package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesAccessibilityKeyboardNavigationOptionsObject extends StObject {
  
  /**
    * (Highstock) Enable/disable keyboard navigation support for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SeriesAccessibilityKeyboardNavigationOptionsObject {
  
  @scala.inline
  def apply(): SeriesAccessibilityKeyboardNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesAccessibilityKeyboardNavigationOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesAccessibilityKeyboardNavigationOptionsObjectMutableBuilder[Self <: SeriesAccessibilityKeyboardNavigationOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
