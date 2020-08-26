package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Agents.ExportAgent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2ExportAgentRequest extends js.Object {
  /**
    * Optional. The [Google Cloud
    * Storage](https://cloud.google.com/storage/docs/) URI to export the agent
    * to. The format of this URI must be
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left unspecified, the
    * serialized agent is returned inline.
    */
  var agentUri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2ExportAgentRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ExportAgentRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2ExportAgentRequestOps[Self <: SchemaGoogleCloudDialogflowV2ExportAgentRequest] (val x: Self) extends AnyVal {
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

