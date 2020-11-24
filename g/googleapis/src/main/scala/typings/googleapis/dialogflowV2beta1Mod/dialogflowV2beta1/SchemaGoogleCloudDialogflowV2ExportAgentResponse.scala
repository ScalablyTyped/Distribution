package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Agents.ExportAgent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2ExportAgentResponse extends js.Object {
  
  /**
    * The exported agent.  Example for how to export an agent to a zip file via
    * a command line: &lt;pre&gt;curl \
    * &#39;https://dialogflow.googleapis.com/v2/projects/&amp;lt;project_name&amp;gt;/agent:export&#39;\
    * -X POST \   -H &#39;Authorization: Bearer &#39;$(gcloud auth
    * application-default   print-access-token) \   -H &#39;Accept:
    * application/json&#39; \   -H &#39;Content-Type: application/json&#39; \
    * --compressed \   --data-binary &#39;{}&#39; \ | grep agentContent | sed
    * -e &#39;s/.*&quot;agentContent&quot;:
    * &quot;\([^&quot;]*\)&quot;.x/\1/&#39; \ | base64 --decode &gt;
    * &amp;lt;agent zip file&amp;gt;&lt;/pre&gt;
    */
  var agentContent: js.UndefOr[String] = js.native
  
  /**
    * The URI to a file containing the exported agent. This field is populated
    * only if `agent_uri` is specified in `ExportAgentRequest`.
    */
  var agentUri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudDialogflowV2ExportAgentResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ExportAgentResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2ExportAgentResponseOps[Self <: SchemaGoogleCloudDialogflowV2ExportAgentResponse] (val x: Self) extends AnyVal {
    
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
