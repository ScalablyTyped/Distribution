package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGooglePrivacyDlpV2InspectJobConfig extends StObject {
  
  /**
    * Actions to execute at the completion of the job. Are executed in the
    * order provided.
    */
  var actions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Action]] = js.native
  
  /**
    * How and what to scan for.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
  
  /**
    * If provided, will be used as the default for all values in InspectConfig.
    * `inspect_config` will be merged into the values persisted as part of the
    * template.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  
  /**
    * The data to scan.
    */
  var storageConfig: js.UndefOr[SchemaGooglePrivacyDlpV2StorageConfig] = js.native
}
object SchemaGooglePrivacyDlpV2InspectJobConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectJobConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectJobConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InspectJobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[SchemaGooglePrivacyDlpV2Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: SchemaGooglePrivacyDlpV2Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    @scala.inline
    def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    @scala.inline
    def setStorageConfig(value: SchemaGooglePrivacyDlpV2StorageConfig): Self = StObject.set(x, "storageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageConfigUndefined: Self = StObject.set(x, "storageConfig", js.undefined)
  }
}
