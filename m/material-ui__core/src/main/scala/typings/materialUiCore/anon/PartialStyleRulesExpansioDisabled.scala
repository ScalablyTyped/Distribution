package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanel.ExpansionPanelClassKey>> */
@js.native
trait PartialStyleRulesExpansioDisabled extends StObject {
  
  var disabled: js.UndefOr[CSSProperties] = js.native
  
  var expanded: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var rounded: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesExpansioDisabled {
  
  @scala.inline
  def apply(): PartialStyleRulesExpansioDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesExpansioDisabled]
  }
  
  @scala.inline
  implicit class PartialStyleRulesExpansioDisabledMutableBuilder[Self <: PartialStyleRulesExpansioDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: CSSProperties): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExpanded(value: CSSProperties): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRounded(value: CSSProperties): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
  }
}
