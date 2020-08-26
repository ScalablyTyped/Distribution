package typings.jexcel.mod

import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableRowElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionHistory extends js.Object {
  var action: String = js.native
  var insertBefore: Boolean = js.native
  var numOfRows: Double = js.native
  var rowData: js.Array[CellValue] = js.native
  var rowNode: js.Array[HTMLTableRowElement] = js.native
  var rowNumber: Double = js.native
  var rowRecords: js.Array[HTMLTableDataCellElement] = js.native
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
  @scala.inline
  implicit class ActionHistoryOps[Self <: ActionHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertBefore(value: Boolean): Self = this.set("insertBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumOfRows(value: Double): Self = this.set("numOfRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowDataVarargs(value: CellValue*): Self = this.set("rowData", js.Array(value :_*))
    @scala.inline
    def setRowData(value: js.Array[CellValue]): Self = this.set("rowData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowNodeVarargs(value: HTMLTableRowElement*): Self = this.set("rowNode", js.Array(value :_*))
    @scala.inline
    def setRowNode(value: js.Array[HTMLTableRowElement]): Self = this.set("rowNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowNumber(value: Double): Self = this.set("rowNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowRecordsVarargs(value: HTMLTableDataCellElement*): Self = this.set("rowRecords", js.Array(value :_*))
    @scala.inline
    def setRowRecords(value: js.Array[HTMLTableDataCellElement]): Self = this.set("rowRecords", value.asInstanceOf[js.Any])
  }
  
}

