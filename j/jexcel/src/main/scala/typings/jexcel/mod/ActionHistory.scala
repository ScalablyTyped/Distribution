package typings.jexcel.mod

import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableRowElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionHistory extends js.Object {
  var action: String
  var insertBefore: Boolean
  var numOfRows: Double
  var rowData: js.Array[CellValue]
  var rowNode: js.Array[HTMLTableRowElement]
  var rowNumber: Double
  var rowRecords: js.Array[HTMLTableDataCellElement]
}

object ActionHistory {
  @scala.inline
  def apply(
    action: String,
    insertBefore: Boolean,
    numOfRows: Double,
    rowData: js.Array[CellValue],
    rowNode: js.Array[HTMLTableRowElement],
    rowNumber: Double,
    rowRecords: js.Array[HTMLTableDataCellElement]
  ): ActionHistory = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], numOfRows = numOfRows.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any], rowNumber = rowNumber.asInstanceOf[js.Any], rowRecords = rowRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionHistory]
  }
}

