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

object UndoRedoSnapshot {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    restore: () => scala.Unit,
    save: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    sheet: Sheet,
    stack: Stack
  ): UndoRedoSnapshot = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction3(save), sheet = sheet, stack = stack)
  
    __obj.asInstanceOf[UndoRedoSnapshot]
  }
}

