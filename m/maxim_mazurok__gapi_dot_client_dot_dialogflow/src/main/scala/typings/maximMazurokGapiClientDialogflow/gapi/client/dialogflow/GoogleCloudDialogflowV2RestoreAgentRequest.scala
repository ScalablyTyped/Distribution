package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2RestoreAgentRequest extends StObject {
  
  /** Zip compressed raw byte content for agent. */
  var agentContent: js.UndefOr[String] = js.native
  
  /** The URI to a Google Cloud Storage file containing the agent to restore. Note: The URI must start with "gs://". */
  var agentUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2RestoreAgentRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2RestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2RestoreAgentRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2RestoreAgentRequestMutableBuilder[Self <: GoogleCloudDialogflowV2RestoreAgentRequest] (val x: Self) extends AnyVal {
    
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
