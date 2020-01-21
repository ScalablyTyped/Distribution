package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Merges all cells in the range.
  */
@js.native
trait SchemaMergeCellsRequest extends js.Object {
  /**
    * How the cells should be merged.
    */
  var mergeType: js.UndefOr[String] = js.native
  /**
    * The range of cells to merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaMergeCellsRequest {
  @scala.inline
  def apply(mergeType: String = null, range: SchemaGridRange = null): SchemaMergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (mergeType != null) __obj.updateDynamic("mergeType")(mergeType.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMergeCellsRequest]
  }
}

