package typings.materialDataTable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCDataTableRowSelectionChangedEventDetail extends js.Object {
  var rowId: String | Null = js.native
  var rowIndex: Double = js.native
  var selected: Boolean = js.native
}

object MDCDataTableRowSelectionChangedEventDetail {
  @scala.inline
  def apply(rowIndex: Double, selected: Boolean): MDCDataTableRowSelectionChangedEventDetail = {
    val __obj = js.Dynamic.literal(rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCDataTableRowSelectionChangedEventDetail]
  }
  @scala.inline
  implicit class MDCDataTableRowSelectionChangedEventDetailOps[Self <: MDCDataTableRowSelectionChangedEventDetail] (val x: Self) extends AnyVal {
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
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowId(value: String): Self = this.set("rowId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIdNull: Self = this.set("rowId", null)
  }
  
}

