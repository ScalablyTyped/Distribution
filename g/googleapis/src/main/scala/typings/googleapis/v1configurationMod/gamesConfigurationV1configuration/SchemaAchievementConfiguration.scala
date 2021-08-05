package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement configuration resource.
  */
trait SchemaAchievementConfiguration extends StObject {
  
  /**
    * The type of the achievement. Possible values are:   -
    * &quot;STANDARD&quot; - Achievement is either locked or unlocked.  -
    * &quot;INCREMENTAL&quot; - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.undefined
  
  /**
    * The draft data of the achievement.
    */
  var draft: js.UndefOr[SchemaAchievementConfigurationDetail] = js.undefined
  
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The initial state of the achievement. Possible values are:   -
    * &quot;HIDDEN&quot; - Achievement is hidden.  - &quot;REVEALED&quot; -
    * Achievement is revealed.  - &quot;UNLOCKED&quot; - Achievement is
    * unlocked.
    */
  var initialState: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#achievementConfiguration.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The read-only published data of the achievement.
    */
  var published: js.UndefOr[SchemaAchievementConfigurationDetail] = js.undefined
  
  /**
    * Steps to unlock. Only applicable to incremental achievements.
    */
  var stepsToUnlock: js.UndefOr[Double] = js.undefined
  
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String] = js.undefined
}
object SchemaAchievementConfiguration {
  
  inline def apply(): SchemaAchievementConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementConfiguration]
  }
  
  extension [Self <: SchemaAchievementConfiguration](x: Self) {
    
    inline def setAchievementType(value: String): Self = StObject.set(x, "achievementType", value.asInstanceOf[js.Any])
    
    inline def setAchievementTypeUndefined: Self = StObject.set(x, "achievementType", js.undefined)
    
    inline def setDraft(value: SchemaAchievementConfigurationDetail): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPublished(value: SchemaAchievementConfigurationDetail): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setStepsToUnlock(value: Double): Self = StObject.set(x, "stepsToUnlock", value.asInstanceOf[js.Any])
    
    inline def setStepsToUnlockUndefined: Self = StObject.set(x, "stepsToUnlock", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
