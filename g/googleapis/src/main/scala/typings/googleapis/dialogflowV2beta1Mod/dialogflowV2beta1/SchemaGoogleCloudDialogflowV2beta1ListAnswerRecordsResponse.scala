package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse extends StObject {
  
  /**
    * The list of answer records.
    */
  var answerRecords: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Or empty if there are no more results. Pass this value in the ListAnswerRecordsRequest.page_token field in the subsequent call to `ListAnswerRecords` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListAnswerRecordsResponse](x: Self) {
    
    inline def setAnswerRecords(value: js.Array[SchemaGoogleCloudDialogflowV2beta1AnswerRecord]): Self = StObject.set(x, "answerRecords", value.asInstanceOf[js.Any])
    
    inline def setAnswerRecordsUndefined: Self = StObject.set(x, "answerRecords", js.undefined)
    
    inline def setAnswerRecordsVarargs(value: SchemaGoogleCloudDialogflowV2beta1AnswerRecord*): Self = StObject.set(x, "answerRecords", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
