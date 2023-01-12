package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedTextBoxOptions
  extends StObject
     with AllEditorOptions {
  
  var change: js.UndefOr[js.Function1[/* e */ MaskedTextBoxChangeEvent, Unit]] = js.undefined
  
  var clearPromptChar: js.UndefOr[Boolean] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String | js.Function | MaskedTextBoxLabel] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var promptChar: js.UndefOr[String] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var rules: js.UndefOr[Any] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var unmaskOnPost: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object MaskedTextBoxOptions {
  
  inline def apply(): MaskedTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedTextBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaskedTextBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setChange(value: /* e */ MaskedTextBoxChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClearPromptChar(value: Boolean): Self = StObject.set(x, "clearPromptChar", value.asInstanceOf[js.Any])
    
    inline def setClearPromptCharUndefined: Self = StObject.set(x, "clearPromptChar", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setLabel(value: String | js.Function | MaskedTextBoxLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPromptChar(value: String): Self = StObject.set(x, "promptChar", value.asInstanceOf[js.Any])
    
    inline def setPromptCharUndefined: Self = StObject.set(x, "promptChar", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setRules(value: Any): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUnmaskOnPost(value: Boolean): Self = StObject.set(x, "unmaskOnPost", value.asInstanceOf[js.Any])
    
    inline def setUnmaskOnPostUndefined: Self = StObject.set(x, "unmaskOnPost", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
