package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an async batch file annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse extends js.Object {
  /**
    * The list of file annotation responses, one for each request in
    * AsyncBatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaGoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse] = null): SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AsyncBatchAnnotateFilesResponse]
  }
}

