package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ExportFlowResponse extends StObject {
  
  /** Uncompressed raw byte content for flow. */
  var flowContent: js.UndefOr[String] = js.undefined
  
  /** The URI to a file containing the exported flow. This field is populated only if `flow_uri` is specified in ExportFlowRequest. */
  var flowUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ExportFlowResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ExportFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ExportFlowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ExportFlowResponse] (val x: Self) extends AnyVal {
    
    inline def setFlowContent(value: String): Self = StObject.set(x, "flowContent", value.asInstanceOf[js.Any])
    
    inline def setFlowContentUndefined: Self = StObject.set(x, "flowContent", js.undefined)
    
    inline def setFlowUri(value: String): Self = StObject.set(x, "flowUri", value.asInstanceOf[js.Any])
    
    inline def setFlowUriUndefined: Self = StObject.set(x, "flowUri", js.undefined)
  }
}
