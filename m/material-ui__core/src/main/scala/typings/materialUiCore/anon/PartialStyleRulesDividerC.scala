package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Divider.DividerClassKey>> */
trait PartialStyleRulesDividerC extends StObject {
  
  var absolute: js.UndefOr[CSSProperties] = js.undefined
  
  var inset: js.UndefOr[CSSProperties] = js.undefined
  
  var light: js.UndefOr[CSSProperties] = js.undefined
  
  var middle: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesDividerC {
  
  inline def apply(): PartialStyleRulesDividerC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDividerC]
  }
  
  extension [Self <: PartialStyleRulesDividerC](x: Self) {
    
    inline def setAbsolute(value: CSSProperties): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    inline def setInset(value: CSSProperties): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setLight(value: CSSProperties): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setMiddle(value: CSSProperties): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
