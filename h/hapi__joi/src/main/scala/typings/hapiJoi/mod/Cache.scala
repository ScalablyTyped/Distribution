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
  def get(key: Any): Any
  
  /**
    * Add an item to the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def set(key: Any, value: Any): Unit
}
object Cache {
  
  inline def apply(get: Any => Any, set: (Any, Any) => Unit): Cache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Cache]
  }
  
  extension [Self <: Cache](x: Self) {
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setSet(value: (Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
