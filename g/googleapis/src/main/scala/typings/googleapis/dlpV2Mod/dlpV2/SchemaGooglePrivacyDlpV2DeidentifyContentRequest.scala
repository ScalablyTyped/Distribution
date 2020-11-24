package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyContentRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyContentRequestOps[Self <: SchemaGooglePrivacyDlpV2DeidentifyContentRequest] (val x: Self) extends AnyVal {
    
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
    def setDeidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = this.set("deidentifyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeidentifyConfig: Self = this.set("deidentifyConfig", js.undefined)
    
    @scala.inline
    def setDeidentifyTemplateName(value: String): Self = this.set("deidentifyTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeidentifyTemplateName: Self = this.set("deidentifyTemplateName", js.undefined)
    
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
