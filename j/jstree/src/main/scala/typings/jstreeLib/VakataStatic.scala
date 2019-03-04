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
    array_filter: js.Function5[js.Any, js.Any, js.Any, js.Array[_], js.Any, js.Array[_]],
    array_remove: js.Function2[js.Array[_], scala.Double, js.Array[_]],
    array_remove_item: js.Function2[js.Array[_], js.Any, js.Array[_]],
    array_unique: js.Function1[js.Array[_], js.Array[_]],
    attributes: js.Function2[js.Any, js.Any, js.Any],
    context: js.Any,
    dnd: js.Any,
    html: js.Any,
    search: js.Any,
    storage: js.Any
  ): VakataStatic = {
    val __obj = js.Dynamic.literal(array_filter = array_filter, array_remove = array_remove, array_remove_item = array_remove_item, array_unique = array_unique, attributes = attributes, context = context, dnd = dnd, html = html, search = search, storage = storage)
  
    __obj.asInstanceOf[VakataStatic]
  }
}

