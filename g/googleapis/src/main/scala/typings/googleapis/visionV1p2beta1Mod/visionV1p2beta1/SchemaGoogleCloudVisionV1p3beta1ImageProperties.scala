package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores image properties, such as dominant colors.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1ImageProperties extends js.Object {
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1DominantColorsAnnotation] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1ImageProperties {
  @scala.inline
  def apply(dominantColors: SchemaGoogleCloudVisionV1p3beta1DominantColorsAnnotation = null): SchemaGoogleCloudVisionV1p3beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (dominantColors != null) __obj.updateDynamic("dominantColors")(dominantColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ImageProperties]
  }
}

