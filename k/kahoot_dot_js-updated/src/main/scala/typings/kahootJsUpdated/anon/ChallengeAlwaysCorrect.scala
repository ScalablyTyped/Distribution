package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeAlwaysCorrect extends StObject {
  
  var ChallengeAlwaysCorrect: js.UndefOr[Boolean] = js.undefined
  
  var ChallengeAutoContinue: js.UndefOr[Boolean] = js.undefined
  
  var ChallengeGetFullScore: js.UndefOr[Boolean] = js.undefined
  
  var ChallengeScore: js.UndefOr[Double | Null] = js.undefined
  
  var ChallengeUseStreakBonus: js.UndefOr[Boolean] = js.undefined
  
  var ChallengeWaitForInput: js.UndefOr[Boolean] = js.undefined
}
object ChallengeAlwaysCorrect {
  
  inline def apply(): ChallengeAlwaysCorrect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeAlwaysCorrect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChallengeAlwaysCorrect] (val x: Self) extends AnyVal {
    
    inline def setChallengeAlwaysCorrect(value: Boolean): Self = StObject.set(x, "ChallengeAlwaysCorrect", value.asInstanceOf[js.Any])
    
    inline def setChallengeAlwaysCorrectUndefined: Self = StObject.set(x, "ChallengeAlwaysCorrect", js.undefined)
    
    inline def setChallengeAutoContinue(value: Boolean): Self = StObject.set(x, "ChallengeAutoContinue", value.asInstanceOf[js.Any])
    
    inline def setChallengeAutoContinueUndefined: Self = StObject.set(x, "ChallengeAutoContinue", js.undefined)
    
    inline def setChallengeGetFullScore(value: Boolean): Self = StObject.set(x, "ChallengeGetFullScore", value.asInstanceOf[js.Any])
    
    inline def setChallengeGetFullScoreUndefined: Self = StObject.set(x, "ChallengeGetFullScore", js.undefined)
    
    inline def setChallengeScore(value: Double): Self = StObject.set(x, "ChallengeScore", value.asInstanceOf[js.Any])
    
    inline def setChallengeScoreNull: Self = StObject.set(x, "ChallengeScore", null)
    
    inline def setChallengeScoreUndefined: Self = StObject.set(x, "ChallengeScore", js.undefined)
    
    inline def setChallengeUseStreakBonus(value: Boolean): Self = StObject.set(x, "ChallengeUseStreakBonus", value.asInstanceOf[js.Any])
    
    inline def setChallengeUseStreakBonusUndefined: Self = StObject.set(x, "ChallengeUseStreakBonus", js.undefined)
    
    inline def setChallengeWaitForInput(value: Boolean): Self = StObject.set(x, "ChallengeWaitForInput", value.asInstanceOf[js.Any])
    
    inline def setChallengeWaitForInputUndefined: Self = StObject.set(x, "ChallengeWaitForInput", js.undefined)
  }
}
