package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for Agents.ImportAgent.
  */
trait SchemaGoogleCloudDialogflowV2ImportAgentRequest extends StObject {
  
  /**
    * The agent to import.  Example for how to import an agent via the command
    * line: &lt;pre&gt;curl \
    * &#39;https://dialogflow.googleapis.com/v2/projects/&amp;lt;project_name&amp;gt;/agent:import\
    * -X POST \    -H &#39;Authorization: Bearer &#39;$(gcloud auth
    * application-default    print-access-token) \    -H &#39;Accept:
    * application/json&#39; \    -H &#39;Content-Type: application/json&#39; \
    * --compressed \    --data-binary &quot;{       &#39;agentContent&#39;:
    * &#39;$(cat &amp;lt;agent zip file&amp;gt; | base64 -w 0)&#39;
    * }&quot;&lt;/pre&gt;
    */
  var agentContent: js.UndefOr[String] = js.undefined
  
  /**
    * The URI to a Google Cloud Storage file containing the agent to import.
    * Note: The URI must start with &quot;gs://&quot;.
    */
  var agentUri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ImportAgentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ImportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ImportAgentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ImportAgentRequest](x: Self) {
    
    inline def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
