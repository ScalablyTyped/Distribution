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
  
  @scala.inline
  def apply(): PartialStyleRulesLinkClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesLinkClas]
  }
  
  @scala.inline
  implicit class PartialStyleRulesLinkClasMutableBuilder[Self <: PartialStyleRulesLinkClas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: CSSProperties): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setUnderlineAlways(value: CSSProperties): Self = StObject.set(x, "underlineAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineAlwaysUndefined: Self = StObject.set(x, "underlineAlways", js.undefined)
    
    @scala.inline
    def setUnderlineHover(value: CSSProperties): Self = StObject.set(x, "underlineHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineHoverUndefined: Self = StObject.set(x, "underlineHover", js.undefined)
    
    @scala.inline
    def setUnderlineNone(value: CSSProperties): Self = StObject.set(x, "underlineNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineNoneUndefined: Self = StObject.set(x, "underlineNone", js.undefined)
  }
}
