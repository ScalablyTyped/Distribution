package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3EnvironmentWebhookConfig extends StObject {
  
  /** The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`. */
  var webhookOverrides: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Webhook]] = js.undefined
}
object GoogleCloudDialogflowCxV3EnvironmentWebhookConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3EnvironmentWebhookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3EnvironmentWebhookConfig]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3EnvironmentWebhookConfig](x: Self) {
    
    inline def setWebhookOverrides(value: js.Array[GoogleCloudDialogflowCxV3Webhook]): Self = StObject.set(x, "webhookOverrides", value.asInstanceOf[js.Any])
    
    inline def setWebhookOverridesUndefined: Self = StObject.set(x, "webhookOverrides", js.undefined)
    
    inline def setWebhookOverridesVarargs(value: GoogleCloudDialogflowCxV3Webhook*): Self = StObject.set(x, "webhookOverrides", js.Array(value*))
  }
}
