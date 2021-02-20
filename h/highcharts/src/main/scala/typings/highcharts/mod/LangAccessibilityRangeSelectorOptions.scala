package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityRangeSelectorOptions extends StObject {
  
  var buttonText: js.UndefOr[String] = js.native
  
  var maxInputLabel: js.UndefOr[String] = js.native
  
  var minInputLabel: js.UndefOr[String] = js.native
}
object LangAccessibilityRangeSelectorOptions {
  
  @scala.inline
  def apply(): LangAccessibilityRangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityRangeSelectorOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityRangeSelectorOptionsMutableBuilder[Self <: LangAccessibilityRangeSelectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    @scala.inline
    def setMaxInputLabel(value: String): Self = StObject.set(x, "maxInputLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInputLabelUndefined: Self = StObject.set(x, "maxInputLabel", js.undefined)
    
    @scala.inline
    def setMinInputLabel(value: String): Self = StObject.set(x, "minInputLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInputLabelUndefined: Self = StObject.set(x, "minInputLabel", js.undefined)
  }
}
