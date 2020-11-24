package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2ExportAgentRequest extends js.Object {
  
  /**
    * Required. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the agent to. The format of this URI must be `gs:///`. If left unspecified, the serialized
    * agent is returned inline.
    */
  var agentUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2ExportAgentRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ExportAgentRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ExportAgentRequestOps[Self <: GoogleCloudDialogflowV2ExportAgentRequest] (val x: Self) extends AnyVal {
    
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
    def setAgentUri(value: String): Self = this.set("agentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentUri: Self = this.set("agentUri", js.undefined)
  }
}
