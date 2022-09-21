package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Collapse.CollapseClassKey, {}>> */
trait PartialStyleRulesCollapse extends StObject {
  
  var entered: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var hidden: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var wrapper: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var wrapperInner: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesCollapse {
  
  inline def apply(): PartialStyleRulesCollapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCollapse]
  }
  
  extension [Self <: PartialStyleRulesCollapse](x: Self) {
    
    inline def setEntered(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    inline def setEnteredFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "entered", js.Any.fromFunction1(value))
    
    inline def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
    
    inline def setHidden(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "hidden", js.Any.fromFunction1(value))
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setWrapper(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "wrapper", js.Any.fromFunction1(value))
    
    inline def setWrapperInner(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "wrapperInner", value.asInstanceOf[js.Any])
    
    inline def setWrapperInnerFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "wrapperInner", js.Any.fromFunction1(value))
    
    inline def setWrapperInnerUndefined: Self = StObject.set(x, "wrapperInner", js.undefined)
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
