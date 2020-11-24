package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1FeedbackMessage extends js.Object {
  
  /** String content of the feedback. Maximum of 10000 characters. */
  var body: js.UndefOr[String] = js.native
  
  /** Create time. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The image storing this feedback if the feedback is an image representing operator's comments. */
  var image: js.UndefOr[String] = js.native
  
  /**
    * Name of the feedback message in a feedback thread. Format:
    * 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}/feedbackMessage/{feedback_message_id}'
    */
  var name: js.UndefOr[String] = js.native
  
  var operatorFeedbackMetadata: js.UndefOr[js.Any] = js.native
  
  var requesterFeedbackMetadata: js.UndefOr[js.Any] = js.native
}
object GoogleCloudDatalabelingV1beta1FeedbackMessage {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1FeedbackMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1FeedbackMessage]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1FeedbackMessageOps[Self <: GoogleCloudDatalabelingV1beta1FeedbackMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOperatorFeedbackMetadata(value: js.Any): Self = this.set("operatorFeedbackMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorFeedbackMetadata: Self = this.set("operatorFeedbackMetadata", js.undefined)
    
    @scala.inline
    def setRequesterFeedbackMetadata(value: js.Any): Self = this.set("requesterFeedbackMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequesterFeedbackMetadata: Self = this.set("requesterFeedbackMetadata", js.undefined)
  }
}
