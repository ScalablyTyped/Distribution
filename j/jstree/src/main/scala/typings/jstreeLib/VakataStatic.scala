package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VakataStatic extends js.Object {
  var context: js.Any
  var dnd: js.Any
  var html: js.Any
  var search: js.Any
  var storage: js.Any
  /**
    * filter array
    */
  def array_filter(c: js.Any, a: js.Any, b: js.Any, d: js.Array[_], e: js.Any): js.Array[_]
  /**
    * remove item from array
    */
  def array_remove(array: js.Array[_], from: scala.Double): js.Array[_]
  /**
    * remove item from array
    */
  def array_remove_item(array: js.Array[_], item: js.Any): js.Array[_]
  /**
    * returns array with unique elements
    */
  def array_unique(array: js.Array[_]): js.Array[_]
  /**
    * collect attributes
    */
  def attributes(node: js.Any, with_values: js.Any): js.Any
}

object VakataStatic {
  @scala.inline
  def apply(
    array_filter: (js.Any, js.Any, js.Any, js.Array[_], js.Any) => js.Array[_],
    array_remove: (js.Array[_], scala.Double) => js.Array[_],
    array_remove_item: (js.Array[_], js.Any) => js.Array[_],
    array_unique: js.Array[_] => js.Array[_],
    attributes: (js.Any, js.Any) => js.Any,
    context: js.Any,
    dnd: js.Any,
    html: js.Any,
    search: js.Any,
    storage: js.Any
  ): VakataStatic = {
    val __obj = js.Dynamic.literal(array_filter = js.Any.fromFunction5(array_filter), array_remove = js.Any.fromFunction2(array_remove), array_remove_item = js.Any.fromFunction2(array_remove_item), array_unique = js.Any.fromFunction1(array_unique), attributes = js.Any.fromFunction2(attributes), context = context, dnd = dnd, html = html, search = search, storage = storage)
  
    __obj.asInstanceOf[VakataStatic]
  }
}

