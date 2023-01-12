package typings.kahootJsUpdated.mod

import typings.kahootJsUpdated.anon.AnswerStreakPoints
import typings.kahootJsUpdated.anon.IsGhost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionEnd extends StObject {
  
  var choice: Double
  
  var correctChoices: js.Array[Double]
  
  var isCorrect: Boolean
  
  var lastGameBlockIndex: Double
  
  var nemesis: IsGhost
  
  var points: Double
  
  /** @todo add types */
  var pointsQuestion: Any
  
  var pointsdata: AnswerStreakPoints
  
  var rank: Double
  
  var receivedTime: Double
  
  var text: String
  
  var totalScore: Double
  
  /** @todo add types */
  var `type`: Any
}
object QuestionEnd {
  
  inline def apply(
    choice: Double,
    correctChoices: js.Array[Double],
    isCorrect: Boolean,
    lastGameBlockIndex: Double,
    nemesis: IsGhost,
    points: Double,
    pointsQuestion: Any,
    pointsdata: AnswerStreakPoints,
    rank: Double,
    receivedTime: Double,
    text: String,
    totalScore: Double,
    `type`: Any
  ): QuestionEnd = {
    val __obj = js.Dynamic.literal(choice = choice.asInstanceOf[js.Any], correctChoices = correctChoices.asInstanceOf[js.Any], isCorrect = isCorrect.asInstanceOf[js.Any], lastGameBlockIndex = lastGameBlockIndex.asInstanceOf[js.Any], nemesis = nemesis.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pointsQuestion = pointsQuestion.asInstanceOf[js.Any], pointsdata = pointsdata.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], receivedTime = receivedTime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], totalScore = totalScore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionEnd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuestionEnd] (val x: Self) extends AnyVal {
    
    inline def setChoice(value: Double): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
    
    inline def setCorrectChoices(value: js.Array[Double]): Self = StObject.set(x, "correctChoices", value.asInstanceOf[js.Any])
    
    inline def setCorrectChoicesVarargs(value: Double*): Self = StObject.set(x, "correctChoices", js.Array(value*))
    
    inline def setIsCorrect(value: Boolean): Self = StObject.set(x, "isCorrect", value.asInstanceOf[js.Any])
    
    inline def setLastGameBlockIndex(value: Double): Self = StObject.set(x, "lastGameBlockIndex", value.asInstanceOf[js.Any])
    
    inline def setNemesis(value: IsGhost): Self = StObject.set(x, "nemesis", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsQuestion(value: Any): Self = StObject.set(x, "pointsQuestion", value.asInstanceOf[js.Any])
    
    inline def setPointsdata(value: AnswerStreakPoints): Self = StObject.set(x, "pointsdata", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setReceivedTime(value: Double): Self = StObject.set(x, "receivedTime", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTotalScore(value: Double): Self = StObject.set(x, "totalScore", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
