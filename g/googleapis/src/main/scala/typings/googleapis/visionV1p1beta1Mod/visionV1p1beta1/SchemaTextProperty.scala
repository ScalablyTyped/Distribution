package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information detected on the structural component.
  */
@js.native
trait SchemaTextProperty extends js.Object {
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[SchemaDetectedBreak] = js.native
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaDetectedLanguage]] = js.native
}

object SchemaTextProperty {
  @scala.inline
  def apply(
    detectedBreak: SchemaDetectedBreak = null,
    detectedLanguages: js.Array[SchemaDetectedLanguage] = null
  ): SchemaTextProperty = {
    val __obj = js.Dynamic.literal()
    if (detectedBreak != null) __obj.updateDynamic("detectedBreak")(detectedBreak.asInstanceOf[js.Any])
    if (detectedLanguages != null) __obj.updateDynamic("detectedLanguages")(detectedLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextProperty]
  }
}

