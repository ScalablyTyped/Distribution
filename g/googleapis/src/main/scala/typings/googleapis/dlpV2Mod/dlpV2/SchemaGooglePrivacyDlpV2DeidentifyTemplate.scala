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
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyTemplateOps[Self <: SchemaGooglePrivacyDlpV2DeidentifyTemplate] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDeidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = this.set("deidentifyConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeidentifyConfig: Self = this.set("deidentifyConfig", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}

