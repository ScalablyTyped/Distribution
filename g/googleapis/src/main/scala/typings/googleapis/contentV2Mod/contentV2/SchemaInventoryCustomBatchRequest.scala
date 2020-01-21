package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInventoryCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaInventoryCustomBatchRequestEntry]] = js.native
}

object SchemaInventoryCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[SchemaInventoryCustomBatchRequestEntry] = null): SchemaInventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInventoryCustomBatchRequest]
  }
}

