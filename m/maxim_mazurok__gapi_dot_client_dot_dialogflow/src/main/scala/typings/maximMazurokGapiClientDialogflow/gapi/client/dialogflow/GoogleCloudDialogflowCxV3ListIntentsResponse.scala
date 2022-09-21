package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListIntentsResponse extends StObject {
  
  /** The list of intents. There will be a maximum number of items returned based on the page_size field in the request. */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3Intent]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ListIntentsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListIntentsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListIntentsResponse](x: Self) {
    
    inline def setIntents(value: js.Array[GoogleCloudDialogflowCxV3Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: GoogleCloudDialogflowCxV3Intent*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
