package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Map of events to their argument */
trait EventsMap extends StObject {
  
  var Disconnect: String
  
  var GameReset: Unit
  
  var Joined: JoinResponse
  
  var NameAccept: typings.kahootJsUpdated.mod.NameAccept
  
  var Podium: typings.kahootJsUpdated.mod.Podium
  
  var QuestionEnd: typings.kahootJsUpdated.mod.QuestionEnd
  
  var QuestionReady: typings.kahootJsUpdated.mod.QuestionReady
  
  var QuestionStart: typings.kahootJsUpdated.mod.QuestionStart
  
  var QuizEnd: typings.kahootJsUpdated.mod.QuizEnd
  
  var QuizStart: typings.kahootJsUpdated.mod.QuizStart
  
  var RecoveryData: typings.kahootJsUpdated.mod.RecoveryData
  
  var TeamAccept: typings.kahootJsUpdated.mod.TeamAccept
  
  var TeamTalk: typings.kahootJsUpdated.mod.TeamTalk
  
  var TimeOver: typings.kahootJsUpdated.mod.TimeOver
  
  var TwoFactorCorrect: Unit
  
  var TwoFactorReset: Unit
  
  var TwoFactorWrong: Unit
}
object EventsMap {
  
  inline def apply(
    Disconnect: String,
    GameReset: Unit,
    Joined: JoinResponse,
    NameAccept: NameAccept,
    Podium: Podium,
    QuestionEnd: QuestionEnd,
    QuestionReady: QuestionReady,
    QuestionStart: QuestionStart,
    QuizEnd: QuizEnd,
    QuizStart: QuizStart,
    RecoveryData: RecoveryData,
    TeamAccept: TeamAccept,
    TeamTalk: TeamTalk,
    TimeOver: TimeOver,
    TwoFactorCorrect: Unit,
    TwoFactorReset: Unit,
    TwoFactorWrong: Unit
  ): EventsMap = {
    val __obj = js.Dynamic.literal(Disconnect = Disconnect.asInstanceOf[js.Any], GameReset = GameReset.asInstanceOf[js.Any], Joined = Joined.asInstanceOf[js.Any], NameAccept = NameAccept.asInstanceOf[js.Any], Podium = Podium.asInstanceOf[js.Any], QuestionEnd = QuestionEnd.asInstanceOf[js.Any], QuestionReady = QuestionReady.asInstanceOf[js.Any], QuestionStart = QuestionStart.asInstanceOf[js.Any], QuizEnd = QuizEnd.asInstanceOf[js.Any], QuizStart = QuizStart.asInstanceOf[js.Any], RecoveryData = RecoveryData.asInstanceOf[js.Any], TeamAccept = TeamAccept.asInstanceOf[js.Any], TeamTalk = TeamTalk.asInstanceOf[js.Any], TimeOver = TimeOver.asInstanceOf[js.Any], TwoFactorCorrect = TwoFactorCorrect.asInstanceOf[js.Any], TwoFactorReset = TwoFactorReset.asInstanceOf[js.Any], TwoFactorWrong = TwoFactorWrong.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsMap]
  }
  
  extension [Self <: EventsMap](x: Self) {
    
    inline def setDisconnect(value: String): Self = StObject.set(x, "Disconnect", value.asInstanceOf[js.Any])
    
    inline def setGameReset(value: Unit): Self = StObject.set(x, "GameReset", value.asInstanceOf[js.Any])
    
    inline def setJoined(value: JoinResponse): Self = StObject.set(x, "Joined", value.asInstanceOf[js.Any])
    
    inline def setNameAccept(value: NameAccept): Self = StObject.set(x, "NameAccept", value.asInstanceOf[js.Any])
    
    inline def setPodium(value: Podium): Self = StObject.set(x, "Podium", value.asInstanceOf[js.Any])
    
    inline def setQuestionEnd(value: QuestionEnd): Self = StObject.set(x, "QuestionEnd", value.asInstanceOf[js.Any])
    
    inline def setQuestionReady(value: QuestionReady): Self = StObject.set(x, "QuestionReady", value.asInstanceOf[js.Any])
    
    inline def setQuestionStart(value: QuestionStart): Self = StObject.set(x, "QuestionStart", value.asInstanceOf[js.Any])
    
    inline def setQuizEnd(value: QuizEnd): Self = StObject.set(x, "QuizEnd", value.asInstanceOf[js.Any])
    
    inline def setQuizStart(value: QuizStart): Self = StObject.set(x, "QuizStart", value.asInstanceOf[js.Any])
    
    inline def setRecoveryData(value: RecoveryData): Self = StObject.set(x, "RecoveryData", value.asInstanceOf[js.Any])
    
    inline def setTeamAccept(value: TeamAccept): Self = StObject.set(x, "TeamAccept", value.asInstanceOf[js.Any])
    
    inline def setTeamTalk(value: TeamTalk): Self = StObject.set(x, "TeamTalk", value.asInstanceOf[js.Any])
    
    inline def setTimeOver(value: TimeOver): Self = StObject.set(x, "TimeOver", value.asInstanceOf[js.Any])
    
    inline def setTwoFactorCorrect(value: Unit): Self = StObject.set(x, "TwoFactorCorrect", value.asInstanceOf[js.Any])
    
    inline def setTwoFactorReset(value: Unit): Self = StObject.set(x, "TwoFactorReset", value.asInstanceOf[js.Any])
    
    inline def setTwoFactorWrong(value: Unit): Self = StObject.set(x, "TwoFactorWrong", value.asInstanceOf[js.Any])
  }
}
