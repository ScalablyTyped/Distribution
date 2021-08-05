package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActionArea.CardActionAreaClassKey>> */
trait PartialStyleRulesCardActiFocusHighlight extends StObject {
  
  var focusHighlight: js.UndefOr[CSSProperties] = js.undefined
  
  var focusVisible: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesCardActiFocusHighlight {
  
  inline def apply(): PartialStyleRulesCardActiFocusHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCardActiFocusHighlight]
  }
  
  extension [Self <: PartialStyleRulesCardActiFocusHighlight](x: Self) {
    
    inline def setFocusHighlight(value: CSSProperties): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    inline def setFocusHighlightUndefined: Self = StObject.set(x, "focusHighlight", js.undefined)
    
    inline def setFocusVisible(value: CSSProperties): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
