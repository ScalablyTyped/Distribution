package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for Agents.RestoreAgent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2RestoreAgentRequest extends js.Object {
  /**
    * The agent to restore.  Example for how to restore an agent via the
    * command line: &lt;pre&gt;curl \
    * &#39;https://dialogflow.googleapis.com/v2/projects/&amp;lt;project_name&amp;gt;/agent:restore\
    * -X POST \    -H &#39;Authorization: Bearer &#39;$(gcloud auth
    * application-default    print-access-token) \    -H &#39;Accept:
    * application/json&#39; \    -H &#39;Content-Type: application/json&#39; \
    * --compressed \    --data-binary &quot;{        &#39;agentContent&#39;:
    * &#39;$(cat &amp;lt;agent zip file&amp;gt; | base64 -w 0)&#39;
    * }&quot;&lt;/pre&gt;
    */
  var agentContent: js.UndefOr[String] = js.native
  /**
    * The URI to a Google Cloud Storage file containing the agent to restore.
    * Note: The URI must start with &quot;gs://&quot;.
    */
  var agentUri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2RestoreAgentRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2RestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2RestoreAgentRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2RestoreAgentRequestOps[Self <: SchemaGoogleCloudDialogflowV2RestoreAgentRequest] (val x: Self) extends AnyVal {
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

