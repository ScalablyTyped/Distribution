package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiasettingsCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaLiasettingsCustomBatchRequestEntry]] = js.native
}

object SchemaLiasettingsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[SchemaLiasettingsCustomBatchRequestEntry] = null): SchemaLiasettingsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiasettingsCustomBatchRequest]
  }
}

