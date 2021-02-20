package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ImportAgentRequest extends StObject {
  
  /** Zip compressed raw byte content for agent. */
  var agentContent: js.UndefOr[String] = js.native
  
  /** The URI to a Google Cloud Storage file containing the agent to import. Note: The URI must start with "gs://". */
  var agentUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2ImportAgentRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ImportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ImportAgentRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ImportAgentRequestMutableBuilder[Self <: GoogleCloudDialogflowV2ImportAgentRequest] (val x: Self) extends AnyVal {
    
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
