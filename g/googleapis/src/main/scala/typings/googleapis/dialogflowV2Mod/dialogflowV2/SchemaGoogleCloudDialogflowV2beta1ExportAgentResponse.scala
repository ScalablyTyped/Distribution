package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Agents.ExportAgent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1ExportAgentResponse extends StObject {
  
  /**
    * The exported agent.  Example for how to export an agent to a zip file via
    * a command line: &lt;pre&gt;curl \
    * &#39;https://dialogflow.googleapis.com/v2beta1/projects/&amp;lt;project_name&amp;gt;/agent:export&#39;\
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
object SchemaGoogleCloudDialogflowV2beta1ExportAgentResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ExportAgentResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1ExportAgentResponseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1ExportAgentResponse] (val x: Self) extends AnyVal {
    
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
