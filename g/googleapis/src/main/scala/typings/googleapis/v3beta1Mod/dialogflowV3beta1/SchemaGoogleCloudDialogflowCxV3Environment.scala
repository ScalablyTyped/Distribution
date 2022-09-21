package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3Environment extends StObject {
  
  /**
    * The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The human-readable name of the environment (unique in an agent). Limit of 64 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the environment. Format: `projects//locations//agents//environments/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The test cases config for continuous tests of this environment.
    */
  var testCasesConfig: js.UndefOr[SchemaGoogleCloudDialogflowCxV3EnvironmentTestCasesConfig] = js.undefined
  
  /**
    * Output only. Update time of this environment.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be returned.
    */
  var versionConfigs: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3EnvironmentVersionConfig]] = js.undefined
  
  /**
    * The webhook configuration for this environment.
    */
  var webhookConfig: js.UndefOr[SchemaGoogleCloudDialogflowCxV3EnvironmentWebhookConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3Environment {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3Environment]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3Environment](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestCasesConfig(value: SchemaGoogleCloudDialogflowCxV3EnvironmentTestCasesConfig): Self = StObject.set(x, "testCasesConfig", value.asInstanceOf[js.Any])
    
    inline def setTestCasesConfigUndefined: Self = StObject.set(x, "testCasesConfig", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionConfigs(value: js.Array[SchemaGoogleCloudDialogflowCxV3EnvironmentVersionConfig]): Self = StObject.set(x, "versionConfigs", value.asInstanceOf[js.Any])
    
    inline def setVersionConfigsUndefined: Self = StObject.set(x, "versionConfigs", js.undefined)
    
    inline def setVersionConfigsVarargs(value: SchemaGoogleCloudDialogflowCxV3EnvironmentVersionConfig*): Self = StObject.set(x, "versionConfigs", js.Array(value*))
    
    inline def setWebhookConfig(value: SchemaGoogleCloudDialogflowCxV3EnvironmentWebhookConfig): Self = StObject.set(x, "webhookConfig", value.asInstanceOf[js.Any])
    
    inline def setWebhookConfigUndefined: Self = StObject.set(x, "webhookConfig", js.undefined)
  }
}
