package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Agents.ExportAgent.
  */
trait SchemaGoogleCloudDialogflowV2ExportAgentResponse extends StObject {
  
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
  var agentContent: js.UndefOr[String] = js.undefined
  
  /**
    * The URI to a file containing the exported agent. This field is populated
    * only if `agent_uri` is specified in `ExportAgentRequest`.
    */
  var agentUri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ExportAgentResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ExportAgentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ExportAgentResponse](x: Self) {
    
    inline def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
