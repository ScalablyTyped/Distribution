package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateDeidentifyTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends js.Object {
  /**
    * New DeidentifyTemplate value.
    */
  var deidentifyTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest {
  @scala.inline
  def apply(deidentifyTemplate: SchemaGooglePrivacyDlpV2DeidentifyTemplate = null, updateMask: String = null): SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (deidentifyTemplate != null) __obj.updateDynamic("deidentifyTemplate")(deidentifyTemplate.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  }
}

