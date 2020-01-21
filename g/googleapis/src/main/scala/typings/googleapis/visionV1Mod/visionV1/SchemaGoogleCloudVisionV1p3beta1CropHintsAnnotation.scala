package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation extends js.Object {
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1CropHint]] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation {
  @scala.inline
  def apply(cropHints: js.Array[SchemaGoogleCloudVisionV1p3beta1CropHint] = null): SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (cropHints != null) __obj.updateDynamic("cropHints")(cropHints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1CropHintsAnnotation]
  }
}

