package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of redacting an image.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RedactImageResponse extends js.Object {
  /**
    * If an image was being inspected and the InspectConfig&#39;s include_quote
    * was set to true, then this field will include all text, if any, that was
    * found in the image.
    */
  var extractedText: js.UndefOr[String] = js.native
  /**
    * The findings. Populated when include_findings in the request is true.
    */
  var inspectResult: js.UndefOr[SchemaGooglePrivacyDlpV2InspectResult] = js.native
  /**
    * The redacted image. The type will be the same as the original image.
    */
  var redactedImage: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2RedactImageResponse {
  @scala.inline
  def apply(
    extractedText: String = null,
    inspectResult: SchemaGooglePrivacyDlpV2InspectResult = null,
    redactedImage: String = null
  ): SchemaGooglePrivacyDlpV2RedactImageResponse = {
    val __obj = js.Dynamic.literal()
    if (extractedText != null) __obj.updateDynamic("extractedText")(extractedText.asInstanceOf[js.Any])
    if (inspectResult != null) __obj.updateDynamic("inspectResult")(inspectResult.asInstanceOf[js.Any])
    if (redactedImage != null) __obj.updateDynamic("redactedImage")(redactedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RedactImageResponse]
  }
}

