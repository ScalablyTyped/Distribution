package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityRangeSelectorOptions extends StObject {
  
  var buttonText: js.UndefOr[String] = js.undefined
  
  var maxInputLabel: js.UndefOr[String] = js.undefined
  
  var minInputLabel: js.UndefOr[String] = js.undefined
}
object LangAccessibilityRangeSelectorOptions {
  
  inline def apply(): LangAccessibilityRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityRangeSelectorOptions]
  }
  
  extension [Self <: LangAccessibilityRangeSelectorOptions](x: Self) {
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setMaxInputLabel(value: String): Self = StObject.set(x, "maxInputLabel", value.asInstanceOf[js.Any])
    
    inline def setMaxInputLabelUndefined: Self = StObject.set(x, "maxInputLabel", js.undefined)
    
    inline def setMinInputLabel(value: String): Self = StObject.set(x, "minInputLabel", value.asInstanceOf[js.Any])
    
    inline def setMinInputLabelUndefined: Self = StObject.set(x, "minInputLabel", js.undefined)
  }
}
