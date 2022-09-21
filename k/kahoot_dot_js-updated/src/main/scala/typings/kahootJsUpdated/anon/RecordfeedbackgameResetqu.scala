package typings.kahootJsUpdated.anon

import typings.kahootJsUpdated.liveBaseMessageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'feedback' | 'gameReset' | 'quizStart' | 'quizEnd' | 'podium' | 'timeOver' | 'QuestionReady' | 'questionStart' | 'questionEnd' | 'nameAccept' | 'teamAccept' | 'teamTalk' | 'PingChecker' | 'timetrack' | 'Disconnect' | 'JoinFinish', (message : kahoot.js-updated.kahoot.js-updated/src/assets/LiveBaseMessage.^): void> */
trait RecordfeedbackgameResetqu extends StObject {
  
  def Disconnect(message: ^): Unit
  @JSName("Disconnect")
  var Disconnect_Original: js.Function1[/* message */ ^, Unit]
  
  def JoinFinish(message: ^): Unit
  @JSName("JoinFinish")
  var JoinFinish_Original: js.Function1[/* message */ ^, Unit]
  
  def PingChecker(message: ^): Unit
  @JSName("PingChecker")
  var PingChecker_Original: js.Function1[/* message */ ^, Unit]
  
  def QuestionReady(message: ^): Unit
  @JSName("QuestionReady")
  var QuestionReady_Original: js.Function1[/* message */ ^, Unit]
  
  def feedback(message: ^): Unit
  @JSName("feedback")
  var feedback_Original: js.Function1[/* message */ ^, Unit]
  
  def gameReset(message: ^): Unit
  @JSName("gameReset")
  var gameReset_Original: js.Function1[/* message */ ^, Unit]
  
  def nameAccept(message: ^): Unit
  @JSName("nameAccept")
  var nameAccept_Original: js.Function1[/* message */ ^, Unit]
  
  def podium(message: ^): Unit
  @JSName("podium")
  var podium_Original: js.Function1[/* message */ ^, Unit]
  
  def questionEnd(message: ^): Unit
  @JSName("questionEnd")
  var questionEnd_Original: js.Function1[/* message */ ^, Unit]
  
  def questionStart(message: ^): Unit
  @JSName("questionStart")
  var questionStart_Original: js.Function1[/* message */ ^, Unit]
  
  def quizEnd(message: ^): Unit
  @JSName("quizEnd")
  var quizEnd_Original: js.Function1[/* message */ ^, Unit]
  
  def quizStart(message: ^): Unit
  @JSName("quizStart")
  var quizStart_Original: js.Function1[/* message */ ^, Unit]
  
  def teamAccept(message: ^): Unit
  @JSName("teamAccept")
  var teamAccept_Original: js.Function1[/* message */ ^, Unit]
  
  def teamTalk(message: ^): Unit
  @JSName("teamTalk")
  var teamTalk_Original: js.Function1[/* message */ ^, Unit]
  
  def timeOver(message: ^): Unit
  @JSName("timeOver")
  var timeOver_Original: js.Function1[/* message */ ^, Unit]
  
  def timetrack(message: ^): Unit
  @JSName("timetrack")
  var timetrack_Original: js.Function1[/* message */ ^, Unit]
}
object RecordfeedbackgameResetqu {
  
