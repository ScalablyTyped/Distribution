package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unmerges cells in the given range.
  */
@js.native
trait SchemaUnmergeCellsRequest extends js.Object {
  /**
    * The range within which all cells should be unmerged. If the range spans
    * multiple merges, all will be unmerged. The range must not partially span
    * any merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaUnmergeCellsRequest {
  @scala.inline
  def apply(range: SchemaGridRange = null): SchemaUnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnmergeCellsRequest]
  }
}

