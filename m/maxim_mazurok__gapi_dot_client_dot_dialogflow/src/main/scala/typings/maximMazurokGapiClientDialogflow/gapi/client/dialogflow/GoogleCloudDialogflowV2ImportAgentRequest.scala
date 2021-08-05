package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ImportAgentRequest extends StObject {
  
  /** Zip compressed raw byte content for agent. */
  var agentContent: js.UndefOr[String] = js.undefined
  
  /** The URI to a Google Cloud Storage file containing the agent to import. Note: The URI must start with "gs://". */
  var agentUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ImportAgentRequest {
  
  inline def apply(): GoogleCloudDialogflowV2ImportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ImportAgentRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ImportAgentRequest](x: Self) {
    
    inline def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
