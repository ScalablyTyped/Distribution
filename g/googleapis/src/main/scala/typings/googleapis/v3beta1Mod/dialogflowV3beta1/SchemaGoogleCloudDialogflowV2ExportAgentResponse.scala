package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ExportAgentResponse extends StObject {
  
  /**
    * Zip compressed raw byte content for agent.
    */
  var agentContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI to a file containing the exported agent. This field is populated only if `agent_uri` is specified in `ExportAgentRequest`.
    */
  var agentUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ExportAgentResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ExportAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ExportAgentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ExportAgentResponse](x: Self) {
    
    inline def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentNull: Self = StObject.set(x, "agentContent", null)
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriNull: Self = StObject.set(x, "agentUri", null)
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
