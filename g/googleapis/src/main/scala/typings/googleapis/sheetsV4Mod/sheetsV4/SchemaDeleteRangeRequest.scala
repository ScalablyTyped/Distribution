package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a range of cells, shifting other cells into the deleted area.
  */
@js.native
trait SchemaDeleteRangeRequest extends js.Object {
  /**
    * The range of cells to delete.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The dimension from which deleted cells will be replaced with. If ROWS,
    * existing cells will be shifted upward to replace the deleted cells. If
    * COLUMNS, existing cells will be shifted left to replace the deleted
    * cells.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}

object SchemaDeleteRangeRequest {
  @scala.inline
  def apply(): SchemaDeleteRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteRangeRequest]
  }
  @scala.inline
  implicit class SchemaDeleteRangeRequestOps[Self <: SchemaDeleteRangeRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setShiftDimension(value: String): Self = this.set("shiftDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShiftDimension: Self = this.set("shiftDimension", js.undefined)
  }
  
}

