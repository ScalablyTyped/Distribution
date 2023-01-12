package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clear extends StObject {
  
  def clear(node: typings.std.Element): Boolean
  
  def get(node: typings.std.Element, key: String): Any
  
  def getAll(node: typings.std.Element, createIfNotFound: Boolean): Any
  
  def set(node: typings.std.Element, key: String, value: Any): Unit
}
object Clear {
  
  inline def apply(
    clear: typings.std.Element => Boolean,
    get: (typings.std.Element, String) => Any,
    getAll: (typings.std.Element, Boolean) => Any,
    set: (typings.std.Element, String, Any) => Unit
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
    
    inline def setClear(value: typings.std.Element => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setGet(value: (typings.std.Element, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetAll(value: (typings.std.Element, Boolean) => Any): Self = StObject.set(x, "getAll", js.Any.fromFunction2(value))
    
    inline def setSet(value: (typings.std.Element, String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
  }
}
