package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateInspectTemplate.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest extends js.Object {
  /**
    * New InspectTemplate value.
    */
  var inspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest {
  @scala.inline
  def apply(inspectTemplate: SchemaGooglePrivacyDlpV2InspectTemplate = null, updateMask: String = null): SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectTemplate != null) __obj.updateDynamic("inspectTemplate")(inspectTemplate.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateInspectTemplateRequest]
  }
}

