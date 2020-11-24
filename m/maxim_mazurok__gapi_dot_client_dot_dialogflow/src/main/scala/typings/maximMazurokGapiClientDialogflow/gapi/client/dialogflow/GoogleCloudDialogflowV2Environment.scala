package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2Environment extends js.Object {
  
  /** Optional. The agent version loaded into this environment. Format: `projects//agent/versions/`. */
  var agentVersion: js.UndefOr[String] = js.native
  
  /** Optional. The developer-provided description for this environment. The maximum length is 500 characters. If exceeded, the request is rejected. */
  var description: js.UndefOr[String] = js.native
  
  /** Output only. The unique identifier of this agent environment. Format: `projects//agent/environments/`. For Environment ID, "-" is reserved for 'draft' environment. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The state of this environment. This field is read-only, i.e., it cannot be set by create and update methods. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The last update time of this environment. This field is read-only, i.e., it cannot be set by create and update methods. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2Environment {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Environment]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2EnvironmentOps[Self <: GoogleCloudDialogflowV2Environment] (val x: Self) extends AnyVal {
    
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
    def setAgentVersion(value: String): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentVersion: Self = this.set("agentVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
