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
    destroy: js.Function0[scala.Unit],
    restore: js.Function0[scala.Unit],
    save: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    sheet: Sheet,
    stack: Stack
  ): UndoRedoSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("restore")(restore)
    __obj.updateDynamic("save")(save)
    __obj.updateDynamic("sheet")(sheet)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UndoRedoSnapshot]
  }
}

