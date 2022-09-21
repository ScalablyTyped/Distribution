package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnswer extends StObject {
  
  /**
    * Output only. The answers to a file upload question.
    */
  var fileUploadAnswers: js.UndefOr[SchemaFileUploadAnswers] = js.undefined
  
  /**
    * Output only. The grade for the answer if the form was a quiz.
    */
  var grade: js.UndefOr[SchemaGrade] = js.undefined
  
  /**
    * Output only. The question's ID. See also Question.question_id.
    */
  var questionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The specific answers as text.
    */
  var textAnswers: js.UndefOr[SchemaTextAnswers] = js.undefined
}
object SchemaAnswer {
  
  inline def apply(): SchemaAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnswer]
  }
  
  extension [Self <: SchemaAnswer](x: Self) {
    
    inline def setFileUploadAnswers(value: SchemaFileUploadAnswers): Self = StObject.set(x, "fileUploadAnswers", value.asInstanceOf[js.Any])
    
    inline def setFileUploadAnswersUndefined: Self = StObject.set(x, "fileUploadAnswers", js.undefined)
    
    inline def setGrade(value: SchemaGrade): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
    
    inline def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
    
    inline def setQuestionId(value: String): Self = StObject.set(x, "questionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdNull: Self = StObject.set(x, "questionId", null)
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "questionId", js.undefined)
    
    inline def setTextAnswers(value: SchemaTextAnswers): Self = StObject.set(x, "textAnswers", value.asInstanceOf[js.Any])
    
    inline def setTextAnswersUndefined: Self = StObject.set(x, "textAnswers", js.undefined)
  }
}
