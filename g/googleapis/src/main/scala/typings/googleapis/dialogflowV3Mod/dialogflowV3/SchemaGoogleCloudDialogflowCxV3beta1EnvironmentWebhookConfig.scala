package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig extends StObject {
  
  /**
    * The list of webhooks to override for the agent environment. The webhook must exist in the agent. You can override fields in `generic_web_service` and `service_directory`.
    */
  var webhookOverrides: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1Webhook]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1EnvironmentWebhookConfig](x: Self) {
    
    inline def setWebhookOverrides(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1Webhook]): Self = StObject.set(x, "webhookOverrides", value.asInstanceOf[js.Any])
    
    inline def setWebhookOverridesUndefined: Self = StObject.set(x, "webhookOverrides", js.undefined)
    
    inline def setWebhookOverridesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1Webhook*): Self = StObject.set(x, "webhookOverrides", js.Array(value*))
  }
}
