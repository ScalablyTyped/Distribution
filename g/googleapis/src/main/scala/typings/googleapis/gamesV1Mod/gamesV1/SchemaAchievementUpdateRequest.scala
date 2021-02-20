package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a request to update an achievement.
  */
@js.native
trait SchemaAchievementUpdateRequest extends StObject {
  
  /**
    * The achievement this update is being applied to.
    */
  var achievementId: js.UndefOr[String] = js.native
  
  /**
    * The payload if an update of type INCREMENT was requested for the
    * achievement.
    */
  var incrementPayload: js.UndefOr[SchemaGamesAchievementIncrement] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateRequest.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The payload if an update of type SET_STEPS_AT_LEAST was requested for the
    * achievement.
    */
  var setStepsAtLeastPayload: js.UndefOr[SchemaGamesAchievementSetStepsAtLeast] = js.native
  
  /**
    * The type of update being applied. Possible values are:   -
    * &quot;REVEAL&quot; - Achievement is revealed.  - &quot;UNLOCK&quot; -
    * Achievement is unlocked.  - &quot;INCREMENT&quot; - Achievement is
    * incremented.  - &quot;SET_STEPS_AT_LEAST&quot; - Achievement progress is
    * set to at least the passed value.
    */
  var updateType: js.UndefOr[String] = js.native
}
object SchemaAchievementUpdateRequest {
  
  @scala.inline
  def apply(): SchemaAchievementUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateRequest]
  }
  
  @scala.inline
  implicit class SchemaAchievementUpdateRequestMutableBuilder[Self <: SchemaAchievementUpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    @scala.inline
    def setIncrementPayload(value: SchemaGamesAchievementIncrement): Self = StObject.set(x, "incrementPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementPayloadUndefined: Self = StObject.set(x, "incrementPayload", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSetStepsAtLeastPayload(value: SchemaGamesAchievementSetStepsAtLeast): Self = StObject.set(x, "setStepsAtLeastPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetStepsAtLeastPayloadUndefined: Self = StObject.set(x, "setStepsAtLeastPayload", js.undefined)
    
    @scala.inline
    def setUpdateType(value: String): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTypeUndefined: Self = StObject.set(x, "updateType", js.undefined)
  }
}
