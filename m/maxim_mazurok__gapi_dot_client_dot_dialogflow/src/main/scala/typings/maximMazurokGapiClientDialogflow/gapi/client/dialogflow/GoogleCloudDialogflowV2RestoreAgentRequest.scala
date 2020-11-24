package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2RestoreAgentRequest extends js.Object {
  
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
  implicit class GoogleCloudDialogflowV2RestoreAgentRequestOps[Self <: GoogleCloudDialogflowV2RestoreAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentContent(value: String): Self = this.set("agentContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentContent: Self = this.set("agentContent", js.undefined)
    
    @scala.inline
    def setAgentUri(value: String): Self = this.set("agentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentUri: Self = this.set("agentUri", js.undefined)
  }
}
