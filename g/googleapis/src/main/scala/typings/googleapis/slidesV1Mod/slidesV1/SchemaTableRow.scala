package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and contents of each row in a table.
  */
@js.native
trait SchemaTableRow extends js.Object {
  /**
    * Height of a row.
    */
  var rowHeight: js.UndefOr[SchemaDimension] = js.native
  /**
    * Properties and contents of each cell.  Cells that span multiple columns
    * are represented only once with a column_span greater than 1. As a result,
    * the length of this collection does not always match the number of columns
    * of the entire table.
    */
  var tableCells: js.UndefOr[js.Array[SchemaTableCell]] = js.native
  /**
    * Properties of the row.
    */
  var tableRowProperties: js.UndefOr[SchemaTableRowProperties] = js.native
}

object SchemaTableRow {
  @scala.inline
  def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  @scala.inline
  implicit class SchemaTableRowOps[Self <: SchemaTableRow] (val x: Self) extends AnyVal {
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
    def setRowHeight(value: SchemaDimension): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setTableCellsVarargs(value: SchemaTableCell*): Self = this.set("tableCells", js.Array(value :_*))
    @scala.inline
    def setTableCells(value: js.Array[SchemaTableCell]): Self = this.set("tableCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCells: Self = this.set("tableCells", js.undefined)
    @scala.inline
    def setTableRowProperties(value: SchemaTableRowProperties): Self = this.set("tableRowProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRowProperties: Self = this.set("tableRowProperties", js.undefined)
  }
  
}

