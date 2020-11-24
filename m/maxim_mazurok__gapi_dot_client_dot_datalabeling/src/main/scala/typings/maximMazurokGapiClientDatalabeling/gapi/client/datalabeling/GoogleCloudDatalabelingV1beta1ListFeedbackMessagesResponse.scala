package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponseOps[Self <: GoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFeedbackMessagesVarargs(value: GoogleCloudDatalabelingV1beta1FeedbackMessage*): Self = this.set("feedbackMessages", js.Array(value :_*))
    
    @scala.inline
    def setFeedbackMessages(value: js.Array[GoogleCloudDatalabelingV1beta1FeedbackMessage]): Self = this.set("feedbackMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedbackMessages: Self = this.set("feedbackMessages", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
