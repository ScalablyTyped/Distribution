package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrading extends StObject {
  
  /**
    * Required. The answer key for the question. Responses are automatically graded based on this field.
    */
  var correctAnswers: js.UndefOr[SchemaCorrectAnswers] = js.undefined
  
  /**
    * The feedback displayed for all answers. This is commonly used for short answer questions when a quiz owner wants to quickly give respondents some sense of whether they answered the question correctly before they've had a chance to officially grade the response. General feedback cannot be set for automatically graded multiple choice questions.
    */
  var generalFeedback: js.UndefOr[SchemaFeedback] = js.undefined
  
  /**
    * Required. The maximum number of points a respondent can automatically get for a correct answer. This must not be negative.
    */
  var pointValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The feedback displayed for correct responses. This feedback can only be set for multiple choice questions that have correct answers provided.
    */
  var whenRight: js.UndefOr[SchemaFeedback] = js.undefined
  
  /**
    * The feedback displayed for incorrect responses. This feedback can only be set for multiple choice questions that have correct answers provided.
    */
  var whenWrong: js.UndefOr[SchemaFeedback] = js.undefined
}
object SchemaGrading {
  
  inline def apply(): SchemaGrading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrading]
  }
  
  extension [Self <: SchemaGrading](x: Self) {
    
    inline def setCorrectAnswers(value: SchemaCorrectAnswers): Self = StObject.set(x, "correctAnswers", value.asInstanceOf[js.Any])
    
    inline def setCorrectAnswersUndefined: Self = StObject.set(x, "correctAnswers", js.undefined)
    
    inline def setGeneralFeedback(value: SchemaFeedback): Self = StObject.set(x, "generalFeedback", value.asInstanceOf[js.Any])
    
    inline def setGeneralFeedbackUndefined: Self = StObject.set(x, "generalFeedback", js.undefined)
    
    inline def setPointValue(value: Double): Self = StObject.set(x, "pointValue", value.asInstanceOf[js.Any])
    
    inline def setPointValueNull: Self = StObject.set(x, "pointValue", null)
    
    inline def setPointValueUndefined: Self = StObject.set(x, "pointValue", js.undefined)
    
    inline def setWhenRight(value: SchemaFeedback): Self = StObject.set(x, "whenRight", value.asInstanceOf[js.Any])
    
    inline def setWhenRightUndefined: Self = StObject.set(x, "whenRight", js.undefined)
    
    inline def setWhenWrong(value: SchemaFeedback): Self = StObject.set(x, "whenWrong", value.asInstanceOf[js.Any])
    
    inline def setWhenWrongUndefined: Self = StObject.set(x, "whenWrong", js.undefined)
  }
}
