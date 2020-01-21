package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unmerges cells in a Table.
  */
@js.native
trait SchemaUnmergeTableCellsRequest extends js.Object {
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table range specifying which cells of the table to unmerge.  All
    * merged cells in this range will be unmerged, and cells that are already
    * unmerged will not be affected. If the range has no merged cells, the
    * request will do nothing. If there is text in any of the merged cells, the
    * text will remain in the upper-left (&quot;head&quot;) cell of the
    * resulting block of unmerged cells.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.native
}

object SchemaUnmergeTableCellsRequest {
  @scala.inline
  def apply(objectId: String = null, tableRange: SchemaTableRange = null): SchemaUnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnmergeTableCellsRequest]
  }
}

