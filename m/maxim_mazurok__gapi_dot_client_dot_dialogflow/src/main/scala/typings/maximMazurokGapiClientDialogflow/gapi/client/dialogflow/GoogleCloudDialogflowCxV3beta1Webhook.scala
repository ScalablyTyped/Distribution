package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1Webhook extends StObject {
  
  /** Indicates whether the webhook is disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The human-readable name of the webhook, unique within the agent. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Configuration for a generic web service. */
  var genericWebService: js.UndefOr[GoogleCloudDialogflowCxV3beta1WebhookGenericWebService] = js.undefined
  
  /**
    * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format:
    * `projects//locations//agents//webhooks/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Configuration for a [Service Directory](https://cloud.google.com/service-directory) service. */
  var serviceDirectory: js.UndefOr[GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig] = js.undefined
  
  /**
    * Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum
    * allowed timeout is 30 seconds.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1Webhook {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1Webhook]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1Webhook](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGenericWebService(value: GoogleCloudDialogflowCxV3beta1WebhookGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceDirectory(value: GoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig): Self = StObject.set(x, "serviceDirectory", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryUndefined: Self = StObject.set(x, "serviceDirectory", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
