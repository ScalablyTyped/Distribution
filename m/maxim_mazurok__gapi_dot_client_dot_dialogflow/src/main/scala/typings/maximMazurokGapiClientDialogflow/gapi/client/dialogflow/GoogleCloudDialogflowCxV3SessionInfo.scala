package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3SessionInfo extends StObject {
  
  /**
    * Optional for WebhookRequest. Optional for WebhookResponse. All parameters collected from forms and intents during the session. Parameters can be created, updated, or removed by the
    * webhook. To remove a parameter from the session, the webhook should explicitly set the parameter value to null in WebhookResponse. The map is keyed by parameters' display names.
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3SessionInfo & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the session. This field can be used by the webhook to identify a user. Format:
    * `projects//locations//agents//sessions/`.
    */
  var session: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3SessionInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3SessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3SessionInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3SessionInfoMutableBuilder[Self <: GoogleCloudDialogflowCxV3SessionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3SessionInfo & TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
