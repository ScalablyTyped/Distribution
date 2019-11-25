package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndoRedoSnapshot extends js.Object {
  var sheet: Sheet
  var stack: Stack
  def destroy(): Unit
  def restore(): Unit
  def save(axis: String, index: Double, amount: Double): Unit
}

object UndoRedoSnapshot {
  @scala.inline
  def apply(
    destroy: () => Unit,
    restore: () => Unit,
    save: (String, Double, Double) => Unit,
    sheet: Sheet,
    stack: Stack
  ): UndoRedoSnapshot = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction3(save), sheet = sheet.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UndoRedoSnapshot]
  }
}

