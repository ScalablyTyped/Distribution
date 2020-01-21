package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest extends js.Object {
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1Feature]] = js.native
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1Image] = js.native
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1ImageContext] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest {
  @scala.inline
  def apply(
    features: js.Array[SchemaGoogleCloudVisionV1p2beta1Feature] = null,
    image: SchemaGoogleCloudVisionV1p2beta1Image = null,
    imageContext: SchemaGoogleCloudVisionV1p2beta1ImageContext = null
  ): SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1AnnotateImageRequest]
  }
}

