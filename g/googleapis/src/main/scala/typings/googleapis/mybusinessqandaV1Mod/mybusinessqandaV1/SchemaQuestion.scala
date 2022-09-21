package typings.googleapis.mybusinessqandaV1Mod.mybusinessqandaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuestion extends StObject {
  
  /**
    * Output only. The author of the question.
    */
  var author: js.UndefOr[SchemaAuthor] = js.undefined
  
  /**
    * Output only. The timestamp for when the question was written.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The unique name for the question. locations/x/questions/x This field will be ignored if set during question creation.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The text of the question. It should contain at least three words and the total length should be greater than or equal to 10 characters. The maximum length is 4096 characters.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A list of answers to the question, sorted by upvotes. This may not be a complete list of answers depending on the request parameters (answers_per_question)
    */
  var topAnswers: js.UndefOr[js.Array[SchemaAnswer]] = js.undefined
  
  /**
    * Output only. The total number of answers posted for this question.
    */
  var totalAnswerCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The timestamp for when the question was last modified.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of upvotes for the question.
    */
  var upvoteCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaQuestion {
  
  inline def apply(): SchemaQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestion]
  }
  
  extension [Self <: SchemaQuestion](x: Self) {
    
    inline def setAuthor(value: SchemaAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTopAnswers(value: js.Array[SchemaAnswer]): Self = StObject.set(x, "topAnswers", value.asInstanceOf[js.Any])
    
    inline def setTopAnswersUndefined: Self = StObject.set(x, "topAnswers", js.undefined)
    
    inline def setTopAnswersVarargs(value: SchemaAnswer*): Self = StObject.set(x, "topAnswers", js.Array(value*))
    
    inline def setTotalAnswerCount(value: Double): Self = StObject.set(x, "totalAnswerCount", value.asInstanceOf[js.Any])
    
    inline def setTotalAnswerCountNull: Self = StObject.set(x, "totalAnswerCount", null)
    
    inline def setTotalAnswerCountUndefined: Self = StObject.set(x, "totalAnswerCount", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUpvoteCount(value: Double): Self = StObject.set(x, "upvoteCount", value.asInstanceOf[js.Any])
    
    inline def setUpvoteCountNull: Self = StObject.set(x, "upvoteCount", null)
    
    inline def setUpvoteCountUndefined: Self = StObject.set(x, "upvoteCount", js.undefined)
  }
}
