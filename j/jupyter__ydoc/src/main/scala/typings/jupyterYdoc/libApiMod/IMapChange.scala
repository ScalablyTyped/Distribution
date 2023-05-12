package typings.jupyterYdoc.libApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapChange[T] extends StObject {
  
  /**
    * The key of the change.
    */
  var key: String
  
  /**
    * The new value of the change.
    */
  var newValue: js.UndefOr[T] = js.undefined
  
  /**
    * The old value of the change.
    */
  var oldValue: js.UndefOr[T] = js.undefined
  
  /**
    * The type of change undergone by the map.
    */
  var `type`: MapChangeType
}
object IMapChange {
  
  inline def apply[T](key: String, `type`: MapChangeType): IMapChange[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapChange[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMapChange[?], T] (val x: Self & IMapChange[T]) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setType(value: MapChangeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
