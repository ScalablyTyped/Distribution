package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The inspectTemplate contains a configuration (set of types of sensitive
  * data to be detected) to be used anywhere you otherwise would normally
  * specify InspectConfig. See
  * https://cloud.google.com/dlp/docs/concepts-templates to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectTemplate extends js.Object {
  /**
    * The creation timestamp of a inspectTemplate, output only field.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Short description (max 256 chars).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name (max 256 chars).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The core content of the template. Configuration of the scanning process.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * The template name. Output only.  The template will have one of the
    * following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
    * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The last update timestamp of a inspectTemplate, output only field.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2InspectTemplate {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    displayName: String = null,
    inspectConfig: SchemaGooglePrivacyDlpV2InspectConfig = null,
    name: String = null,
    updateTime: String = null
  ): SchemaGooglePrivacyDlpV2InspectTemplate = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectTemplate]
  }
}

