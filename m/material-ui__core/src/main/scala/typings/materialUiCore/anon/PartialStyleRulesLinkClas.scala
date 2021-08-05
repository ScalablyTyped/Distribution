package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Link.LinkClassKey>> */
trait PartialStyleRulesLinkClas extends StObject {
  
  var button: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
  
  var underlineAlways: js.UndefOr[CSSProperties] = js.undefined
  
  var underlineHover: js.UndefOr[CSSProperties] = js.undefined
  
  var underlineNone: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesLinkClas {
  
  inline def apply(): PartialStyleRulesLinkClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesLinkClas]
  }
  
  extension [Self <: PartialStyleRulesLinkClas](x: Self) {
    
    inline def setButton(value: CSSProperties): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setUnderlineAlways(value: CSSProperties): Self = StObject.set(x, "underlineAlways", value.asInstanceOf[js.Any])
    
    inline def setUnderlineAlwaysUndefined: Self = StObject.set(x, "underlineAlways", js.undefined)
    
    inline def setUnderlineHover(value: CSSProperties): Self = StObject.set(x, "underlineHover", value.asInstanceOf[js.Any])
    
    inline def setUnderlineHoverUndefined: Self = StObject.set(x, "underlineHover", js.undefined)
    
    inline def setUnderlineNone(value: CSSProperties): Self = StObject.set(x, "underlineNone", value.asInstanceOf[js.Any])
    
    inline def setUnderlineNoneUndefined: Self = StObject.set(x, "underlineNone", js.undefined)
  }
}
