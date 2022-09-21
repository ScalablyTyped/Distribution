package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuestionReady extends StObject {
  
  var currentQuestionAnswerCount: Double
  
  var gameBlockIndex: Double
  
  var gameBlockLayout: GameBlockLayout
  
  var gameBlockType: GameBlockType
  
  var getReadyTimeAvailable: Double
  
  var getReadyTimeRemaining: Double
  
  var index: Double
  
  var layout: String
  
  var numberOfAnswersAllowed: Double
  
  var numberOfChoices: Double
  
  var questionIndex: Double
  
  var questionRestricted: Boolean
  
  var timeAvailable: Double
  
  var timeLeft: Double
  
  var timeRemaining: Double
  
  var `type`: String
  
  var video: QuizVideo
}
object QuestionReady {
  
  inline def apply(
    currentQuestionAnswerCount: Double,
    gameBlockIndex: Double,
    gameBlockLayout: GameBlockLayout,
    gameBlockType: GameBlockType,
    getReadyTimeAvailable: Double,
    getReadyTimeRemaining: Double,
    index: Double,
    layout: String,
    numberOfAnswersAllowed: Double,
    numberOfChoices: Double,
    questionIndex: Double,
    questionRestricted: Boolean,
    timeAvailable: Double,
    timeLeft: Double,
    timeRemaining: Double,
    `type`: String,
    video: QuizVideo
  ): QuestionReady = {
    val __obj = js.Dynamic.literal(currentQuestionAnswerCount = currentQuestionAnswerCount.asInstanceOf[js.Any], gameBlockIndex = gameBlockIndex.asInstanceOf[js.Any], gameBlockLayout = gameBlockLayout.asInstanceOf[js.Any], gameBlockType = gameBlockType.asInstanceOf[js.Any], getReadyTimeAvailable = getReadyTimeAvailable.asInstanceOf[js.Any], getReadyTimeRemaining = getReadyTimeRemaining.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], numberOfAnswersAllowed = numberOfAnswersAllowed.asInstanceOf[js.Any], numberOfChoices = numberOfChoices.asInstanceOf[js.Any], questionIndex = questionIndex.asInstanceOf[js.Any], questionRestricted = questionRestricted.asInstanceOf[js.Any], timeAvailable = timeAvailable.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any], timeRemaining = timeRemaining.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionReady]
  }
  
  extension [Self <: QuestionReady](x: Self) {
    
    inline def setCurrentQuestionAnswerCount(value: Double): Self = StObject.set(x, "currentQuestionAnswerCount", value.asInstanceOf[js.Any])
    
    inline def setGameBlockIndex(value: Double): Self = StObject.set(x, "gameBlockIndex", value.asInstanceOf[js.Any])
    
    inline def setGameBlockLayout(value: GameBlockLayout): Self = StObject.set(x, "gameBlockLayout", value.asInstanceOf[js.Any])
    
    inline def setGameBlockType(value: GameBlockType): Self = StObject.set(x, "gameBlockType", value.asInstanceOf[js.Any])
    
    inline def setGetReadyTimeAvailable(value: Double): Self = StObject.set(x, "getReadyTimeAvailable", value.asInstanceOf[js.Any])
    
    inline def setGetReadyTimeRemaining(value: Double): Self = StObject.set(x, "getReadyTimeRemaining", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAnswersAllowed(value: Double): Self = StObject.set(x, "numberOfAnswersAllowed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChoices(value: Double): Self = StObject.set(x, "numberOfChoices", value.asInstanceOf[js.Any])
    
    inline def setQuestionIndex(value: Double): Self = StObject.set(x, "questionIndex", value.asInstanceOf[js.Any])
    
    inline def setQuestionRestricted(value: Boolean): Self = StObject.set(x, "questionRestricted", value.asInstanceOf[js.Any])
    
    inline def setTimeAvailable(value: Double): Self = StObject.set(x, "timeAvailable", value.asInstanceOf[js.Any])
    
    inline def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: Double): Self = StObject.set(x, "timeRemaining", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: QuizVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
