package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGooglePrivacyDlpV2ReidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReidentifyContentRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ReidentifyContentRequestOps[Self <: SchemaGooglePrivacyDlpV2ReidentifyContentRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setReidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = this.set("reidentifyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReidentifyConfig: Self = this.set("reidentifyConfig", js.undefined)
    
    @scala.inline
    def setReidentifyTemplateName(value: String): Self = this.set("reidentifyTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReidentifyTemplateName: Self = this.set("reidentifyTemplateName", js.undefined)
  }
}
