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
  def apply(
    endColumnIndex: Int | Double = null,
    endRowIndex: Int | Double = null,
    sheetId: Int | Double = null,
    startColumnIndex: Int | Double = null,
    startRowIndex: Int | Double = null
  ): SchemaGridRange = {
    val __obj = js.Dynamic.literal()
    if (endColumnIndex != null) __obj.updateDynamic("endColumnIndex")(endColumnIndex.asInstanceOf[js.Any])
    if (endRowIndex != null) __obj.updateDynamic("endRowIndex")(endRowIndex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    if (startColumnIndex != null) __obj.updateDynamic("startColumnIndex")(startColumnIndex.asInstanceOf[js.Any])
    if (startRowIndex != null) __obj.updateDynamic("startRowIndex")(startRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGridRange]
  }
}

