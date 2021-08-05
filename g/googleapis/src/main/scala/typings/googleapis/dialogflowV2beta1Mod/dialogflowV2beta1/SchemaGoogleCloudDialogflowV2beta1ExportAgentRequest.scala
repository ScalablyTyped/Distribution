package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for Agents.ExportAgent.
  */
trait SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest extends StObject {
  
  /**
    * Optional. The [Google Cloud
    * Storage](https://cloud.google.com/storage/docs/) URI to export the agent
    * to. The format of this URI must be
    * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left unspecified, the
    * serialized agent is returned inline.
    */
  var agentUri: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ExportAgentRequest](x: Self) {
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
  }
}
