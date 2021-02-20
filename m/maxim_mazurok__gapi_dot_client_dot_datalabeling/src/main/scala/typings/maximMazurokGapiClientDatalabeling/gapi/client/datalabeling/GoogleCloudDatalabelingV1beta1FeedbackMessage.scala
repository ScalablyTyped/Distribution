package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1FeedbackMessage extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1FeedbackMessageMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1FeedbackMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperatorFeedbackMetadata(value: js.Any): Self = StObject.set(x, "operatorFeedbackMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorFeedbackMetadataUndefined: Self = StObject.set(x, "operatorFeedbackMetadata", js.undefined)
    
    @scala.inline
    def setRequesterFeedbackMetadata(value: js.Any): Self = StObject.set(x, "requesterFeedbackMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterFeedbackMetadataUndefined: Self = StObject.set(x, "requesterFeedbackMetadata", js.undefined)
  }
}
