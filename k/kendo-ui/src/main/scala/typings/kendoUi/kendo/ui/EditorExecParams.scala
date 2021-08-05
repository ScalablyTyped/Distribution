package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorExecParams extends StObject {
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object EditorExecParams {
  
  inline def apply(): EditorExecParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorExecParams]
  }
  
  extension [Self <: EditorExecParams](x: Self) {
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
