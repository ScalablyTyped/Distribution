package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepButton.StepButtonClasskey>> */
trait PartialStyleRulesStepButt extends StObject {
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var touchRipple: js.UndefOr[CSSProperties] = js.undefined
  
  var vertical: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesStepButt {
  
  inline def apply(): PartialStyleRulesStepButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepButt]
  }
  
  extension [Self <: PartialStyleRulesStepButt](x: Self) {
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTouchRipple(value: CSSProperties): Self = StObject.set(x, "touchRipple", value.asInstanceOf[js.Any])
    
    inline def setTouchRippleUndefined: Self = StObject.set(x, "touchRipple", js.undefined)
    
    inline def setVertical(value: CSSProperties): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
