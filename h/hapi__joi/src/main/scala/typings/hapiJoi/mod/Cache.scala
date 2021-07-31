package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cache extends StObject {
  
  /**
    * Retrieve an item from the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def get(key: js.Any): js.Any
  
  /**
    * Add an item to the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def set(key: js.Any, value: js.Any): Unit
}
object Cache {
  
  @scala.inline
  def apply(get: js.Any => js.Any, set: (js.Any, js.Any) => Unit): Cache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheMutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
