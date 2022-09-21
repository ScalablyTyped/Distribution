package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2AutomatedAgentConfig extends StObject {
  
  /**
    * Required. ID of the Dialogflow agent environment to use. This project needs to either be the same project as the conversation or you need to grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow API Service Agent` role in this project. - For ES agents, use format: `projects//locations//agent/environments/`. If environment is not specified, the default `draft` environment is used. Refer to [DetectIntentRequest](/dialogflow/docs/reference/rpc/google.cloud.dialogflow.v2#google.cloud.dialogflow.v2.DetectIntentRequest) for more details. - For CX agents, use format `projects//locations//agents//environments/`. If environment is not specified, the default `draft` environment is used.
    */
  var agent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2AutomatedAgentConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2AutomatedAgentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2AutomatedAgentConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2AutomatedAgentConfig](x: Self) {
    
    inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentNull: Self = StObject.set(x, "agent", null)
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
  }
}
