package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityRangeSelectorOptions extends StObject {
  
  var clickButtonAnnouncement: js.UndefOr[String] = js.undefined
  
  var dropdownLabel: js.UndefOr[String] = js.undefined
  
  var maxInputLabel: js.UndefOr[String] = js.undefined
  
  var minInputLabel: js.UndefOr[String] = js.undefined
}
object LangAccessibilityRangeSelectorOptions {
  
  inline def apply(): LangAccessibilityRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityRangeSelectorOptions]
  }
  
  extension [Self <: LangAccessibilityRangeSelectorOptions](x: Self) {
    
    inline def setClickButtonAnnouncement(value: String): Self = StObject.set(x, "clickButtonAnnouncement", value.asInstanceOf[js.Any])
    
    inline def setClickButtonAnnouncementUndefined: Self = StObject.set(x, "clickButtonAnnouncement", js.undefined)
    
    inline def setDropdownLabel(value: String): Self = StObject.set(x, "dropdownLabel", value.asInstanceOf[js.Any])
    
    inline def setDropdownLabelUndefined: Self = StObject.set(x, "dropdownLabel", js.undefined)
    
    inline def setMaxInputLabel(value: String): Self = StObject.set(x, "maxInputLabel", value.asInstanceOf[js.Any])
    
    inline def setMaxInputLabelUndefined: Self = StObject.set(x, "maxInputLabel", js.undefined)
    
    inline def setMinInputLabel(value: String): Self = StObject.set(x, "minInputLabel", value.asInstanceOf[js.Any])
    
    inline def setMinInputLabelUndefined: Self = StObject.set(x, "minInputLabel", js.undefined)
  }
}
