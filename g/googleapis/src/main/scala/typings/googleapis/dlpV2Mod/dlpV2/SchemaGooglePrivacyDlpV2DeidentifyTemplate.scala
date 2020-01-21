package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The DeidentifyTemplates contains instructions on how to deidentify content.
  * See https://cloud.google.com/dlp/docs/concepts-templates to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeidentifyTemplate extends js.Object {
  /**
    * The creation timestamp of a inspectTemplate, output only field.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * ///////////// // The core content of the template  // ///////////////
    */
  var deidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.native
  /**
    * Short description (max 256 chars).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name (max 256 chars).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The template name. Output only.  The template will have one of the
    * following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID`
    * OR `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The last update timestamp of a inspectTemplate, output only field.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2DeidentifyTemplate {
  @scala.inline
  def apply(
    createTime: String = null,
    deidentifyConfig: SchemaGooglePrivacyDlpV2DeidentifyConfig = null,
    description: String = null,
    displayName: String = null,
    name: String = null,
    updateTime: String = null
  ): SchemaGooglePrivacyDlpV2DeidentifyTemplate = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (deidentifyConfig != null) __obj.updateDynamic("deidentifyConfig")(deidentifyConfig.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  }
}

