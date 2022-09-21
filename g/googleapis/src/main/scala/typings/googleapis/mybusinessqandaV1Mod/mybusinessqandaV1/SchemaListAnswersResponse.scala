package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAnswersResponse extends StObject {
  
  /**
    * The requested answers.
    */
  var answers: js.UndefOr[js.Array[SchemaAnswer]] = js.undefined
  
  /**
    * If the number of answers exceeds the requested max page size, this field is populated with a token to fetch the next page of answers on a subsequent call. If there are no more answers, this field is not present in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of answers posted for this question across all pages.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListAnswersResponse {
  
  inline def apply(): SchemaListAnswersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnswersResponse]
  }
  
  extension [Self <: SchemaListAnswersResponse](x: Self) {
    
    inline def setAnswers(value: js.Array[SchemaAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    inline def setAnswersUndefined: Self = StObject.set(x, "answers", js.undefined)
    
    inline def setAnswersVarargs(value: SchemaAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
