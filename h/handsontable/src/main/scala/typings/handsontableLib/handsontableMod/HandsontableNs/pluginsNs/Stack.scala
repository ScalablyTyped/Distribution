package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Stack extends js.Object {
  var items: js.Array[_]
  def isEmpty(): scala.Boolean
  def peek(): js.Any
  def pop(): js.Any
  def push(items: js.Any): scala.Unit
  def size(): scala.Double
}

