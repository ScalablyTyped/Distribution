package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a row from a table.
  */
@js.native
trait SchemaDeleteTableRowRequest extends js.Object {
  /**
    * The reference table cell location from which the row will be deleted. The
    * row this cell spans will be deleted. If this is a merged cell that spans
    * multiple rows, all rows that the cell spans will be deleted. If no rows
    * remain in the table after this deletion, the whole table is deleted.
    */
  var tableCellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
}

object SchemaDeleteTableRowRequest {
  @scala.inline
  def apply(tableCellLocation: SchemaTableCellLocation = null): SchemaDeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    if (tableCellLocation != null) __obj.updateDynamic("tableCellLocation")(tableCellLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteTableRowRequest]
  }
}