  inline def apply(
    Disconnect: /* message */ ^ => Unit,
    JoinFinish: /* message */ ^ => Unit,
    PingChecker: /* message */ ^ => Unit,
    QuestionReady: /* message */ ^ => Unit,
    feedback: /* message */ ^ => Unit,
    gameReset: /* message */ ^ => Unit,
    nameAccept: /* message */ ^ => Unit,
    podium: /* message */ ^ => Unit,
    questionEnd: /* message */ ^ => Unit,
    questionStart: /* message */ ^ => Unit,
    quizEnd: /* message */ ^ => Unit,
    quizStart: /* message */ ^ => Unit,
    teamAccept: /* message */ ^ => Unit,
    teamTalk: /* message */ ^ => Unit,
    timeOver: /* message */ ^ => Unit,
    timetrack: /* message */ ^ => Unit
  ): RecordfeedbackgameResetqu = {
    val __obj = js.Dynamic.literal(Disconnect = js.Any.fromFunction1(Disconnect), JoinFinish = js.Any.fromFunction1(JoinFinish), PingChecker = js.Any.fromFunction1(PingChecker), QuestionReady = js.Any.fromFunction1(QuestionReady), feedback = js.Any.fromFunction1(feedback), gameReset = js.Any.fromFunction1(gameReset), nameAccept = js.Any.fromFunction1(nameAccept), podium = js.Any.fromFunction1(podium), questionEnd = js.Any.fromFunction1(questionEnd), questionStart = js.Any.fromFunction1(questionStart), quizEnd = js.Any.fromFunction1(quizEnd), quizStart = js.Any.fromFunction1(quizStart), teamAccept = js.Any.fromFunction1(teamAccept), teamTalk = js.Any.fromFunction1(teamTalk), timeOver = js.Any.fromFunction1(timeOver), timetrack = js.Any.fromFunction1(timetrack))
    __obj.asInstanceOf[RecordfeedbackgameResetqu]
  }
  
  extension [Self <: RecordfeedbackgameResetqu](x: Self) {
    
    inline def setDisconnect(value: /* message */ ^ => Unit): Self = StObject.set(x, "Disconnect", js.Any.fromFunction1(value))
    
    inline def setFeedback(value: /* message */ ^ => Unit): Self = StObject.set(x, "feedback", js.Any.fromFunction1(value))
    
    inline def setGameReset(value: /* message */ ^ => Unit): Self = StObject.set(x, "gameReset", js.Any.fromFunction1(value))
    
    inline def setJoinFinish(value: /* message */ ^ => Unit): Self = StObject.set(x, "JoinFinish", js.Any.fromFunction1(value))
    
    inline def setNameAccept(value: /* message */ ^ => Unit): Self = StObject.set(x, "nameAccept", js.Any.fromFunction1(value))
    
    inline def setPingChecker(value: /* message */ ^ => Unit): Self = StObject.set(x, "PingChecker", js.Any.fromFunction1(value))
    
    inline def setPodium(value: /* message */ ^ => Unit): Self = StObject.set(x, "podium", js.Any.fromFunction1(value))
    
    inline def setQuestionEnd(value: /* message */ ^ => Unit): Self = StObject.set(x, "questionEnd", js.Any.fromFunction1(value))
    
    inline def setQuestionReady(value: /* message */ ^ => Unit): Self = StObject.set(x, "QuestionReady", js.Any.fromFunction1(value))
    
    inline def setQuestionStart(value: /* message */ ^ => Unit): Self = StObject.set(x, "questionStart", js.Any.fromFunction1(value))
    
    inline def setQuizEnd(value: /* message */ ^ => Unit): Self = StObject.set(x, "quizEnd", js.Any.fromFunction1(value))
    
    inline def setQuizStart(value: /* message */ ^ => Unit): Self = StObject.set(x, "quizStart", js.Any.fromFunction1(value))
    
    inline def setTeamAccept(value: /* message */ ^ => Unit): Self = StObject.set(x, "teamAccept", js.Any.fromFunction1(value))
    
    inline def setTeamTalk(value: /* message */ ^ => Unit): Self = StObject.set(x, "teamTalk", js.Any.fromFunction1(value))
    
    inline def setTimeOver(value: /* message */ ^ => Unit): Self = StObject.set(x, "timeOver", js.Any.fromFunction1(value))
    
    inline def setTimetrack(value: /* message */ ^ => Unit): Self = StObject.set(x, "timetrack", js.Any.fromFunction1(value))
  }
}
