package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information detected on the structural component.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty extends js.Object {
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak] = js.native
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty {
  @scala.inline
  def apply(
    detectedBreak: SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak = null,
    detectedLanguages: js.Array[SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage] = null
  ): SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    if (detectedBreak != null) __obj.updateDynamic("detectedBreak")(detectedBreak.asInstanceOf[js.Any])
    if (detectedLanguages != null) __obj.updateDynamic("detectedLanguages")(detectedLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty]
  }
}

