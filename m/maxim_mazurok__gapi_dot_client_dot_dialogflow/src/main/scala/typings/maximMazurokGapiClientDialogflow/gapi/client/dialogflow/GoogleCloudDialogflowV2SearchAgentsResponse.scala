package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2SearchAgentsResponse extends js.Object {
  
  /** The list of agents. There will be a maximum number of items returned based on the page_size field in the request. */
  var agents: js.UndefOr[js.Array[GoogleCloudDialogflowV2Agent]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2SearchAgentsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2SearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SearchAgentsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2SearchAgentsResponseOps[Self <: GoogleCloudDialogflowV2SearchAgentsResponse] (val x: Self) extends AnyVal {
    
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
    def setAgentsVarargs(value: GoogleCloudDialogflowV2Agent*): Self = this.set("agents", js.Array(value :_*))
    
    @scala.inline
    def setAgents(value: js.Array[GoogleCloudDialogflowV2Agent]): Self = this.set("agents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgents: Self = this.set("agents", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
