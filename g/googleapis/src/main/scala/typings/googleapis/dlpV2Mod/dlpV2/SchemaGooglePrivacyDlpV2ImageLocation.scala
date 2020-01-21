package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the finding within an image.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ImageLocation extends js.Object {
  /**
    * Bounding boxes locating the pixels within the image containing the
    * finding.
    */
  var boundingBoxes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2BoundingBox]] = js.native
}

object SchemaGooglePrivacyDlpV2ImageLocation {
  @scala.inline
  def apply(boundingBoxes: js.Array[SchemaGooglePrivacyDlpV2BoundingBox] = null): SchemaGooglePrivacyDlpV2ImageLocation = {
    val __obj = js.Dynamic.literal()
    if (boundingBoxes != null) __obj.updateDynamic("boundingBoxes")(boundingBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageLocation]
  }
}

