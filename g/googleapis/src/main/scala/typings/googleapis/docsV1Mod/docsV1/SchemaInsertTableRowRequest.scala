package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts an empty row into a table.
  */
@js.native
trait SchemaInsertTableRowRequest extends js.Object {
  /**
    * Whether to insert new row below the reference cell location.  - `True`:
    * insert below the cell. - `False`: insert above the cell.
    */
  var insertBelow: js.UndefOr[Boolean] = js.native
  /**
    * The reference table cell location from which rows will be inserted.  A
    * new row will be inserted above (or below) the row where the reference
    * cell is. If the reference cell is a merged cell, a new row will be
    * inserted above (or below) the merged cell.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
}

object SchemaInsertTableRowRequest {
  @scala.inline
  def apply(): SchemaInsertTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableRowRequest]
  }
  @scala.inline
  implicit class SchemaInsertTableRowRequestOps[Self <: SchemaInsertTableRowRequest] (val x: Self) extends AnyVal {
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
    def setInsertBelow(value: Boolean): Self = this.set("insertBelow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertBelow: Self = this.set("insertBelow", js.undefined)
    @scala.inline
    def setTableCellLocation(value: SchemaTableCellLocation): Self = this.set("tableCellLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellLocation: Self = this.set("tableCellLocation", js.undefined)
  }
  
}

