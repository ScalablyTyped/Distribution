package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a column from a table.
  */
@js.native
trait SchemaDeleteTableColumnRequest extends js.Object {
  /**
    * The reference table cell location from which a column will be deleted.
    * The column this cell spans will be deleted. If this is a merged cell,
    * multiple columns will be deleted. If no columns remain in the table after
    * this deletion, the whole table is deleted.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The table to delete columns from.
    */
  var tableObjectId: js.UndefOr[String] = js.native
}

object SchemaDeleteTableColumnRequest {
  @scala.inline
  def apply(cellLocation: SchemaTableCellLocation = null, tableObjectId: String = null): SchemaDeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (tableObjectId != null) __obj.updateDynamic("tableObjectId")(tableObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteTableColumnRequest]
  }
}

