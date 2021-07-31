package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement object.
  */
trait SchemaPlayerAchievement extends StObject {
  
  /**
    * The state of the achievement. Possible values are:   - &quot;HIDDEN&quot;
    * - Achievement is hidden.  - &quot;REVEALED&quot; - Achievement is
    * revealed.  - &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var achievementState: js.UndefOr[String] = js.undefined
  
  /**
    * The current steps for an incremental achievement.
    */
  var currentSteps: js.UndefOr[Double] = js.undefined
  
  /**
    * Experience points earned for the achievement. This field is absent for
    * achievements that have not yet been unlocked and 0 for achievements that
    * have been unlocked by testers but that are unpublished.
    */
  var experiencePoints: js.UndefOr[String] = js.undefined
  
  /**
    * The current steps for an incremental achievement as a string.
    */
  var formattedCurrentStepsString: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerAchievement.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the last modification to this achievement&#39;s state.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
}
object SchemaPlayerAchievement {
  
  @scala.inline
  def apply(): SchemaPlayerAchievement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerAchievement]
  }
  
  @scala.inline
  implicit class SchemaPlayerAchievementMutableBuilder[Self <: SchemaPlayerAchievement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementState(value: String): Self = StObject.set(x, "achievementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementStateUndefined: Self = StObject.set(x, "achievementState", js.undefined)
    
    @scala.inline
    def setCurrentSteps(value: Double): Self = StObject.set(x, "currentSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStepsUndefined: Self = StObject.set(x, "currentSteps", js.undefined)
    
    @scala.inline
    def setExperiencePoints(value: String): Self = StObject.set(x, "experiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperiencePointsUndefined: Self = StObject.set(x, "experiencePoints", js.undefined)
    
    @scala.inline
    def setFormattedCurrentStepsString(value: String): Self = StObject.set(x, "formattedCurrentStepsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedCurrentStepsStringUndefined: Self = StObject.set(x, "formattedCurrentStepsString", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
  }
}
