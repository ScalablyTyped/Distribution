package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActions/CardActions.CardActionsClassKey>> */
trait PartialClassNameMapCardAcAction extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var disableActionSpacing: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapCardAcAction {
  
  inline def apply(): PartialClassNameMapCardAcAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardAcAction]
  }
  
  extension [Self <: PartialClassNameMapCardAcAction](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDisableActionSpacing(value: String): Self = StObject.set(x, "disableActionSpacing", value.asInstanceOf[js.Any])
    
    inline def setDisableActionSpacingUndefined: Self = StObject.set(x, "disableActionSpacing", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
