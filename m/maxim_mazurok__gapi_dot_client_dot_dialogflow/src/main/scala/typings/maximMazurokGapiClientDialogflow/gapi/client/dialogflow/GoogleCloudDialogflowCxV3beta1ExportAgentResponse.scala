package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1ExportAgentResponse extends js.Object {
  
  /** Uncompressed raw byte content for agent. */
  var agentContent: js.UndefOr[String] = js.native
  
  /** The URI to a file containing the exported agent. This field is populated only if `agent_uri` is specified in ExportAgentRequest. */
  var agentUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3beta1ExportAgentResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ExportAgentResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ExportAgentResponseOps[Self <: GoogleCloudDialogflowCxV3beta1ExportAgentResponse] (val x: Self) extends AnyVal {
    
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
