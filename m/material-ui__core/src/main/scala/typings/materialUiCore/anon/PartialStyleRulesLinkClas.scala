package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Link.LinkClassKey, {}>> */
trait PartialStyleRulesLinkClas extends StObject {
  
  var button: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var focusVisible: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var underlineAlways: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var underlineHover: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var underlineNone: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesLinkClas {
  
  inline def apply(): PartialStyleRulesLinkClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesLinkClas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStyleRulesLinkClas] (val x: Self) extends AnyVal {
    
    inline def setButton(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "button", js.Any.fromFunction1(value))
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setFocusVisible(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "focusVisible", js.Any.fromFunction1(value))
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setUnderlineAlways(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "underlineAlways", value.asInstanceOf[js.Any])
    
    inline def setUnderlineAlwaysFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "underlineAlways", js.Any.fromFunction1(value))
    
    inline def setUnderlineAlwaysUndefined: Self = StObject.set(x, "underlineAlways", js.undefined)
    
    inline def setUnderlineHover(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "underlineHover", value.asInstanceOf[js.Any])
    
    inline def setUnderlineHoverFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "underlineHover", js.Any.fromFunction1(value))
    
    inline def setUnderlineHoverUndefined: Self = StObject.set(x, "underlineHover", js.undefined)
    
    inline def setUnderlineNone(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "underlineNone", value.asInstanceOf[js.Any])
    
    inline def setUnderlineNoneFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "underlineNone", js.Any.fromFunction1(value))
    
    inline def setUnderlineNoneUndefined: Self = StObject.set(x, "underlineNone", js.undefined)
  }
}
