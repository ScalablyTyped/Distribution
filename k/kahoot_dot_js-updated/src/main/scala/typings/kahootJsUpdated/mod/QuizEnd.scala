package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuizEnd extends StObject {
  
  var challengeId: Null
  
  var cid: Double
  
  var correctCount: Double
  
  var hostId: String
  
  var incorrectCount: Double
  
  var isGhost: Boolean
  
  var isKicked: Boolean
  
  var isOnlyNonPointGameBlockKahoot: Boolean
  
  var name: String
  
  var playerCount: Double
  
  var quizId: String
  
  var rank: Double
  
  var startTime: Double
  
  var totalScore: Double
  
  var unansweredCount: Double
}
object QuizEnd {
  
  inline def apply(
    challengeId: Null,
    cid: Double,
    correctCount: Double,
    hostId: String,
    incorrectCount: Double,
    isGhost: Boolean,
    isKicked: Boolean,
    isOnlyNonPointGameBlockKahoot: Boolean,
    name: String,
    playerCount: Double,
    quizId: String,
    rank: Double,
    startTime: Double,
    totalScore: Double,
    unansweredCount: Double
  ): QuizEnd = {
    val __obj = js.Dynamic.literal(challengeId = challengeId.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], correctCount = correctCount.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], incorrectCount = incorrectCount.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isKicked = isKicked.asInstanceOf[js.Any], isOnlyNonPointGameBlockKahoot = isOnlyNonPointGameBlockKahoot.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playerCount = playerCount.asInstanceOf[js.Any], quizId = quizId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], totalScore = totalScore.asInstanceOf[js.Any], unansweredCount = unansweredCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuizEnd]
  }
  
  extension [Self <: QuizEnd](x: Self) {
    
    inline def setChallengeId(value: Null): Self = StObject.set(x, "challengeId", value.asInstanceOf[js.Any])
    
    inline def setCid(value: Double): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCorrectCount(value: Double): Self = StObject.set(x, "correctCount", value.asInstanceOf[js.Any])
    
    inline def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    inline def setIncorrectCount(value: Double): Self = StObject.set(x, "incorrectCount", value.asInstanceOf[js.Any])
    
    inline def setIsGhost(value: Boolean): Self = StObject.set(x, "isGhost", value.asInstanceOf[js.Any])
    
    inline def setIsKicked(value: Boolean): Self = StObject.set(x, "isKicked", value.asInstanceOf[js.Any])
    
    inline def setIsOnlyNonPointGameBlockKahoot(value: Boolean): Self = StObject.set(x, "isOnlyNonPointGameBlockKahoot", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlayerCount(value: Double): Self = StObject.set(x, "playerCount", value.asInstanceOf[js.Any])
    
    inline def setQuizId(value: String): Self = StObject.set(x, "quizId", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTotalScore(value: Double): Self = StObject.set(x, "totalScore", value.asInstanceOf[js.Any])
    
    inline def setUnansweredCount(value: Double): Self = StObject.set(x, "unansweredCount", value.asInstanceOf[js.Any])
  }
}
