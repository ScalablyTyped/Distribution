package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a column from a table.
  */
@js.native
trait SchemaDeleteTableColumnRequest extends js.Object {
  /**
    * The reference table cell location from which the column will be deleted.
    * The column this cell spans will be deleted. If this is a merged cell that
    * spans multiple columns, all columns that the cell spans will be deleted.
    * If no columns remain in the table after this deletion, the whole table is
    * deleted.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
}

object SchemaDeleteTableColumnRequest {
  @scala.inline
  def apply(tableCellLocation: SchemaTableCellLocation = null): SchemaDeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    if (tableCellLocation != null) __obj.updateDynamic("tableCellLocation")(tableCellLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteTableColumnRequest]
  }
}

