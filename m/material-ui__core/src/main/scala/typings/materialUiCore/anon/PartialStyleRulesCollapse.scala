package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Collapse.CollapseClassKey>> */
trait PartialStyleRulesCollapse extends StObject {
  
  var container: js.UndefOr[CSSProperties] = js.undefined
  
  var entered: js.UndefOr[CSSProperties] = js.undefined
  
  var wrapper: js.UndefOr[CSSProperties] = js.undefined
  
  var wrapperInner: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesCollapse {
  
  inline def apply(): PartialStyleRulesCollapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCollapse]
  }
  
  extension [Self <: PartialStyleRulesCollapse](x: Self) {
    
    inline def setContainer(value: CSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEntered(value: CSSProperties): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    inline def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
    
    inline def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperInner(value: CSSProperties): Self = StObject.set(x, "wrapperInner", value.asInstanceOf[js.Any])
    
    inline def setWrapperInnerUndefined: Self = StObject.set(x, "wrapperInner", js.undefined)
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
