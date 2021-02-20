package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActionArea.CardActionAreaClassKey>> */
@js.native
trait PartialStyleRulesCardActiFocusHighlight extends StObject {
  
  var focusHighlight: js.UndefOr[CSSProperties] = js.native
  
  var focusVisible: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesCardActiFocusHighlight {
  
  @scala.inline
  def apply(): PartialStyleRulesCardActiFocusHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCardActiFocusHighlight]
  }
  
  @scala.inline
  implicit class PartialStyleRulesCardActiFocusHighlightMutableBuilder[Self <: PartialStyleRulesCardActiFocusHighlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocusHighlight(value: CSSProperties): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusHighlightUndefined: Self = StObject.set(x, "focusHighlight", js.undefined)
    
    @scala.inline
    def setFocusVisible(value: CSSProperties): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
