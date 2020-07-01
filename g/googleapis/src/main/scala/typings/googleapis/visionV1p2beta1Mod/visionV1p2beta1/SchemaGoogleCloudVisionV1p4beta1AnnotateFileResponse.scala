package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse extends js.Object {
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1InputConfig] = js.native
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateImageResponse]] = js.native
  /**
    * This field gives the total number of pages in the file.
    */
  var totalPages: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse {
  @scala.inline
  def apply(
    inputConfig: SchemaGoogleCloudVisionV1p4beta1InputConfig = null,
    responses: js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateImageResponse] = null,
    totalPages: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    if (!js.isUndefined(totalPages)) __obj.updateDynamic("totalPages")(totalPages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]
  }
}

