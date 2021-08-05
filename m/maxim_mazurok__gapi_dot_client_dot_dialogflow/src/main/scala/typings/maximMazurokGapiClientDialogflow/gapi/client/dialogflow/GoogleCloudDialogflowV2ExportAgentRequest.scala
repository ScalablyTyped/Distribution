package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ExportAgentRequest extends StObject {
  
  /**
    * Required. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the agent to. The format of this URI must be `gs:///`. If left unspecified, the serialized
    * agent is returned inline.
    */
  var agentUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ExportAgentRequest {
  
  inline def apply(): GoogleCloudDialogflowV2ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ExportAgentRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ExportAgentRequest](x: Self) {
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
