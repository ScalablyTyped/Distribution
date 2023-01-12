package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogActions/DialogActions.DialogActionsClassKey>> */
trait PartialClassNameMapDialogRoot extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var spacing: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapDialogRoot {
  
  inline def apply(): PartialClassNameMapDialogRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDialogRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapDialogRoot] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
