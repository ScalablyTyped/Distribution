package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateInspectTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest extends js.Object {
  /**
    * The InspectTemplate to create.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest {
  @scala.inline
  def apply(inspectTemplate: SchemaGooglePrivacyDlpV2InspectTemplate = null, templateId: String = null): SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectTemplate != null) __obj.updateDynamic("inspectTemplate")(inspectTemplate.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateInspectTemplateRequest]
  }
}

