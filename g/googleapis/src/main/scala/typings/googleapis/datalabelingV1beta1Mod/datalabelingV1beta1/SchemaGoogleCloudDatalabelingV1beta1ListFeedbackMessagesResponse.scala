package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse extends StObject {
  
  /**
    * The list of feedback messages to return.
    */
  var feedbackMessages: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListFeedbackMessagesResponse](x: Self) {
    
    inline def setFeedbackMessages(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage]): Self = StObject.set(x, "feedbackMessages", value.asInstanceOf[js.Any])
    
    inline def setFeedbackMessagesUndefined: Self = StObject.set(x, "feedbackMessages", js.undefined)
    
    inline def setFeedbackMessagesVarargs(value: SchemaGoogleCloudDatalabelingV1beta1FeedbackMessage*): Self = StObject.set(x, "feedbackMessages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
