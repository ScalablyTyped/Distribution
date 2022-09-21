package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ExportAgentRequest extends StObject {
  
  /**
    * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the agent to. The format of this URI must be `gs:///`. If left unspecified, the serialized agent is returned inline. Dialogflow performs a write operation for the Cloud Storage object on the caller's behalf, so your request authentication must have write permissions for the object. For more information, see [Dialogflow access control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The data format of the exported agent. If not specified, `BLOB` is assumed.
    */
  var dataFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Environment name. If not set, draft environment is assumed. Format: `projects//locations//agents//environments/`.
    */
  var environment: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ExportAgentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ExportAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ExportAgentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ExportAgentRequest](x: Self) {
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriNull: Self = StObject.set(x, "agentUri", null)
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
    
    inline def setDataFormat(value: String): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatNull: Self = StObject.set(x, "dataFormat", null)
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
