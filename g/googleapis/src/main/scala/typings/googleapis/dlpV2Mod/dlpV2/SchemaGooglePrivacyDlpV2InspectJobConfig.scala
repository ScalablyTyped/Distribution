package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2InspectJobConfig extends StObject {
  
  /**
    * Actions to execute at the completion of the job.
    */
  var actions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Action]] = js.undefined
  
  /**
    * How and what to scan for.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * If provided, will be used as the default for all values in InspectConfig. `inspect_config` will be merged into the values persisted as part of the template.
    */
  var inspectTemplateName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data to scan.
    */
  var storageConfig: js.UndefOr[SchemaGooglePrivacyDlpV2StorageConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectJobConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InspectJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectJobConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InspectJobConfig](x: Self) {
    
    inline def setActions(value: js.Array[SchemaGooglePrivacyDlpV2Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: SchemaGooglePrivacyDlpV2Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    inline def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateNameNull: Self = StObject.set(x, "inspectTemplateName", null)
    
    inline def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    inline def setStorageConfig(value: SchemaGooglePrivacyDlpV2StorageConfig): Self = StObject.set(x, "storageConfig", value.asInstanceOf[js.Any])
    
    inline def setStorageConfigUndefined: Self = StObject.set(x, "storageConfig", js.undefined)
  }
}
