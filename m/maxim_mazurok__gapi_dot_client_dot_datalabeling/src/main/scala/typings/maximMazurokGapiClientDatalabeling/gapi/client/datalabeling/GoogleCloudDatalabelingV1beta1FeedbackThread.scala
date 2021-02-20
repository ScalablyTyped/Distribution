package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1FeedbackThread extends StObject {
  
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
  implicit class GoogleCloudDatalabelingV1beta1FeedbackThreadMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1FeedbackThread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeedbackThreadMetadata(value: GoogleCloudDatalabelingV1beta1FeedbackThreadMetadata): Self = StObject.set(x, "feedbackThreadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackThreadMetadataUndefined: Self = StObject.set(x, "feedbackThreadMetadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
