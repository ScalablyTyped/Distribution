package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementUpdateResponse extends StObject {
  
  /**
    * The achievement this update is was applied to.
    */
  var achievementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current state of the achievement.
    */
  var currentState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current steps recorded for this achievement if it is incremental.
    */
  var currentSteps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the requested updates actually affected the achievement.
    */
  var updateOccurred: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAchievementUpdateResponse {
  
  inline def apply(): SchemaAchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateResponse]
  }
  
  extension [Self <: SchemaAchievementUpdateResponse](x: Self) {
    
    inline def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    inline def setAchievementIdNull: Self = StObject.set(x, "achievementId", null)
    
    inline def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    inline def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateNull: Self = StObject.set(x, "currentState", null)
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepsNull: Self = StObject.set(x, "currentSteps", null)
    
    inline def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewlyUnlocked(value: Boolean): Self = StObject.set(x, "newlyUnlocked", value.asInstanceOf[js.Any])
    
    inline def setNewlyUnlockedNull: Self = StObject.set(x, "newlyUnlocked", null)
    
    inline def setNewlyUnlockedUndefined: Self = StObject.set(x, "newlyUnlocked", js.undefined)
    
    inline def setUpdateOccurred(value: Boolean): Self = StObject.set(x, "updateOccurred", value.asInstanceOf[js.Any])
    
    inline def setUpdateOccurredNull: Self = StObject.set(x, "updateOccurred", null)
    
    inline def setUpdateOccurredUndefined: Self = StObject.set(x, "updateOccurred", js.undefined)
  }
}
