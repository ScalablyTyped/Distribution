package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a single offline file annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse extends js.Object {
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1OutputConfig] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse {
  @scala.inline
  def apply(outputConfig: SchemaGoogleCloudVisionV1p4beta1OutputConfig = null): SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse]
  }
}

