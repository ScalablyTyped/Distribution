package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to de-identify a list of items.
  */
trait SchemaGooglePrivacyDlpV2DeidentifyContentRequest extends StObject {
  
  /**
    * Configuration for the de-identification of the content item. Items
    * specified here will override the template referenced by the
    * deidentify_template_name argument.
    */
  var deidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.undefined
  
  /**
    * Optional template to use. Any configuration directly specified in
    * deidentify_config will override those set in the template. Singular
    * fields that are set in this request will replace their corresponding
    * fields in the template. Repeated fields are appended. Singular
    * sub-messages and groups are recursively merged.
    */
  var deidentifyTemplateName: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration for the inspector. Items specified here will override the
    * template referenced by the inspect_template_name argument.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * Optional template to use. Any configuration directly specified in
    * inspect_config will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.undefined
  
  /**
    * The item to de-identify. Will be treated as text.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.undefined
}
object SchemaGooglePrivacyDlpV2DeidentifyContentRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyContentRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyContentRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DeidentifyContentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = StObject.set(x, "deidentifyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyConfigUndefined: Self = StObject.set(x, "deidentifyConfig", js.undefined)
    
    @scala.inline
    def setDeidentifyTemplateName(value: String): Self = StObject.set(x, "deidentifyTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplateNameUndefined: Self = StObject.set(x, "deidentifyTemplateName", js.undefined)
    
    @scala.inline
    def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    @scala.inline
    def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    @scala.inline
    def setItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
