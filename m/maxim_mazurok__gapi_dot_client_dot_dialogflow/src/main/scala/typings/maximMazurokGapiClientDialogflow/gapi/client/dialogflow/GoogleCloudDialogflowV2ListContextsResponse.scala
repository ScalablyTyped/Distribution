package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ListContextsResponse extends StObject {
  
  /** The list of contexts. There will be a maximum number of items returned based on the page_size field in the request. */
  var contexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ListContextsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ListContextsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ListContextsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ListContextsResponseMutableBuilder[Self <: GoogleCloudDialogflowV2ListContextsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[GoogleCloudDialogflowV2Context]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: GoogleCloudDialogflowV2Context*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
