package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/SnackbarContent.SnackbarContentClassKey>> */
@js.native
trait PartialStyleRulesSnackbarAction extends StObject {
  
  var action: js.UndefOr[CSSProperties] = js.native
  
  var message: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesSnackbarAction {
  
  @scala.inline
  def apply(): PartialStyleRulesSnackbarAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesSnackbarAction]
  }
  
  @scala.inline
  implicit class PartialStyleRulesSnackbarActionMutableBuilder[Self <: PartialStyleRulesSnackbarAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: CSSProperties): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setMessage(value: CSSProperties): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
