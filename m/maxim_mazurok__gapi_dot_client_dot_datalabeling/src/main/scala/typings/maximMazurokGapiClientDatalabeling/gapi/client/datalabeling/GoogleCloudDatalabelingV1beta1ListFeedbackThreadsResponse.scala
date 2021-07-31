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
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedbackThreads(value: js.Array[GoogleCloudDatalabelingV1beta1FeedbackThread]): Self = StObject.set(x, "feedbackThreads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackThreadsUndefined: Self = StObject.set(x, "feedbackThreads", js.undefined)
    
    @scala.inline
    def setFeedbackThreadsVarargs(value: GoogleCloudDatalabelingV1beta1FeedbackThread*): Self = StObject.set(x, "feedbackThreads", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
