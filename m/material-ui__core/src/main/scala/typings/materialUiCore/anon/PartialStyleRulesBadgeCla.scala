package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Badge.BadgeClassKey>> */
@js.native
trait PartialStyleRulesBadgeCla extends StObject {
  
  var badge: js.UndefOr[CSSProperties] = js.native
  
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  
  var dot: js.UndefOr[CSSProperties] = js.native
  
  var invisible: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesBadgeCla {
  
  @scala.inline
  def apply(): PartialStyleRulesBadgeCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesBadgeCla]
  }
  
  @scala.inline
  implicit class PartialStyleRulesBadgeClaMutableBuilder[Self <: PartialStyleRulesBadgeCla] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: CSSProperties): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    @scala.inline
    def setDot(value: CSSProperties): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
    
    @scala.inline
    def setInvisible(value: CSSProperties): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
