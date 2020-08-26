package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Agents.SearchAgents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SearchAgentsResponse extends js.Object {
  /**
    * The list of agents. There will be a maximum number of items returned
    * based on the page_size field in the request.
    */
  var agents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Agent]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2SearchAgentsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2SearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SearchAgentsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SearchAgentsResponseOps[Self <: SchemaGoogleCloudDialogflowV2SearchAgentsResponse] (val x: Self) extends AnyVal {
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
    def setAgentsVarargs(value: SchemaGoogleCloudDialogflowV2Agent*): Self = this.set("agents", js.Array(value :_*))
    @scala.inline
    def setAgents(value: js.Array[SchemaGoogleCloudDialogflowV2Agent]): Self = this.set("agents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgents: Self = this.set("agents", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

