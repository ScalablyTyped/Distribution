package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range on a sheet. All indexes are zero-based. Indexes are half open, e.g
  * the start index is inclusive and the end index is exclusive --
  * [start_index, end_index). Missing indexes indicate the range is unbounded
  * on that side.  For example, if `&quot;Sheet1&quot;` is sheet ID 0, then:
  * `Sheet1!A1:A1 == sheet_id: 0,                   start_row_index: 0,
  * end_row_index: 1,                   start_column_index: 0,
  * end_column_index: 1`    `Sheet1!A3:B4 == sheet_id: 0, start_row_index: 2,
  * end_row_index: 4,                   start_column_index: 0,
  * end_column_index: 2`    `Sheet1!A:B == sheet_id: 0, start_column_index: 0,
  * end_column_index: 2`    `Sheet1!A5:B == sheet_id: 0, start_row_index: 4,
  * start_column_index: 0, end_column_index: 2`    `Sheet1 == sheet_id:0`  The
  * start index must always be less than or equal to the end index. If the
  * start index equals the end index, then the range is empty. Empty ranges are
  * typically not meaningful and are usually rendered in the UI as `#REF!`.
  */
@js.native
trait SchemaGridRange extends js.Object {
  /**
    * The end column (exclusive) of the range, or not set if unbounded.
    */
  var endColumnIndex: js.UndefOr[Double] = js.native
  /**
    * The end row (exclusive) of the range, or not set if unbounded.
    */
  var endRowIndex: js.UndefOr[Double] = js.native
  /**
    * The sheet this range is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The start column (inclusive) of the range, or not set if unbounded.
    */
  var startColumnIndex: js.UndefOr[Double] = js.native
  /**
    * The start row (inclusive) of the range, or not set if unbounded.
    */
  var startRowIndex: js.UndefOr[Double] = js.native
}

object SchemaGridRange {
  @scala.inline
  def apply(): SchemaGridRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGridRange]
  }
  @scala.inline
  implicit class SchemaGridRangeOps[Self <: SchemaGridRange] (val x: Self) extends AnyVal {
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
    def setEndColumnIndex(value: Double): Self = this.set("endColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndColumnIndex: Self = this.set("endColumnIndex", js.undefined)
    @scala.inline
    def setEndRowIndex(value: Double): Self = this.set("endRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndRowIndex: Self = this.set("endRowIndex", js.undefined)
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    @scala.inline
    def setStartColumnIndex(value: Double): Self = this.set("startColumnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartColumnIndex: Self = this.set("startColumnIndex", js.undefined)
    @scala.inline
    def setStartRowIndex(value: Double): Self = this.set("startRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRowIndex: Self = this.set("startRowIndex", js.undefined)
  }
  
}

