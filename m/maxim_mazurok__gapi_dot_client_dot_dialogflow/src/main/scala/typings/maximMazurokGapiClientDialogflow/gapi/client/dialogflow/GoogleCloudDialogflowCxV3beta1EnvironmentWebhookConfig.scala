package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig extends StObject {
  
  /** The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`. */
  var webhookOverrides: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1Webhook]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig](x: Self) {
    
    inline def setWebhookOverrides(value: js.Array[GoogleCloudDialogflowCxV3beta1Webhook]): Self = StObject.set(x, "webhookOverrides", value.asInstanceOf[js.Any])
    
    inline def setWebhookOverridesUndefined: Self = StObject.set(x, "webhookOverrides", js.undefined)
    
    inline def setWebhookOverridesVarargs(value: GoogleCloudDialogflowCxV3beta1Webhook*): Self = StObject.set(x, "webhookOverrides", js.Array(value*))
  }
}
