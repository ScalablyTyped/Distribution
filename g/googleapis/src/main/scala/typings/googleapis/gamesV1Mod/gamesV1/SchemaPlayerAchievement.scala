package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerAchievement extends StObject {
  
  /**
    * The state of the achievement.
    */
  var achievementState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current steps for an incremental achievement.
    */
  var currentSteps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Experience points earned for the achievement. This field is absent for achievements that have not yet been unlocked and 0 for achievements that have been unlocked by testers but that are unpublished.
    */
  var experiencePoints: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current steps for an incremental achievement as a string.
    */
  var formattedCurrentStepsString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#playerAchievement`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp of the last modification to this achievement's state.
    */
  var lastUpdatedTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlayerAchievement {
  
  inline def apply(): SchemaPlayerAchievement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerAchievement]
  }
  
  extension [Self <: SchemaPlayerAchievement](x: Self) {
    
    inline def setAchievementState(value: String): Self = StObject.set(x, "achievementState", value.asInstanceOf[js.Any])
    
    inline def setAchievementStateNull: Self = StObject.set(x, "achievementState", null)
    
    inline def setAchievementStateUndefined: Self = StObject.set(x, "achievementState", js.undefined)
    
    inline def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    inline def setCurrentStepsNull: Self = StObject.set(x, "currentSteps", null)
    
    inline def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    inline def setExperiencePoints(value: String): Self = StObject.set(x, "experiencePoints", value.asInstanceOf[js.Any])
    
    inline def setExperiencePointsNull: Self = StObject.set(x, "experiencePoints", null)
    
    inline def setExperiencePointsUndefined: Self = StObject.set(x, "experiencePoints", js.undefined)
    
    inline def setFormattedCurrentStepsString(value: String): Self = StObject.set(x, "formattedCurrentStepsString", value.asInstanceOf[js.Any])
    
    inline def setFormattedCurrentStepsStringNull: Self = StObject.set(x, "formattedCurrentStepsString", null)
    
    inline def setFormattedCurrentStepsStringUndefined: Self = StObject.set(x, "formattedCurrentStepsString", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampNull: Self = StObject.set(x, "lastUpdatedTimestamp", null)
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
  }
}
