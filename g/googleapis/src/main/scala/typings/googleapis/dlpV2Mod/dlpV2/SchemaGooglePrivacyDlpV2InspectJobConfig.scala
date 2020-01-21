package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2InspectJobConfig extends js.Object {
  /**
    * Actions to execute at the completion of the job. Are executed in the
    * order provided.
    */
  var actions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Action]] = js.native
  /**
    * How and what to scan for.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * If provided, will be used as the default for all values in InspectConfig.
    * `inspect_config` will be merged into the values persisted as part of the
    * template.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The data to scan.
    */
  var storageConfig: js.UndefOr[SchemaGooglePrivacyDlpV2StorageConfig] = js.native
}

object SchemaGooglePrivacyDlpV2InspectJobConfig {
  @scala.inline
  def apply(
    actions: js.Array[SchemaGooglePrivacyDlpV2Action] = null,
    inspectConfig: SchemaGooglePrivacyDlpV2InspectConfig = null,
    inspectTemplateName: String = null,
    storageConfig: SchemaGooglePrivacyDlpV2StorageConfig = null
  ): SchemaGooglePrivacyDlpV2InspectJobConfig = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (inspectTemplateName != null) __obj.updateDynamic("inspectTemplateName")(inspectTemplateName.asInstanceOf[js.Any])
    if (storageConfig != null) __obj.updateDynamic("storageConfig")(storageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectJobConfig]
  }
}

