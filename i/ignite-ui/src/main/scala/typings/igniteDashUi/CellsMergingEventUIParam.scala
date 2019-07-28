package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellsMergingEventUIParam extends js.Object {
  /**
  	 * Gets the column key the merge is being executed for.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the first record in the merging chain that the merge is executed for.
  	 */
  var firstRecord: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to igGridCellMerging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the next record in the merging chain that the merge is executed for.
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

object CellsMergingEventUIParam {
  @scala.inline
  def apply(
    columnKey: String = null,
    firstRecord: js.Any = null,
    owner: js.Any = null,
    record: js.Any = null,
    row: String = null,
    rowId: js.Any = null,
    rowIndex: Int | Double = null
  ): CellsMergingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (firstRecord != null) __obj.updateDynamic("firstRecord")(firstRecord)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (record != null) __obj.updateDynamic("record")(record)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowId != null) __obj.updateDynamic("rowId")(rowId)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellsMergingEventUIParam]
  }
}

