package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ListIntentsResponse extends StObject {
  
  /** The list of agent intents. There will be a maximum number of items returned based on the page_size field in the request. */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowV2Intent]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ListIntentsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2ListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ListIntentsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2ListIntentsResponseMutableBuilder[Self <: GoogleCloudDialogflowV2ListIntentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[GoogleCloudDialogflowV2Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: GoogleCloudDialogflowV2Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
