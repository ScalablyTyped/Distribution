package typings.jupyterYdoc.libApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentChange extends StObject {
  
  /**
    * Change occurring in the document state.
    */
  var stateChange: js.UndefOr[js.Array[StateChange[Any]]] = js.undefined
}
object DocumentChange {
  
  inline def apply(): DocumentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentChange] (val x: Self) extends AnyVal {
    
    inline def setStateChange(value: js.Array[StateChange[Any]]): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    
    inline def setStateChangeVarargs(value: StateChange[Any]*): Self = StObject.set(x, "stateChange", js.Array(value*))
  }
}
