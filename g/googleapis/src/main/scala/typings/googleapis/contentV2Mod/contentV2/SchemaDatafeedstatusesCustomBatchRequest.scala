package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDatafeedstatusesCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaDatafeedstatusesCustomBatchRequestEntry]] = js.native
}

object SchemaDatafeedstatusesCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[SchemaDatafeedstatusesCustomBatchRequestEntry] = null): SchemaDatafeedstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeedstatusesCustomBatchRequest]
  }
}

