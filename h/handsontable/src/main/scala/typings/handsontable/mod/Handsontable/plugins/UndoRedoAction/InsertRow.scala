package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.insert_row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertRow extends js.Object {
  var actionType: insert_row
  var amount: Double
  var index: Double
}

object InsertRow {
  @scala.inline
  def apply(actionType: insert_row, amount: Double, index: Double): InsertRow = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsertRow]
  }
}

