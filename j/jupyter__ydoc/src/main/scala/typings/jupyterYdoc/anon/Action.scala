package typings.jupyterYdoc.anon

import typings.jupyterYdoc.jupyterYdocStrings.add
import typings.jupyterYdoc.jupyterYdocStrings.delete
import typings.jupyterYdoc.jupyterYdocStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: add | update | delete
  
  var oldValue: Any
}
object Action {
  
  inline def apply(action: add | update | delete, oldValue: Any): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: add | update | delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
