package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse {
  @scala.inline
  def apply(responses: js.Array[SchemaGoogleCloudVisionV1p1beta1AnnotateImageResponse] = null): SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  }
}

