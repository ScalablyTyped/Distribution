package typings.jupyterYdoc.libApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateChange[T] extends StObject {
  
  /**
    * Key changed
    */
  var name: String
  
  /**
    * New value
    */
  var newValue: js.UndefOr[T] = js.undefined
  
  /**
    * Old value
    */
  var oldValue: js.UndefOr[T] = js.undefined
}
object StateChange {
  
  inline def apply[T](name: String): StateChange[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChange[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateChange[?], T] (val x: Self & StateChange[T]) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
