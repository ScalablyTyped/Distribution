package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to de-identify a list of items.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyContentRequest extends js.Object {
  /**
    * Configuration for the de-identification of the content item. Items
    * specified here will override the template referenced by the
    * deidentify_template_name argument.
    */
  var deidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.native
  /**
    * Optional template to use. Any configuration directly specified in
    * deidentify_config will override those set in the template. Singular
    * fields that are set in this request will replace their corresponding
    * fields in the template. Repeated fields are appended. Singular
    * sub-messages and groups are recursively merged.
    */
  var deidentifyTemplateName: js.UndefOr[String] = js.native
  /**
    * Configuration for the inspector. Items specified here will override the
    * template referenced by the inspect_template_name argument.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * Optional template to use. Any configuration directly specified in
    * inspect_config will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The item to de-identify. Will be treated as text.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
}

object SchemaGooglePrivacyDlpV2DeidentifyContentRequest {
  @scala.inline
  def apply(
    deidentifyConfig: SchemaGooglePrivacyDlpV2DeidentifyConfig = null,
    deidentifyTemplateName: String = null,
    inspectConfig: SchemaGooglePrivacyDlpV2InspectConfig = null,
    inspectTemplateName: String = null,
    item: SchemaGooglePrivacyDlpV2ContentItem = null
  ): SchemaGooglePrivacyDlpV2DeidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    if (deidentifyConfig != null) __obj.updateDynamic("deidentifyConfig")(deidentifyConfig.asInstanceOf[js.Any])
    if (deidentifyTemplateName != null) __obj.updateDynamic("deidentifyTemplateName")(deidentifyTemplateName.asInstanceOf[js.Any])
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (inspectTemplateName != null) __obj.updateDynamic("inspectTemplateName")(inspectTemplateName.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyContentRequest]
  }
}

