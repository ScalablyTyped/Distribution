package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedTextBoxOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ MaskedTextBoxChangeEvent, Unit]] = js.undefined
  
  var clearPromptChar: js.UndefOr[Boolean] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String | js.Function | MaskedTextBoxLabel] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var promptChar: js.UndefOr[String] = js.undefined
  
  var rules: js.UndefOr[js.Any] = js.undefined
  
  var unmaskOnPost: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MaskedTextBoxOptions {
  
  @scala.inline
  def apply(): MaskedTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedTextBoxOptions]
  }
  
  @scala.inline
  implicit class MaskedTextBoxOptionsMutableBuilder[Self <: MaskedTextBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ MaskedTextBoxChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClearPromptChar(value: Boolean): Self = StObject.set(x, "clearPromptChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearPromptCharUndefined: Self = StObject.set(x, "clearPromptChar", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setLabel(value: String | js.Function | MaskedTextBoxLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPromptChar(value: String): Self = StObject.set(x, "promptChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptCharUndefined: Self = StObject.set(x, "promptChar", js.undefined)
    
    @scala.inline
    def setRules(value: js.Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setUnmaskOnPost(value: Boolean): Self = StObject.set(x, "unmaskOnPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmaskOnPostUndefined: Self = StObject.set(x, "unmaskOnPost", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
