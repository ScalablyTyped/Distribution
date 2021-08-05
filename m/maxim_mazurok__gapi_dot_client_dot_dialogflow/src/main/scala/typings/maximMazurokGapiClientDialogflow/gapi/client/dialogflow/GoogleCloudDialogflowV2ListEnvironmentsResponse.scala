package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ListEnvironmentsResponse extends StObject {
  
  /** The list of agent environments. There will be a maximum number of items returned based on the page_size field in the request. */
  var environments: js.UndefOr[js.Array[GoogleCloudDialogflowV2Environment]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ListEnvironmentsResponse {
  
  inline def apply(): GoogleCloudDialogflowV2ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ListEnvironmentsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ListEnvironmentsResponse](x: Self) {
    
    inline def setEnvironments(value: js.Array[GoogleCloudDialogflowV2Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: GoogleCloudDialogflowV2Environment*): Self = StObject.set(x, "environments", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
