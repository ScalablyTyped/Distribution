package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanelActions/ExpansionPanelActions.ExpansionPanelActionsClassKey>> */
trait PartialClassNameMapExpansAction extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapExpansAction {
  
  @scala.inline
  def apply(): PartialClassNameMapExpansAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapExpansAction]
  }
  
  @scala.inline
  implicit class PartialClassNameMapExpansActionMutableBuilder[Self <: PartialClassNameMapExpansAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
