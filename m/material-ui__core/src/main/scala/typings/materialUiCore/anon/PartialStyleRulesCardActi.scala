package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CardActions.CardActionsClassKey>> */
trait PartialStyleRulesCardActi extends StObject {
  
  var action: js.UndefOr[CSSProperties] = js.undefined
  
  var disableActionSpacing: js.UndefOr[CSSProperties] = js.undefined
  
  var root: js.UndefOr[CSSProperties] = js.undefined
}
object PartialStyleRulesCardActi {
  
  @scala.inline
  def apply(): PartialStyleRulesCardActi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCardActi]
  }
  
  @scala.inline
  implicit class PartialStyleRulesCardActiMutableBuilder[Self <: PartialStyleRulesCardActi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CSSProperties): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDisableActionSpacing(value: CSSProperties): Self = StObject.set(x, "disableActionSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableActionSpacingUndefined: Self = StObject.set(x, "disableActionSpacing", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
