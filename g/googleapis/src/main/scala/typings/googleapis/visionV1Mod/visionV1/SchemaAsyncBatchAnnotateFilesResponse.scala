package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an async batch file annotation request.
  */
@js.native
trait SchemaAsyncBatchAnnotateFilesResponse extends js.Object {
  /**
    * The list of file annotation responses, one for each request in
    * AsyncBatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaAsyncAnnotateFileResponse]] = js.native
}

object SchemaAsyncBatchAnnotateFilesResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaAsyncAnnotateFileResponse] = null): SchemaAsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsyncBatchAnnotateFilesResponse]
  }
}

