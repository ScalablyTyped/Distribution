package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for crop hints annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1CropHintsParams extends js.Object {
  /**
    * Aspect ratios in floats, representing the ratio of the width to the
    * height of the image. For example, if the desired aspect ratio is 4/3, the
    * corresponding float value should be 1.33333.  If not specified, the best
    * possible crop is returned. The number of provided aspect ratios is
    * limited to a maximum of 16; any aspect ratios provided after the 16th are
    * ignored.
    */
  var aspectRatios: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1CropHintsParams {
  @scala.inline
  def apply(aspectRatios: js.Array[Double] = null): SchemaGoogleCloudVisionV1p1beta1CropHintsParams = {
    val __obj = js.Dynamic.literal()
    if (aspectRatios != null) __obj.updateDynamic("aspectRatios")(aspectRatios.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1CropHintsParams]
  }
}

