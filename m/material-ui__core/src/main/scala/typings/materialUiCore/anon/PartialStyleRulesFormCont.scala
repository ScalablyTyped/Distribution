package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormControl.FormControlClassKey>> */
trait PartialStyleRulesFormCont extends StObject {
  
  var fullWidth: js.UndefOr[CSSProperties] = js.undefined
  
  var marginDense: js.UndefOr[CSSProperties] = js.undefined
  
  var marginNormal: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesFormCont {
  
  inline def apply(): PartialStyleRulesFormCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormCont]
  }
  
  extension [Self <: PartialStyleRulesFormCont](x: Self) {
    
    inline def setFullWidth(value: CSSProperties): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setMarginDense(value: CSSProperties): Self = StObject.set(x, "marginDense", value.asInstanceOf[js.Any])
    
    inline def setMarginDenseUndefined: Self = StObject.set(x, "marginDense", js.undefined)
    
    inline def setMarginNormal(value: CSSProperties): Self = StObject.set(x, "marginNormal", value.asInstanceOf[js.Any])
    
    inline def setMarginNormalUndefined: Self = StObject.set(x, "marginNormal", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
