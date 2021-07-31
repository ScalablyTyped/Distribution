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
  
  @scala.inline
  def apply(): ExportingAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingAccessibilityOptions]
  }
  
  @scala.inline
  implicit class ExportingAccessibilityOptionsMutableBuilder[Self <: ExportingAccessibilityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
