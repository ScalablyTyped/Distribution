package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ExportFlowRequest extends StObject {
  
  /**
    * Optional. The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to export the flow to. The format of this URI must be `gs:///`. If left unspecified, the serialized flow is returned inline. Dialogflow performs a write operation for the Cloud Storage object on the caller's behalf, so your request authentication must have write permissions for the object. For more information, see [Dialogflow access control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var flowUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether to export flows referenced by the specified flow.
    */
  var includeReferencedFlows: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ExportFlowRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ExportFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ExportFlowRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ExportFlowRequest](x: Self) {
    
    inline def setFlowUri(value: String): Self = StObject.set(x, "flowUri", value.asInstanceOf[js.Any])
    
    inline def setFlowUriNull: Self = StObject.set(x, "flowUri", null)
    
    inline def setFlowUriUndefined: Self = StObject.set(x, "flowUri", js.undefined)
    
    inline def setIncludeReferencedFlows(value: Boolean): Self = StObject.set(x, "includeReferencedFlows", value.asInstanceOf[js.Any])
    
    inline def setIncludeReferencedFlowsNull: Self = StObject.set(x, "includeReferencedFlows", null)
    
    inline def setIncludeReferencedFlowsUndefined: Self = StObject.set(x, "includeReferencedFlows", js.undefined)
  }
}
