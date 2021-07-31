package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ExportAgentResponse extends StObject {
  
  /** Zip compressed raw byte content for agent. */
  var agentContent: js.UndefOr[String] = js.undefined
  
  /** The URI to a file containing the exported agent. This field is populated only if `agent_uri` is specified in `ExportAgentRequest`. */
  var agentUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ExportAgentResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ExportAgentResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ExportAgentResponseMutableBuilder[Self <: GoogleCloudDialogflowV2ExportAgentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    @scala.inline
    def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
