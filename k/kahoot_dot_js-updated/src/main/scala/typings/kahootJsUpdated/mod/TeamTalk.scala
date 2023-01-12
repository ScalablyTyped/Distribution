package typings.kahootJsUpdated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamTalk extends StObject {
  
  var duration: Double
  
  var gameBlockLayout: GameBlockLayout
  
  var gameBlockType: GameBlockType
  
  var questionIndex: Double
  
  var teamTalkDuration: Double
}
object TeamTalk {
  
  inline def apply(
    duration: Double,
    gameBlockLayout: GameBlockLayout,
    gameBlockType: GameBlockType,
    questionIndex: Double,
    teamTalkDuration: Double
  ): TeamTalk = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], gameBlockLayout = gameBlockLayout.asInstanceOf[js.Any], gameBlockType = gameBlockType.asInstanceOf[js.Any], questionIndex = questionIndex.asInstanceOf[js.Any], teamTalkDuration = teamTalkDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamTalk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamTalk] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGameBlockLayout(value: GameBlockLayout): Self = StObject.set(x, "gameBlockLayout", value.asInstanceOf[js.Any])
    
    inline def setGameBlockType(value: GameBlockType): Self = StObject.set(x, "gameBlockType", value.asInstanceOf[js.Any])
    
    inline def setQuestionIndex(value: Double): Self = StObject.set(x, "questionIndex", value.asInstanceOf[js.Any])
    
    inline def setTeamTalkDuration(value: Double): Self = StObject.set(x, "teamTalkDuration", value.asInstanceOf[js.Any])
  }
}
