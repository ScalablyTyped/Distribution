package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to search for potentially sensitive info in a ContentItem.
  */
trait SchemaGooglePrivacyDlpV2InspectContentRequest extends StObject {
  
  /**
    * Configuration for the inspector. What specified here will override the
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
    * The item to inspect.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectContentRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InspectContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectContentRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InspectContentRequest](x: Self) {
    
    inline def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    inline def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    inline def setItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
