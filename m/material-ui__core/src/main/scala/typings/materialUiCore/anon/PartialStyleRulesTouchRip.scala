package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typings.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase/TouchRipple.TouchRippleClassKey, {}>> */
trait PartialStyleRulesTouchRip extends StObject {
  
  var child: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var childLeaving: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var childPulsate: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var ripple: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var ripplePulsate: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var rippleVisible: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesTouchRip {
  
  inline def apply(): PartialStyleRulesTouchRip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTouchRip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStyleRulesTouchRip] (val x: Self) extends AnyVal {
    
    inline def setChild(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
    
    inline def setChildLeaving(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "childLeaving", value.asInstanceOf[js.Any])
    
    inline def setChildLeavingFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "childLeaving", js.Any.fromFunction1(value))
    
    inline def setChildLeavingUndefined: Self = StObject.set(x, "childLeaving", js.undefined)
    
    inline def setChildPulsate(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "childPulsate", value.asInstanceOf[js.Any])
    
    inline def setChildPulsateFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "childPulsate", js.Any.fromFunction1(value))
    
    inline def setChildPulsateUndefined: Self = StObject.set(x, "childPulsate", js.undefined)
    
    inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    inline def setRipple(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
    
    inline def setRippleFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "ripple", js.Any.fromFunction1(value))
    
    inline def setRipplePulsate(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "ripplePulsate", value.asInstanceOf[js.Any])
    
    inline def setRipplePulsateFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "ripplePulsate", js.Any.fromFunction1(value))
    
    inline def setRipplePulsateUndefined: Self = StObject.set(x, "ripplePulsate", js.undefined)
    
    inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
    
    inline def setRippleVisible(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "rippleVisible", value.asInstanceOf[js.Any])
    
    inline def setRippleVisibleFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "rippleVisible", js.Any.fromFunction1(value))
    
    inline def setRippleVisibleUndefined: Self = StObject.set(x, "rippleVisible", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
