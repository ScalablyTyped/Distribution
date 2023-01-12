package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/DialogContent/DialogContent.DialogContentClassKey>> */
trait PartialClassNameMapDialogDividers extends StObject {
  
  var dividers: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapDialogDividers {
  
  inline def apply(): PartialClassNameMapDialogDividers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDialogDividers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapDialogDividers] (val x: Self) extends AnyVal {
    
    inline def setDividers(value: String): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
    
    inline def setDividersUndefined: Self = StObject.set(x, "dividers", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
