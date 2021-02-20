package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for Agents.RestoreAgent.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2RestoreAgentRequest extends StObject {
  
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
  implicit class SchemaGoogleCloudDialogflowV2RestoreAgentRequestMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2RestoreAgentRequest] (val x: Self) extends AnyVal {
    
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
