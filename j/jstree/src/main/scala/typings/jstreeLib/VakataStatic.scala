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

