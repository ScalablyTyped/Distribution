package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Webhook extends StObject {
  
  /** Indicates whether the webhook is disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The human-readable name of the webhook, unique within the agent. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Configuration for a generic web service. */
  var genericWebService: js.UndefOr[GoogleCloudDialogflowCxV3WebhookGenericWebService] = js.undefined
  
  /**
    * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format:
    * `projects//locations//agents//webhooks/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Configuration for a [Service Directory](https://cloud.google.com/service-directory) service. */
  var serviceDirectory: js.UndefOr[GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig] = js.undefined
  
  /**
    * Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum
    * allowed timeout is 30 seconds.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3Webhook {
  
  inline def apply(): GoogleCloudDialogflowCxV3Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Webhook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3Webhook] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGenericWebService(value: GoogleCloudDialogflowCxV3WebhookGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceDirectory(value: GoogleCloudDialogflowCxV3WebhookServiceDirectoryConfig): Self = StObject.set(x, "serviceDirectory", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryUndefined: Self = StObject.set(x, "serviceDirectory", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
