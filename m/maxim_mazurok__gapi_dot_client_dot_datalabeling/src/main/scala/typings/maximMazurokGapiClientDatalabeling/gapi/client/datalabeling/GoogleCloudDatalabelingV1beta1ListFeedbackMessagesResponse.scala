package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse extends StObject {
  
  /** The list of feedback messages to return. */
  var feedbackMessages: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1FeedbackMessage]] = js.native
  
  /** A token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponseMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedbackMessages(value: js.Array[GoogleCloudDatalabelingV1beta1FeedbackMessage]): Self = StObject.set(x, "feedbackMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackMessagesUndefined: Self = StObject.set(x, "feedbackMessages", js.undefined)
    
    @scala.inline
    def setFeedbackMessagesVarargs(value: GoogleCloudDatalabelingV1beta1FeedbackMessage*): Self = StObject.set(x, "feedbackMessages", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
