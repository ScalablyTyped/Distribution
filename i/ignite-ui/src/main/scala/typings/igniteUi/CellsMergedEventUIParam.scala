package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellsMergedEventUIParam extends js.Object {
  /**
  	 * Gets the column key the merge is being executed for.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the total count of cells that were merged.
  	 */
  var count: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the first record in the merging chain that the merge is executed for.
  	 */
  var firstRecord: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to igGridCellMerging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the last record in the merging chain that the merge is executed for.
  	 */
  var record: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the row the merged group starts in if available in the DOM.
  	 */
  var row: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the PK of the row the merged group starts in if available.
  	 */
  var rowId: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the data index of the row the merged group starts in.
  	 */
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object CellsMergedEventUIParam {
  @scala.inline
  def apply(
    columnKey: String = null,
    count: Int | Double = null,
    firstRecord: js.Any = null,
    owner: js.Any = null,
    record: js.Any = null,
    row: String = null,
    rowId: js.Any = null,
    rowIndex: Int | Double = null
  ): CellsMergedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (firstRecord != null) __obj.updateDynamic("firstRecord")(firstRecord.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (record != null) __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellsMergedEventUIParam]
  }
}

