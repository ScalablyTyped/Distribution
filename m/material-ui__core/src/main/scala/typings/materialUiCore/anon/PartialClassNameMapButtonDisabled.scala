package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseClassKey>> */
trait PartialClassNameMapButtonDisabled extends StObject {
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var focusVisible: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapButtonDisabled {
  
  inline def apply(): PartialClassNameMapButtonDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapButtonDisabled]
  }
  
  extension [Self <: PartialClassNameMapButtonDisabled](x: Self) {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
