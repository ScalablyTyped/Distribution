package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ImportFlowRequest extends StObject {
  
  /** Uncompressed raw byte content for flow. */
  var flowContent: js.UndefOr[String] = js.undefined
  
  /**
    * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to import flow from. The format of this URI must be `gs:///`. Dialogflow performs a read operation for the
    * Cloud Storage object on the caller's behalf, so your request authentication must have read permissions for the object. For more information, see [Dialogflow access
    * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var flowUri: js.UndefOr[String] = js.undefined
  
  /** Flow import mode. If not specified, `KEEP` is assumed. */
  var importOption: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ImportFlowRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3ImportFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ImportFlowRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ImportFlowRequest](x: Self) {
    
    inline def setFlowContent(value: String): Self = StObject.set(x, "flowContent", value.asInstanceOf[js.Any])
    
    inline def setFlowContentUndefined: Self = StObject.set(x, "flowContent", js.undefined)
    
    inline def setFlowUri(value: String): Self = StObject.set(x, "flowUri", value.asInstanceOf[js.Any])
    
    inline def setFlowUriUndefined: Self = StObject.set(x, "flowUri", js.undefined)
    
    inline def setImportOption(value: String): Self = StObject.set(x, "importOption", value.asInstanceOf[js.Any])
    
    inline def setImportOptionUndefined: Self = StObject.set(x, "importOption", js.undefined)
  }
}
