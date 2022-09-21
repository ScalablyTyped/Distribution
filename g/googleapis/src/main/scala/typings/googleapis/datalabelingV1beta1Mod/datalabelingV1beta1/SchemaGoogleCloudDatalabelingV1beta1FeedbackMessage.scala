package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage extends StObject {
  
  /**
    * String content of the feedback. Maximum of 10000 characters.
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Create time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image storing this feedback if the feedback is an image representing operator's comments.
    */
  var image: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the feedback message in a feedback thread. Format: 'project/{project_id\}/datasets/{dataset_id\}/annotatedDatasets/{annotated_dataset_id\}/feedbackThreads/{feedback_thread_id\}/feedbackMessage/{feedback_message_id\}'
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var operatorFeedbackMetadata: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1OperatorFeedbackMetadata] = js.undefined
  
  var requesterFeedbackMetadata: js.UndefOr[SchemaGoogleCloudDatalabelingV1beta1RequesterFeedbackMetadata] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperatorFeedbackMetadata(value: SchemaGoogleCloudDatalabelingV1beta1OperatorFeedbackMetadata): Self = StObject.set(x, "operatorFeedbackMetadata", value.asInstanceOf[js.Any])
    
    inline def setOperatorFeedbackMetadataUndefined: Self = StObject.set(x, "operatorFeedbackMetadata", js.undefined)
    
    inline def setRequesterFeedbackMetadata(value: SchemaGoogleCloudDatalabelingV1beta1RequesterFeedbackMetadata): Self = StObject.set(x, "requesterFeedbackMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequesterFeedbackMetadataUndefined: Self = StObject.set(x, "requesterFeedbackMetadata", js.undefined)
  }
}
