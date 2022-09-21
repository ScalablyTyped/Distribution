package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VakataStatic extends StObject {
  
  /**
    * filter array
    */
  def array_filter(c: Any, a: Any, b: Any, d: js.Array[Any], e: Any): js.Array[Any]
  
  /**
    * remove item from array
    */
  def array_remove(array: js.Array[Any], from: Double): js.Array[Any]
  
  /**
    * remove item from array
    */
  def array_remove_item(array: js.Array[Any], item: Any): js.Array[Any]
  
  /**
    * returns array with unique elements
    */
  def array_unique(array: js.Array[Any]): js.Array[Any]
  
  /**
    * collect attributes
    */
  def attributes(node: Any, with_values: Any): Any
  
  var context: Any
  
  var dnd: Any
  
  var html: Any
  
  var search: Any
  
  var storage: Any
}
object VakataStatic {
  
  inline def apply(
    array_filter: (Any, Any, Any, js.Array[Any], Any) => js.Array[Any],
    array_remove: (js.Array[Any], Double) => js.Array[Any],
    array_remove_item: (js.Array[Any], Any) => js.Array[Any],
    array_unique: js.Array[Any] => js.Array[Any],
    attributes: (Any, Any) => Any,
    context: Any,
    dnd: Any,
    html: Any,
    search: Any,
    storage: Any
  ): VakataStatic = {
    val __obj = js.Dynamic.literal(array_filter = js.Any.fromFunction5(array_filter), array_remove = js.Any.fromFunction2(array_remove), array_remove_item = js.Any.fromFunction2(array_remove_item), array_unique = js.Any.fromFunction1(array_unique), attributes = js.Any.fromFunction2(attributes), context = context.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VakataStatic]
  }
  
  extension [Self <: VakataStatic](x: Self) {
    
    inline def setArray_filter(value: (Any, Any, Any, js.Array[Any], Any) => js.Array[Any]): Self = StObject.set(x, "array_filter", js.Any.fromFunction5(value))
    
    inline def setArray_remove(value: (js.Array[Any], Double) => js.Array[Any]): Self = StObject.set(x, "array_remove", js.Any.fromFunction2(value))
    
    inline def setArray_remove_item(value: (js.Array[Any], Any) => js.Array[Any]): Self = StObject.set(x, "array_remove_item", js.Any.fromFunction2(value))
    
    inline def setArray_unique(value: js.Array[Any] => js.Array[Any]): Self = StObject.set(x, "array_unique", js.Any.fromFunction1(value))
    
    inline def setAttributes(value: (Any, Any) => Any): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDnd(value: Any): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
