package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementUpdateRequest extends StObject {
  
  /**
    * The achievement this update is being applied to.
    */
  var achievementId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The payload if an update of type `INCREMENT` was requested for the achievement.
    */
  var incrementPayload: js.UndefOr[SchemaGamesAchievementIncrement] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateRequest`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The payload if an update of type `SET_STEPS_AT_LEAST` was requested for the achievement.
    */
  var setStepsAtLeastPayload: js.UndefOr[SchemaGamesAchievementSetStepsAtLeast] = js.undefined
  
  /**
    * The type of update being applied.
    */
  var updateType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAchievementUpdateRequest {
  
  inline def apply(): SchemaAchievementUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateRequest]
  }
  
  extension [Self <: SchemaAchievementUpdateRequest](x: Self) {
    
    inline def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    inline def setAchievementIdNull: Self = StObject.set(x, "achievementId", null)
    
    inline def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    inline def setIncrementPayload(value: SchemaGamesAchievementIncrement): Self = StObject.set(x, "incrementPayload", value.asInstanceOf[js.Any])
    
    inline def setIncrementPayloadUndefined: Self = StObject.set(x, "incrementPayload", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSetStepsAtLeastPayload(value: SchemaGamesAchievementSetStepsAtLeast): Self = StObject.set(x, "setStepsAtLeastPayload", value.asInstanceOf[js.Any])
    
    inline def setSetStepsAtLeastPayloadUndefined: Self = StObject.set(x, "setStepsAtLeastPayload", js.undefined)
    
    inline def setUpdateType(value: String): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    inline def setUpdateTypeNull: Self = StObject.set(x, "updateType", null)
    
    inline def setUpdateTypeUndefined: Self = StObject.set(x, "updateType", js.undefined)
  }
}
