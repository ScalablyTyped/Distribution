package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of dominant colors and their corresponding scores.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation extends js.Object {
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation {
  @scala.inline
  def apply(colors: js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo] = null): SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation]
  }
}

