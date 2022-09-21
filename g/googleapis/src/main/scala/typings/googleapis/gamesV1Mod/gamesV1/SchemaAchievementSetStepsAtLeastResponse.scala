package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementSetStepsAtLeastResponse extends StObject {
  
  /**
    * The current steps recorded for this incremental achievement.
    */
  var currentSteps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementSetStepsAtLeastResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the current steps for the achievement has reached the number of steps required to unlock.
    */
  var newlyUnlocked: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAchievementSetStepsAtLeastResponse {
  
  inline def apply(): SchemaAchievementSetStepsAtLeastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementSetStepsAtLeastResponse]
  }
  
  extension [Self <: SchemaAchievementSetStepsAtLeastResponse](x: Self) {
    
    inline def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepsNull: Self = StObject.set(x, "currentSteps", null)
    
    inline def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewlyUnlocked(value: Boolean): Self = StObject.set(x, "newlyUnlocked", value.asInstanceOf[js.Any])
    
    inline def setNewlyUnlockedNull: Self = StObject.set(x, "newlyUnlocked", null)
    
    inline def setNewlyUnlockedUndefined: Self = StObject.set(x, "newlyUnlocked", js.undefined)
  }
}
