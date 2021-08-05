package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Checkbox.CheckboxClassKey>> */
trait PartialStyleRulesCheckbox extends StObject {
  
  var checked: js.UndefOr[CSSProperties] = js.undefined
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.undefined
  
  var colorSecondary: js.UndefOr[CSSProperties] = js.undefined
  
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  
  var indeterminate: js.UndefOr[CSSProperties] = js.undefined
  
  var input: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesCheckbox {
  
  inline def apply(): PartialStyleRulesCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCheckbox]
  }
  
  extension [Self <: PartialStyleRulesCheckbox](x: Self) {
    
    inline def setChecked(value: CSSProperties): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setColorPrimary(value: CSSProperties): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setColorSecondary(value: CSSProperties): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    inline def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    inline def setDisabled(value: CSSProperties): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIndeterminate(value: CSSProperties): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
