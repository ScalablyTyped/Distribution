package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RestoreAgentRequest extends StObject {
  
  /** Uncompressed raw byte content for agent. */
  var agentContent: js.UndefOr[String] = js.undefined
  
  /**
    * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to restore agent from. The format of this URI must be `gs:///`. Dialogflow performs a read operation for the
    * Cloud Storage object on the caller's behalf, so your request authentication must have read permissions for the object. For more information, see [Dialogflow access
    * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var agentUri: js.UndefOr[String] = js.undefined
  
  /** Agent restore mode. If not specified, `KEEP` is assumed. */
  var restoreOption: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3RestoreAgentRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3RestoreAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RestoreAgentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3RestoreAgentRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentContent(value: String): Self = StObject.set(x, "agentContent", value.asInstanceOf[js.Any])
    
    inline def setAgentContentUndefined: Self = StObject.set(x, "agentContent", js.undefined)
    
    inline def setAgentUri(value: String): Self = StObject.set(x, "agentUri", value.asInstanceOf[js.Any])
    
    inline def setAgentUriUndefined: Self = StObject.set(x, "agentUri", js.undefined)
    
    inline def setRestoreOption(value: String): Self = StObject.set(x, "restoreOption", value.asInstanceOf[js.Any])
    
    inline def setRestoreOptionUndefined: Self = StObject.set(x, "restoreOption", js.undefined)
  }
}
