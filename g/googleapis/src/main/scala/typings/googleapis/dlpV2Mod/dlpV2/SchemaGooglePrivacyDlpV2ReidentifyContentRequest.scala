package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to re-identify an item.
  */
trait SchemaGooglePrivacyDlpV2ReidentifyContentRequest extends StObject {
  
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * Optional template to use. Any configuration directly specified in
    * `inspect_config` will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.undefined
  
  /**
    * The item to re-identify. Will be treated as text.
    */
  var item: js.UndefOr[SchemaGooglePrivacyDlpV2ContentItem] = js.undefined
  
  /**
    * Configuration for the re-identification of the content item. This field
    * shares the same proto message type that is used for de-identification,
    * however its usage here is for the reversal of the previous
    * de-identification. Re-identification is performed by examining the
    * transformations used to de-identify the items and executing the reverse.
    * This requires that only reversible transformations be provided here. The
    * reversible transformations are:   - `CryptoReplaceFfxFpeConfig`
    */
  var reidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.undefined
  
  /**
    * Optional template to use. References an instance of `DeidentifyTemplate`.
    * Any configuration directly specified in `reidentify_config` or
    * `inspect_config` will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var reidentifyTemplateName: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2ReidentifyContentRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ReidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ReidentifyContentRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ReidentifyContentRequest](x: Self) {
    
    inline def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    inline def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    inline def setItem(value: SchemaGooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setReidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = StObject.set(x, "reidentifyConfig", value.asInstanceOf[js.Any])
    
    inline def setReidentifyConfigUndefined: Self = StObject.set(x, "reidentifyConfig", js.undefined)
    
    inline def setReidentifyTemplateName(value: String): Self = StObject.set(x, "reidentifyTemplateName", value.asInstanceOf[js.Any])
    
    inline def setReidentifyTemplateNameUndefined: Self = StObject.set(x, "reidentifyTemplateName", js.undefined)
  }
}
