package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActionArea/CardActionArea.CardActionAreaClassKey>> */
trait PartialClassNameMapCardAc extends StObject {
  
  var focusHighlight: js.UndefOr[String] = js.undefined
  
  var focusVisible: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapCardAc {
  
  inline def apply(): PartialClassNameMapCardAc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardAc]
  }
  
  extension [Self <: PartialClassNameMapCardAc](x: Self) {
    
    inline def setFocusHighlight(value: String): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    inline def setFocusHighlightUndefined: Self = StObject.set(x, "focusHighlight", js.undefined)
    
    inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
