package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccounttaxCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaAccounttaxCustomBatchRequestEntry]] = js.native
}

object SchemaAccounttaxCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[SchemaAccounttaxCustomBatchRequestEntry] = null): SchemaAccounttaxCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccounttaxCustomBatchRequest]
  }
}

