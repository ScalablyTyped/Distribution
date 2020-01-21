package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Merges cells in a Table.
  */
@js.native
trait SchemaMergeTableCellsRequest extends js.Object {
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table range specifying which cells of the table to merge.  Any text
    * in the cells being merged will be concatenated and stored in the
    * upper-left (&quot;head&quot;) cell of the range. If the range is
    * non-rectangular (which can occur in some cases where the range covers
    * cells that are already merged), a 400 bad request error is returned.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.native
}

object SchemaMergeTableCellsRequest {
  @scala.inline
  def apply(objectId: String = null, tableRange: SchemaTableRange = null): SchemaMergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMergeTableCellsRequest]
  }
}

