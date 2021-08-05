package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase/TouchRipple.TouchRippleClassKey>> */
trait PartialStyleRulesTouchRip extends StObject {
  
  var child: js.UndefOr[CSSProperties] = js.undefined
  
  var childLeaving: js.UndefOr[CSSProperties] = js.undefined
  
  var childPulsate: js.UndefOr[CSSProperties] = js.undefined
  
  var ripple: js.UndefOr[CSSProperties] = js.undefined
  
  var ripplePulsate: js.UndefOr[CSSProperties] = js.undefined
  
  var rippleVisible: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesTouchRip {
  
  inline def apply(): PartialStyleRulesTouchRip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTouchRip]
  }
  
  extension [Self <: PartialStyleRulesTouchRip](x: Self) {
    
    inline def setChild(value: CSSProperties): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildLeaving(value: CSSProperties): Self = StObject.set(x, "childLeaving", value.asInstanceOf[js.Any])
    
    inline def setChildLeavingUndefined: Self = StObject.set(x, "childLeaving", js.undefined)
    
    inline def setChildPulsate(value: CSSProperties): Self = StObject.set(x, "childPulsate", value.asInstanceOf[js.Any])
    
    inline def setChildPulsateUndefined: Self = StObject.set(x, "childPulsate", js.undefined)
    
    inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    inline def setRipple(value: CSSProperties): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
    
    inline def setRipplePulsate(value: CSSProperties): Self = StObject.set(x, "ripplePulsate", value.asInstanceOf[js.Any])
    
    inline def setRipplePulsateUndefined: Self = StObject.set(x, "ripplePulsate", js.undefined)
    
    inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
    
    inline def setRippleVisible(value: CSSProperties): Self = StObject.set(x, "rippleVisible", value.asInstanceOf[js.Any])
    
    inline def setRippleVisibleUndefined: Self = StObject.set(x, "rippleVisible", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
