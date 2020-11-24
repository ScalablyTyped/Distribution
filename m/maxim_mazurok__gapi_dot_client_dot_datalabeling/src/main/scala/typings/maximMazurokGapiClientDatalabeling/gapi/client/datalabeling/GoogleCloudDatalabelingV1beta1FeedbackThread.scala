package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1FeedbackThread extends js.Object {
  
  /** Metadata regarding the feedback thread. */
  var feedbackThreadMetadata: js.UndefOr[GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata] = js.native
  
  /** Name of the feedback thread. Format: 'project/{project_id}/datasets/{dataset_id}/annotatedDatasets/{annotated_dataset_id}/feedbackThreads/{feedback_thread_id}' */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1FeedbackThread {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1FeedbackThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1FeedbackThread]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1FeedbackThreadOps[Self <: GoogleCloudDatalabelingV1beta1FeedbackThread] (val x: Self) extends AnyVal {
    
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
    def setFeedbackThreadMetadata(value: GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata): Self = this.set("feedbackThreadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedbackThreadMetadata: Self = this.set("feedbackThreadMetadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
