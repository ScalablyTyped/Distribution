package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateDeidentifyTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest extends js.Object {
  /**
    * The DeidentifyTemplate to create.
    */
  var deidentifyTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest {
  @scala.inline
  def apply(deidentifyTemplate: SchemaGooglePrivacyDlpV2DeidentifyTemplate = null, templateId: String = null): SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (deidentifyTemplate != null) __obj.updateDynamic("deidentifyTemplate")(deidentifyTemplate.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  }
}

