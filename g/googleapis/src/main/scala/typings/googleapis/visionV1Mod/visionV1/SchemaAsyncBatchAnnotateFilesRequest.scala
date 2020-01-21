package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple async file annotation requests are batched into a single service
  * call.
  */
@js.native
trait SchemaAsyncBatchAnnotateFilesRequest extends js.Object {
  /**
    * Individual async file annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaAsyncAnnotateFileRequest]] = js.native
}

object SchemaAsyncBatchAnnotateFilesRequest {
  @scala.inline
  def apply(requests: js.Array[SchemaAsyncAnnotateFileRequest] = null): SchemaAsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsyncBatchAnnotateFilesRequest]
  }
}

