package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrade extends StObject {
  
  /**
    * Output only. Whether the question was answered correctly or not. A zero-point score is not enough to infer incorrectness, since a correctly answered question could be worth zero points.
    */
  var correct: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Additional feedback given for an answer.
    */
  var feedback: js.UndefOr[SchemaFeedback] = js.undefined
  
  /**
    * Output only. The numeric score awarded for the answer.
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGrade {
  
  inline def apply(): SchemaGrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrade]
  }
  
  extension [Self <: SchemaGrade](x: Self) {
    
    inline def setCorrect(value: Boolean): Self = StObject.set(x, "correct", value.asInstanceOf[js.Any])
    
    inline def setCorrectNull: Self = StObject.set(x, "correct", null)
    
    inline def setCorrectUndefined: Self = StObject.set(x, "correct", js.undefined)
    
    inline def setFeedback(value: SchemaFeedback): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackUndefined: Self = StObject.set(x, "feedback", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
