package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement configuration resource.
  */
@js.native
trait SchemaAchievementConfiguration extends StObject {
  
  /**
    * The type of the achievement. Possible values are:   -
    * &quot;STANDARD&quot; - Achievement is either locked or unlocked.  -
    * &quot;INCREMENTAL&quot; - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.native
  
  /**
    * The draft data of the achievement.
    */
  var draft: js.UndefOr[SchemaAchievementConfigurationDetail] = js.native
  
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The initial state of the achievement. Possible values are:   -
    * &quot;HIDDEN&quot; - Achievement is hidden.  - &quot;REVEALED&quot; -
    * Achievement is revealed.  - &quot;UNLOCKED&quot; - Achievement is
    * unlocked.
    */
  var initialState: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#achievementConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The read-only published data of the achievement.
    */
  var published: js.UndefOr[SchemaAchievementConfigurationDetail] = js.native
  
  /**
    * Steps to unlock. Only applicable to incremental achievements.
    */
  var stepsToUnlock: js.UndefOr[Double] = js.native
  
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaAchievementConfiguration {
  
  @scala.inline
  def apply(): SchemaAchievementConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementConfiguration]
  }
  
  @scala.inline
  implicit class SchemaAchievementConfigurationMutableBuilder[Self <: SchemaAchievementConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementType(value: String): Self = StObject.set(x, "achievementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementTypeUndefined: Self = StObject.set(x, "achievementType", js.undefined)
    
    @scala.inline
    def setDraft(value: SchemaAchievementConfigurationDetail): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPublished(value: SchemaAchievementConfigurationDetail): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setStepsToUnlock(value: Double): Self = StObject.set(x, "stepsToUnlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsToUnlockUndefined: Self = StObject.set(x, "stepsToUnlock", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
