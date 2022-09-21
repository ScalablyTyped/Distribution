package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ExportFlowRequest extends StObject {
  
  /**
    * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the flow to. The format of this URI must be `gs:///`. If left unspecified, the serialized
    * flow is returned inline. Dialogflow performs a write operation for the Cloud Storage object on the caller's behalf, so your request authentication must have write permissions for
    * the object. For more information, see [Dialogflow access control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var flowUri: js.UndefOr[String] = js.undefined
  
  /** Optional. Whether to export flows referenced by the specified flow. */
  var includeReferencedFlows: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3ExportFlowRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3ExportFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ExportFlowRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ExportFlowRequest](x: Self) {
    
    inline def setFlowUri(value: String): Self = StObject.set(x, "flowUri", value.asInstanceOf[js.Any])
    
    inline def setFlowUriUndefined: Self = StObject.set(x, "flowUri", js.undefined)
    
    inline def setIncludeReferencedFlows(value: Boolean): Self = StObject.set(x, "includeReferencedFlows", value.asInstanceOf[js.Any])
    
    inline def setIncludeReferencedFlowsUndefined: Self = StObject.set(x, "includeReferencedFlows", js.undefined)
  }
}
