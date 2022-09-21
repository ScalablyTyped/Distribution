package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse extends StObject {
  
  /**
    * The list of feedback threads to return.
    */
  var feedbackThreads: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread]] = js.undefined
  
  /**
    * A token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ListFeedbackThreadsResponse](x: Self) {
    
    inline def setFeedbackThreads(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1FeedbackThread]): Self = StObject.set(x, "feedbackThreads", value.asInstanceOf[js.Any])
    
    inline def setFeedbackThreadsUndefined: Self = StObject.set(x, "feedbackThreads", js.undefined)
    
    inline def setFeedbackThreadsVarargs(value: SchemaGoogleCloudDatalabelingV1beta1FeedbackThread*): Self = StObject.set(x, "feedbackThreads", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
