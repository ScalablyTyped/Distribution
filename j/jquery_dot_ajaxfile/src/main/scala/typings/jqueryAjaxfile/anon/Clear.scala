package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  def clear(node: typings.std.Element): Boolean
  
  def get(node: typings.std.Element, key: String): js.Any
  
  def getAll(node: typings.std.Element, createIfNotFound: Boolean): js.Any
  
  def set(node: typings.std.Element, key: String, value: js.Any): Unit
}
object Clear {
  
  inline def apply(
    clear: typings.std.Element => Boolean,
    get: (typings.std.Element, String) => js.Any,
    getAll: (typings.std.Element, Boolean) => js.Any,
    set: (typings.std.Element, String, js.Any) => Unit
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[Clear]
  }
  
  extension [Self <: Clear](x: Self) {
    
    inline def setClear(value: typings.std.Element => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setGet(value: (typings.std.Element, String) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetAll(value: (typings.std.Element, Boolean) => js.Any): Self = StObject.set(x, "getAll", js.Any.fromFunction2(value))
    
    inline def setSet(value: (typings.std.Element, String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
  }
}
