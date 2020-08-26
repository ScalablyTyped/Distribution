package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts cells into a range, shifting the existing cells over or down.
  */
@js.native
trait SchemaInsertRangeRequest extends js.Object {
  /**
    * The range to insert new cells into.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The dimension which will be shifted when inserting cells. If ROWS,
    * existing cells will be shifted down. If COLUMNS, existing cells will be
    * shifted right.
    */
  var shiftDimension: js.UndefOr[String] = js.native
}

object SchemaInsertRangeRequest {
  @scala.inline
  def apply(): SchemaInsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertRangeRequest]
  }
  @scala.inline
  implicit class SchemaInsertRangeRequestOps[Self <: SchemaInsertRangeRequest] (val x: Self) extends AnyVal {
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

