package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ExportFlowResponse extends StObject {
  
  /**
    * Uncompressed raw byte content for flow.
    */
  var flowContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI to a file containing the exported flow. This field is populated only if `flow_uri` is specified in ExportFlowRequest.
    */
  var flowUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ExportFlowResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ExportFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ExportFlowResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ExportFlowResponse](x: Self) {
    
    inline def setFlowContent(value: String): Self = StObject.set(x, "flowContent", value.asInstanceOf[js.Any])
    
    inline def setFlowContentNull: Self = StObject.set(x, "flowContent", null)
    
    inline def setFlowContentUndefined: Self = StObject.set(x, "flowContent", js.undefined)
    
    inline def setFlowUri(value: String): Self = StObject.set(x, "flowUri", value.asInstanceOf[js.Any])
    
    inline def setFlowUriNull: Self = StObject.set(x, "flowUri", null)
    
    inline def setFlowUriUndefined: Self = StObject.set(x, "flowUri", js.undefined)
  }
}
