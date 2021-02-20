package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActions/CardActions.CardActionsClassKey>> */
@js.native
trait PartialClassNameMapCardAcAction extends StObject {
  
  var action: js.UndefOr[String] = js.native
  
  var disableActionSpacing: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapCardAcAction {
  
  @scala.inline
  def apply(): PartialClassNameMapCardAcAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardAcAction]
  }
  
  @scala.inline
  implicit class PartialClassNameMapCardAcActionMutableBuilder[Self <: PartialClassNameMapCardAcAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDisableActionSpacing(value: String): Self = StObject.set(x, "disableActionSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableActionSpacingUndefined: Self = StObject.set(x, "disableActionSpacing", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
