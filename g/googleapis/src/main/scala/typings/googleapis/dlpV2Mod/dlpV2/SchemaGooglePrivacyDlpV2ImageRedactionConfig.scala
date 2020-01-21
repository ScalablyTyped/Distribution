package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for determining how redaction of images should occur.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ImageRedactionConfig extends js.Object {
  /**
    * Only one per info_type should be provided per request. If not specified,
    * and redact_all_text is false, the DLP API will redact all text that it
    * matches against all info_types that are found, but not specified in
    * another ImageRedactionConfig.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * If true, all text found in the image, regardless whether it matches an
    * info_type, is redacted. Only one should be provided.
    */
  var redactAllText: js.UndefOr[Boolean] = js.native
  /**
    * The color to use when redacting content from an image. If not specified,
    * the default is black.
    */
  var redactionColor: js.UndefOr[SchemaGooglePrivacyDlpV2Color] = js.native
}

object SchemaGooglePrivacyDlpV2ImageRedactionConfig {
  @scala.inline
  def apply(
    infoType: SchemaGooglePrivacyDlpV2InfoType = null,
    redactAllText: js.UndefOr[Boolean] = js.undefined,
    redactionColor: SchemaGooglePrivacyDlpV2Color = null
  ): SchemaGooglePrivacyDlpV2ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (!js.isUndefined(redactAllText)) __obj.updateDynamic("redactAllText")(redactAllText.asInstanceOf[js.Any])
    if (redactionColor != null) __obj.updateDynamic("redactionColor")(redactionColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageRedactionConfig]
  }
}

