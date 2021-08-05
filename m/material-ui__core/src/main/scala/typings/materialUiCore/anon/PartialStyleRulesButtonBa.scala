package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseClassKey>> */
trait PartialStyleRulesButtonBa extends StObject {
  
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  
  var focusVisible: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesButtonBa {
  
  inline def apply(): PartialStyleRulesButtonBa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesButtonBa]
  }
  
  extension [Self <: PartialStyleRulesButtonBa](x: Self) {
    
    inline def setDisabled(value: CSSProperties): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusVisible(value: CSSProperties): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
