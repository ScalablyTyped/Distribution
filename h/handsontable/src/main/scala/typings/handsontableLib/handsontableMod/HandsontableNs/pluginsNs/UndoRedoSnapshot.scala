package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndoRedoSnapshot extends js.Object {
  var sheet: Sheet
  var stack: Stack
  def destroy(): scala.Unit
  def restore(): scala.Unit
  def save(axis: java.lang.String, index: scala.Double, amount: scala.Double): scala.Unit
}

