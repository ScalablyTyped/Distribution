package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts columns into a table.  Other columns in the table will be resized
  * to fit the new column.
  */
@js.native
trait SchemaInsertTableColumnsRequest extends js.Object {
  /**
    * The reference table cell location from which columns will be inserted.  A
    * new column will be inserted to the left (or right) of the column where
    * the reference cell is. If the reference cell is a merged cell, a new
    * column will be inserted to the left (or right) of the merged cell.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * Whether to insert new columns to the right of the reference cell
    * location.  - `True`: insert to the right. - `False`: insert to the left.
    */
  var insertRight: js.UndefOr[Boolean] = js.native
  /**
    * The number of columns to be inserted. Maximum 20 per request.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * The table to insert columns into.
    */
  var tableObjectId: js.UndefOr[String] = js.native
}

object SchemaInsertTableColumnsRequest {
  @scala.inline
  def apply(): SchemaInsertTableColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableColumnsRequest]
  }
  @scala.inline
  implicit class SchemaInsertTableColumnsRequestOps[Self <: SchemaInsertTableColumnsRequest] (val x: Self) extends AnyVal {
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
    def setCellLocation(value: SchemaTableCellLocation): Self = this.set("cellLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellLocation: Self = this.set("cellLocation", js.undefined)
    @scala.inline
    def setInsertRight(value: Boolean): Self = this.set("insertRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertRight: Self = this.set("insertRight", js.undefined)
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setTableObjectId(value: String): Self = this.set("tableObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableObjectId: Self = this.set("tableObjectId", js.undefined)
  }
  
}

