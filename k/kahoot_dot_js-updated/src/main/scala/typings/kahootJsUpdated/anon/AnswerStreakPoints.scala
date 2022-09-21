package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerStreakPoints extends StObject {
  
  var answerStreakPoints: PreviousStreakBonus
  
  var questionPoints: Double
  
  var totalPointsWithBonuses: Double
  
  var totalPointsWithoutBonuses: Double
}
object AnswerStreakPoints {
  
  inline def apply(
    answerStreakPoints: PreviousStreakBonus,
    questionPoints: Double,
    totalPointsWithBonuses: Double,
    totalPointsWithoutBonuses: Double
  ): AnswerStreakPoints = {
    val __obj = js.Dynamic.literal(answerStreakPoints = answerStreakPoints.asInstanceOf[js.Any], questionPoints = questionPoints.asInstanceOf[js.Any], totalPointsWithBonuses = totalPointsWithBonuses.asInstanceOf[js.Any], totalPointsWithoutBonuses = totalPointsWithoutBonuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerStreakPoints]
  }
  
  extension [Self <: AnswerStreakPoints](x: Self) {
    
    inline def setAnswerStreakPoints(value: PreviousStreakBonus): Self = StObject.set(x, "answerStreakPoints", value.asInstanceOf[js.Any])
    
    inline def setQuestionPoints(value: Double): Self = StObject.set(x, "questionPoints", value.asInstanceOf[js.Any])
    
    inline def setTotalPointsWithBonuses(value: Double): Self = StObject.set(x, "totalPointsWithBonuses", value.asInstanceOf[js.Any])
    
    inline def setTotalPointsWithoutBonuses(value: Double): Self = StObject.set(x, "totalPointsWithoutBonuses", value.asInstanceOf[js.Any])
  }
}
