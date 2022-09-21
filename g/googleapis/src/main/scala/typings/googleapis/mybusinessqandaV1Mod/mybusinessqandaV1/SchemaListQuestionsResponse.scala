package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListQuestionsResponse extends StObject {
  
  /**
    * If the number of questions exceeds the requested max page size, this field is populated with a token to fetch the next page of questions on a subsequent call. If there are no more questions, this field is not present in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The requested questions,
    */
  var questions: js.UndefOr[js.Array[SchemaQuestion]] = js.undefined
  
  /**
    * The total number of questions posted for this location across all pages.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListQuestionsResponse {
  
  inline def apply(): SchemaListQuestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListQuestionsResponse]
  }
  
  extension [Self <: SchemaListQuestionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setQuestions(value: js.Array[SchemaQuestion]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
    
    inline def setQuestionsUndefined: Self = StObject.set(x, "questions", js.undefined)
    
    inline def setQuestionsVarargs(value: SchemaQuestion*): Self = StObject.set(x, "questions", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
