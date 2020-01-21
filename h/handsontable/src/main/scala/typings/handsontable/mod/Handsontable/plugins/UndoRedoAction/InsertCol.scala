package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.insert_col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertCol extends js.Object {
  var actionType: insert_col
  var amount: Double
  var index: Double
}

object InsertCol {
  @scala.inline
  def apply(actionType: insert_col, amount: Double, index: Double): InsertCol = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsertCol]
  }
}

