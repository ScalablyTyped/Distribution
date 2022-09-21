package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1Webhook extends StObject {
  
  /**
    * Indicates whether the webhook is disabled.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The human-readable name of the webhook, unique within the agent.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for a generic web service.
    */
  var genericWebService: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService] = js.undefined
  
  /**
    * The unique identifier of the webhook. Required for the Webhooks.UpdateWebhook method. Webhooks.CreateWebhook populates the name automatically. Format: `projects//locations//agents//webhooks/`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for a [Service Directory](https://cloud.google.com/service-directory) service.
    */
  var serviceDirectory: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig] = js.undefined
  
  /**
    * Webhook execution timeout. Execution is considered failed if Dialogflow doesn't receive a response from webhook at the end of the timeout period. Defaults to 5 seconds, maximum allowed timeout is 30 seconds.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1Webhook {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1Webhook]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1Webhook](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGenericWebService(value: SchemaGoogleCloudDialogflowCxV3beta1WebhookGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServiceDirectory(value: SchemaGoogleCloudDialogflowCxV3beta1WebhookServiceDirectoryConfig): Self = StObject.set(x, "serviceDirectory", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryUndefined: Self = StObject.set(x, "serviceDirectory", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
