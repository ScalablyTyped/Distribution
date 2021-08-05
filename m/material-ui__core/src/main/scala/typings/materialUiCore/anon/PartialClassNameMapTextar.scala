package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputBase/Textarea.TextareaClassKey>> */
trait PartialClassNameMapTextar extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var shadow: js.UndefOr[String] = js.undefined
  
  var textarea: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapTextar {
  
  inline def apply(): PartialClassNameMapTextar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTextar]
  }
  
  extension [Self <: PartialClassNameMapTextar](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setShadow(value: String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setTextarea(value: String): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
    
    inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
  }
}
