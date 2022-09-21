package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListFlowsResponse extends StObject {
  
  /** The list of flows. There will be a maximum number of items returned based on the page_size field in the request. */
  var flows: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Flow]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ListFlowsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListFlowsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListFlowsResponse](x: Self) {
    
    inline def setFlows(value: js.Array[GoogleCloudDialogflowCxV3Flow]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsUndefined: Self = StObject.set(x, "flows", js.undefined)
    
    inline def setFlowsVarargs(value: GoogleCloudDialogflowCxV3Flow*): Self = StObject.set(x, "flows", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
