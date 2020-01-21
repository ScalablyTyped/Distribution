package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to re-identify an item.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ReidentifyContentRequest extends js.Object {
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * Optional template to use. Any configuration directly specified in
    * `inspect_config` will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The item to re-identify. Will be treated as text.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
  /**
    * Configuration for the re-identification of the content item. This field
    * shares the same proto message type that is used for de-identification,
    * however its usage here is for the reversal of the previous
    * de-identification. Re-identification is performed by examining the
    * transformations used to de-identify the items and executing the reverse.
    * This requires that only reversible transformations be provided here. The
    * reversible transformations are:   - `CryptoReplaceFfxFpeConfig`
    */
  var reidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.native
  /**
    * Optional template to use. References an instance of `DeidentifyTemplate`.
    * Any configuration directly specified in `reidentify_config` or
    * `inspect_config` will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var reidentifyTemplateName: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ReidentifyContentRequest {
  @scala.inline
  def apply(
    inspectConfig: SchemaGooglePrivacyDlpV2InspectConfig = null,
    inspectTemplateName: String = null,
    item: SchemaGooglePrivacyDlpV2ContentItem = null,
    reidentifyConfig: SchemaGooglePrivacyDlpV2DeidentifyConfig = null,
    reidentifyTemplateName: String = null
  ): SchemaGooglePrivacyDlpV2ReidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (inspectTemplateName != null) __obj.updateDynamic("inspectTemplateName")(inspectTemplateName.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (reidentifyConfig != null) __obj.updateDynamic("reidentifyConfig")(reidentifyConfig.asInstanceOf[js.Any])
    if (reidentifyTemplateName != null) __obj.updateDynamic("reidentifyTemplateName")(reidentifyTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReidentifyContentRequest]
  }
}

