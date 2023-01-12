package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValue[T] extends StObject {
  
  var default: T
  
  var current: T
  
  var dirty: Boolean
  
  def get(): T
  
  def set(value: T): scala.Unit
  
  def setDefault(): scala.Unit
}
object IValue {
  
  inline def apply[T](
    current: T,
    default: T,
    dirty: Boolean,
    get: () => T,
    set: T => scala.Unit,
    setDefault: () => scala.Unit
  ): IValue[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set), setDefault = js.Any.fromFunction0(setDefault))
    __obj.asInstanceOf[IValue[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IValue[?], T] (val x: Self & IValue[T]) extends AnyVal {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setSet(value: T => scala.Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetDefault(value: () => scala.Unit): Self = StObject.set(x, "setDefault", js.Any.fromFunction0(value))
  }
}
