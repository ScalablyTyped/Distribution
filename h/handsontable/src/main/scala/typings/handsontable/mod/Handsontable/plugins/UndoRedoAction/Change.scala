package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.change
import typings.handsontable.mod.Handsontable.CellChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var actionType: change
  var changes: js.Array[CellChange]
}

object Change {
  @scala.inline
  def apply(actionType: change, changes: js.Array[CellChange]): Change = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

