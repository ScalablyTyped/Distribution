package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sorts data in rows based on a sort order per column.
  */
@js.native
trait SchemaSortRangeRequest extends js.Object {
  /**
    * The range to sort.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
}

object SchemaSortRangeRequest {
  @scala.inline
  def apply(range: SchemaGridRange = null, sortSpecs: js.Array[SchemaSortSpec] = null): SchemaSortRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSortRangeRequest]
  }
}

