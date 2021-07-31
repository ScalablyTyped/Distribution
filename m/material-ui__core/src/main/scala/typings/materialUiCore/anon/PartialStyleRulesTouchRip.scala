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
  
  @scala.inline
  def apply(): PartialStyleRulesTouchRip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTouchRip]
  }
  
  @scala.inline
  implicit class PartialStyleRulesTouchRipMutableBuilder[Self <: PartialStyleRulesTouchRip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChild(value: CSSProperties): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLeaving(value: CSSProperties): Self = StObject.set(x, "childLeaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildLeavingUndefined: Self = StObject.set(x, "childLeaving", js.undefined)
    
    @scala.inline
    def setChildPulsate(value: CSSProperties): Self = StObject.set(x, "childPulsate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildPulsateUndefined: Self = StObject.set(x, "childPulsate", js.undefined)
    
    @scala.inline
    def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
    
    @scala.inline
    def setRipple(value: CSSProperties): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRipplePulsate(value: CSSProperties): Self = StObject.set(x, "ripplePulsate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRipplePulsateUndefined: Self = StObject.set(x, "ripplePulsate", js.undefined)
    
    @scala.inline
    def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
    
    @scala.inline
    def setRippleVisible(value: CSSProperties): Self = StObject.set(x, "rippleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleVisibleUndefined: Self = StObject.set(x, "rippleVisible", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
