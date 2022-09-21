package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ImportFlowResponse extends StObject {
  
  /** The unique identifier of the new flow. Format: `projects//locations//agents//flows/`. */
  var flow: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ImportFlowResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ImportFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ImportFlowResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ImportFlowResponse](x: Self) {
    
    inline def setFlow(value: String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
  }
}
