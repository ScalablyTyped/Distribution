package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListSessionEntityTypesResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of session entity types. There will be a maximum number of items returned based on the page_size field in the request. */
  var sessionEntityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3SessionEntityType]] = js.undefined
}
object GoogleCloudDialogflowCxV3ListSessionEntityTypesResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListSessionEntityTypesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListSessionEntityTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSessionEntityTypes(value: js.Array[GoogleCloudDialogflowCxV3SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    inline def setSessionEntityTypesVarargs(value: GoogleCloudDialogflowCxV3SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value*))
  }
}
