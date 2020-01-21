package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an async batch image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse extends js.Object {
  /**
    * The output location and metadata from AsyncBatchAnnotateImagesRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1OutputConfig] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse {
  @scala.inline
  def apply(outputConfig: SchemaGoogleCloudVisionV1p4beta1OutputConfig = null): SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse]
  }
}

