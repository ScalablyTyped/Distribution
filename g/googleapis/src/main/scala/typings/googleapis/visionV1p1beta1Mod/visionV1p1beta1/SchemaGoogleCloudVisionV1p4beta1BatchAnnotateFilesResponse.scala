package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of file annotation responses.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse extends js.Object {
  /**
    * The list of file annotation responses, each response corresponding to
    * each AnnotateFileRequest in BatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse] = null): SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse]
  }
}

