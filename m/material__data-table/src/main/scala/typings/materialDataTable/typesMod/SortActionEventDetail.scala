package typings.materialDataTable.typesMod

import typings.materialDataTable.constantsMod.SortValue
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortActionEventDetail extends js.Object {
  var columnId: String | Null = js.native
  var columnIndex: Double = js.native
  var headerCell: HTMLElement = js.native
  var sortValue: SortValue = js.native
}

object SortActionEventDetail {
  @scala.inline
  def apply(columnIndex: Double, headerCell: HTMLElement, sortValue: SortValue): SortActionEventDetail = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], headerCell = headerCell.asInstanceOf[js.Any], sortValue = sortValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortActionEventDetail]
  }
  @scala.inline
  implicit class SortActionEventDetailOps[Self <: SortActionEventDetail] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderCell(value: HTMLElement): Self = this.set("headerCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortValue(value: SortValue): Self = this.set("sortValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnId(value: String): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnIdNull: Self = this.set("columnId", null)
  }
  
}

