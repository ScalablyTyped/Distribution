package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse extends js.Object {
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1InputConfig] = js.native
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse]] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse {
  @scala.inline
  def apply(
    inputConfig: SchemaGoogleCloudVisionV1p3beta1InputConfig = null,
    responses: js.Array[SchemaGoogleCloudVisionV1p3beta1AnnotateImageResponse] = null
  ): SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1AnnotateFileResponse]
  }
}

