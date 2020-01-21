package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search for potentially sensitive info in an image and redact it
  * by covering it with a colored rectangle.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RedactImageRequest extends js.Object {
  /**
    * The content must be PNG, JPEG, SVG or BMP.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.native
  /**
    * The configuration for specifying what content to redact from images.
    */
  var imageRedactionConfigs: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig]] = js.native
  /**
    * Whether the response should include findings along with the redacted
    * image.
    */
  var includeFindings: js.UndefOr[Boolean] = js.native
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
}

object SchemaGooglePrivacyDlpV2RedactImageRequest {
  @scala.inline
  def apply(
    byteItem: SchemaGooglePrivacyDlpV2ByteContentItem = null,
    imageRedactionConfigs: js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig] = null,
    includeFindings: js.UndefOr[Boolean] = js.undefined,
    inspectConfig: SchemaGooglePrivacyDlpV2InspectConfig = null
  ): SchemaGooglePrivacyDlpV2RedactImageRequest = {
    val __obj = js.Dynamic.literal()
    if (byteItem != null) __obj.updateDynamic("byteItem")(byteItem.asInstanceOf[js.Any])
    if (imageRedactionConfigs != null) __obj.updateDynamic("imageRedactionConfigs")(imageRedactionConfigs.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFindings)) __obj.updateDynamic("includeFindings")(includeFindings.asInstanceOf[js.Any])
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RedactImageRequest]
  }
}

