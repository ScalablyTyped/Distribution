package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse extends StObject {
  
  /**
    * The list of answer records.
    */
  var answerRecords: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2AnswerRecord]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Or empty if there are no more results. Pass this value in the ListAnswerRecordsRequest.page_token field in the subsequent call to `ListAnswerRecords` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ListAnswerRecordsResponse](x: Self) {
    
    inline def setAnswerRecords(value: js.Array[SchemaGoogleCloudDialogflowV2AnswerRecord]): Self = StObject.set(x, "answerRecords", value.asInstanceOf[js.Any])
    
    inline def setAnswerRecordsUndefined: Self = StObject.set(x, "answerRecords", js.undefined)
    
    inline def setAnswerRecordsVarargs(value: SchemaGoogleCloudDialogflowV2AnswerRecord*): Self = StObject.set(x, "answerRecords", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
