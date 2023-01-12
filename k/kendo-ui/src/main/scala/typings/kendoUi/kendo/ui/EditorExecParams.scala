package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorExecParams extends StObject {
  
  var value: js.UndefOr[Any] = js.undefined
}
object EditorExecParams {
  
  inline def apply(): EditorExecParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorExecParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorExecParams] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
