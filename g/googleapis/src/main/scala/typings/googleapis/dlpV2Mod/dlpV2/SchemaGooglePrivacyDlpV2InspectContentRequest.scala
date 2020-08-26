package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search for potentially sensitive info in a ContentItem.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectContentRequest extends js.Object {
  /**
    * Configuration for the inspector. What specified here will override the
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
    * The item to inspect.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.native
}

object SchemaGooglePrivacyDlpV2InspectContentRequest {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectContentRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectContentRequestOps[Self <: SchemaGooglePrivacyDlpV2InspectContentRequest] (val x: Self) extends AnyVal {
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
    def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = this.set("inspectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspectConfig: Self = this.set("inspectConfig", js.undefined)
    @scala.inline
    def setInspectTemplateName(value: String): Self = this.set("inspectTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspectTemplateName: Self = this.set("inspectTemplateName", js.undefined)
    @scala.inline
    def setItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

