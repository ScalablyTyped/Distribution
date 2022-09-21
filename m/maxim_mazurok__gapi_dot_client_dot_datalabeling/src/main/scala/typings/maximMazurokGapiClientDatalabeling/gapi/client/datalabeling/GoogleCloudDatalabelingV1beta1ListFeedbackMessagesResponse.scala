package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse extends StObject {
  
  /** The list of feedback messages to return. */
  var feedbackMessages: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1FeedbackMessage]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse](x: Self) {
    
    inline def setFeedbackMessages(value: js.Array[GoogleCloudDatalabelingV1beta1FeedbackMessage]): Self = StObject.set(x, "feedbackMessages", value.asInstanceOf[js.Any])
    
    inline def setFeedbackMessagesUndefined: Self = StObject.set(x, "feedbackMessages", js.undefined)
    
    inline def setFeedbackMessagesVarargs(value: GoogleCloudDatalabelingV1beta1FeedbackMessage*): Self = StObject.set(x, "feedbackMessages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
