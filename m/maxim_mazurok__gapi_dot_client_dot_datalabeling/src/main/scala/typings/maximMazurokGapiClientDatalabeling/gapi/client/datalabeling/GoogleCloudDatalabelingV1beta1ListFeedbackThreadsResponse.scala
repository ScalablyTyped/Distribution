package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse extends StObject {
  
  /** The list of feedback threads to return. */
  var feedbackThreads: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1FeedbackThread]] = js.undefined
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse](x: Self) {
    
    inline def setFeedbackThreads(value: js.Array[GoogleCloudDatalabelingV1beta1FeedbackThread]): Self = StObject.set(x, "feedbackThreads", value.asInstanceOf[js.Any])
    
    inline def setFeedbackThreadsUndefined: Self = StObject.set(x, "feedbackThreads", js.undefined)
    
    inline def setFeedbackThreadsVarargs(value: GoogleCloudDatalabelingV1beta1FeedbackThread*): Self = StObject.set(x, "feedbackThreads", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
