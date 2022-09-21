package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ListFlowsResponse extends StObject {
  
  /**
    * The list of flows. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var flows: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3Flow]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ListFlowsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ListFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ListFlowsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ListFlowsResponse](x: Self) {
    
    inline def setFlows(value: js.Array[SchemaGoogleCloudDialogflowCxV3Flow]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsUndefined: Self = StObject.set(x, "flows", js.undefined)
    
    inline def setFlowsVarargs(value: SchemaGoogleCloudDialogflowCxV3Flow*): Self = StObject.set(x, "flows", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
