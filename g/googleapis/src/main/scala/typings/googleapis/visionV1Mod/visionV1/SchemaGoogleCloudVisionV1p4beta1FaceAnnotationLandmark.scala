package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A face-specific landmark (for example, a face feature).
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark extends js.Object {
  /**
    * Face landmark position.
    */
  var position: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1Position] = js.native
  /**
    * Face landmark type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark {
  @scala.inline
  def apply(position: SchemaGoogleCloudVisionV1p4beta1Position = null, `type`: String = null): SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1FaceAnnotationLandmark]
  }
}

