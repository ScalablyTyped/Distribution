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
  def apply(): SchemaGooglePrivacyDlpV2ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageRedactionConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ImageRedactionConfigOps[Self <: SchemaGooglePrivacyDlpV2ImageRedactionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    @scala.inline
    def setRedactAllText(value: Boolean): Self = this.set("redactAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedactAllText: Self = this.set("redactAllText", js.undefined)
    @scala.inline
    def setRedactionColor(value: SchemaGooglePrivacyDlpV2Color): Self = this.set("redactionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedactionColor: Self = this.set("redactionColor", js.undefined)
  }
  
}

