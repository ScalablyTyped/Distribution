package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Environment extends StObject {
  
  /** The human-readable description of the environment. The maximum length is 500 characters. If exceeded, the request is rejected. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The human-readable name of the environment (unique in an agent). Limit of 64 characters. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The name of the environment. Format: `projects//locations//agents//environments/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The test cases config for continuous tests of this environment. */
  var testCasesConfig: js.UndefOr[GoogleCloudDialogflowCxV3EnvironmentTestCasesConfig] = js.undefined
  
  /** Output only. Update time of this environment. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A list of configurations for flow versions. You should include version configs for all flows that are reachable from `Start Flow` in the agent. Otherwise, an error will be
    * returned.
    */
  var versionConfigs: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3EnvironmentVersionConfig]] = js.undefined
  
  /** The webhook configuration for this environment. */
  var webhookConfig: js.UndefOr[GoogleCloudDialogflowCxV3EnvironmentWebhookConfig] = js.undefined
}
object GoogleCloudDialogflowCxV3Environment {
  
  inline def apply(): GoogleCloudDialogflowCxV3Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Environment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3Environment] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestCasesConfig(value: GoogleCloudDialogflowCxV3EnvironmentTestCasesConfig): Self = StObject.set(x, "testCasesConfig", value.asInstanceOf[js.Any])
    
    inline def setTestCasesConfigUndefined: Self = StObject.set(x, "testCasesConfig", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionConfigs(value: js.Array[GoogleCloudDialogflowCxV3EnvironmentVersionConfig]): Self = StObject.set(x, "versionConfigs", value.asInstanceOf[js.Any])
    
    inline def setVersionConfigsUndefined: Self = StObject.set(x, "versionConfigs", js.undefined)
    
    inline def setVersionConfigsVarargs(value: GoogleCloudDialogflowCxV3EnvironmentVersionConfig*): Self = StObject.set(x, "versionConfigs", js.Array(value*))
    
    inline def setWebhookConfig(value: GoogleCloudDialogflowCxV3EnvironmentWebhookConfig): Self = StObject.set(x, "webhookConfig", value.asInstanceOf[js.Any])
    
    inline def setWebhookConfigUndefined: Self = StObject.set(x, "webhookConfig", js.undefined)
  }
}
