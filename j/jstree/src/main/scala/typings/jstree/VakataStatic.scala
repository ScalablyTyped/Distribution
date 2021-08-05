package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VakataStatic extends StObject {
  
  /**
    * filter array
    */
  def array_filter(c: js.Any, a: js.Any, b: js.Any, d: js.Array[js.Any], e: js.Any): js.Array[js.Any]
  
  /**
    * remove item from array
    */
  def array_remove(array: js.Array[js.Any], from: Double): js.Array[js.Any]
  
  /**
    * remove item from array
    */
  def array_remove_item(array: js.Array[js.Any], item: js.Any): js.Array[js.Any]
  
  /**
    * returns array with unique elements
    */
  def array_unique(array: js.Array[js.Any]): js.Array[js.Any]
  
  /**
    * collect attributes
    */
  def attributes(node: js.Any, with_values: js.Any): js.Any
  
  var context: js.Any
  
  var dnd: js.Any
  
  var html: js.Any
  
  var search: js.Any
  
  var storage: js.Any
}
object VakataStatic {
  
  inline def apply(
    array_filter: (js.Any, js.Any, js.Any, js.Array[js.Any], js.Any) => js.Array[js.Any],
    array_remove: (js.Array[js.Any], Double) => js.Array[js.Any],
    array_remove_item: (js.Array[js.Any], js.Any) => js.Array[js.Any],
    array_unique: js.Array[js.Any] => js.Array[js.Any],
    attributes: (js.Any, js.Any) => js.Any,
    context: js.Any,
    dnd: js.Any,
    html: js.Any,
    search: js.Any,
    storage: js.Any
  ): VakataStatic = {
    val __obj = js.Dynamic.literal(array_filter = js.Any.fromFunction5(array_filter), array_remove = js.Any.fromFunction2(array_remove), array_remove_item = js.Any.fromFunction2(array_remove_item), array_unique = js.Any.fromFunction1(array_unique), attributes = js.Any.fromFunction2(attributes), context = context.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VakataStatic]
  }
  
  extension [Self <: VakataStatic](x: Self) {
    
    inline def setArray_filter(value: (js.Any, js.Any, js.Any, js.Array[js.Any], js.Any) => js.Array[js.Any]): Self = StObject.set(x, "array_filter", js.Any.fromFunction5(value))
    
    inline def setArray_remove(value: (js.Array[js.Any], Double) => js.Array[js.Any]): Self = StObject.set(x, "array_remove", js.Any.fromFunction2(value))
    
    inline def setArray_remove_item(value: (js.Array[js.Any], js.Any) => js.Array[js.Any]): Self = StObject.set(x, "array_remove_item", js.Any.fromFunction2(value))
    
    inline def setArray_unique(value: js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "array_unique", js.Any.fromFunction1(value))
    
    inline def setAttributes(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDnd(value: js.Any): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: js.Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: js.Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: js.Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
