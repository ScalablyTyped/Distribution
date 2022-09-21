package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1RestoreAgentRequest extends StObject {
  
  /**
    * Uncompressed raw byte content for agent.
    */
  var agentContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to restore agent from. The format of this URI must be `gs:///`. Dialogflow performs a read operation for the Cloud Storage object on the caller's behalf, so your request authentication must have read permissions for the object. For more information, see [Dialogflow access control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var agentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Agent restore mode. If not specified, `KEEP` is assumed.
    */
  var restoreOption: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1RestoreAgentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1RestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1RestoreAgentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1RestoreAgentRequest](x: Self) {
    
    inline def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentNull: Self = StObject.set(x, "agentContent", null)
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriNull: Self = StObject.set(x, "agentUri", null)
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
    
    inline def setRestoreOption(value: String): Self = StObject.set(x, "restoreOption", value.asInstanceOf[js.Any])
    
    inline def setRestoreOptionNull: Self = StObject.set(x, "restoreOption", null)
    
    inline def setRestoreOptionUndefined: Self = StObject.set(x, "restoreOption", js.undefined)
  }
}
