package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShippingsettingsCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaShippingsettingsCustomBatchRequestEntry]] = js.native
}

object SchemaShippingsettingsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[SchemaShippingsettingsCustomBatchRequestEntry] = null): SchemaShippingsettingsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShippingsettingsCustomBatchRequest]
  }
}

