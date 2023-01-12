package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ExportAgentResponse extends StObject {
  
  /** Uncompressed raw byte content for agent. */
  var agentContent: js.UndefOr[String] = js.undefined
  
  /** The URI to a file containing the exported agent. This field is populated only if `agent_uri` is specified in ExportAgentRequest. */
  var agentUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ExportAgentResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ExportAgentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ExportAgentResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
