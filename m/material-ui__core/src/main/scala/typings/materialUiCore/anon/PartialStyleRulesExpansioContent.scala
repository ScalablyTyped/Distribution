package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanelSummary.ExpansionPanelSummaryClassKey>> */
trait PartialStyleRulesExpansioContent extends StObject {
  
  var content: js.UndefOr[CSSProperties] = js.undefined
  
  var disabled: js.UndefOr[CSSProperties] = js.undefined
  
  var expandIcon: js.UndefOr[CSSProperties] = js.undefined
  
  var expanded: js.UndefOr[CSSProperties] = js.undefined
  
  var focused: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesExpansioContent {
  
  inline def apply(): PartialStyleRulesExpansioContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesExpansioContent]
  }
  
  extension [Self <: PartialStyleRulesExpansioContent](x: Self) {
    
    inline def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(value: CSSProperties): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpandIcon(value: CSSProperties): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setExpanded(value: CSSProperties): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setFocused(value: CSSProperties): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
