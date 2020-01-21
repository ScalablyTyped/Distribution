package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait SchemaAnnotateImageRequest extends js.Object {
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaFeature]] = js.native
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaImageContext] = js.native
}

object SchemaAnnotateImageRequest {
  @scala.inline
  def apply(
    features: js.Array[SchemaFeature] = null,
    image: SchemaImage = null,
    imageContext: SchemaImageContext = null
  ): SchemaAnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotateImageRequest]
  }
}

