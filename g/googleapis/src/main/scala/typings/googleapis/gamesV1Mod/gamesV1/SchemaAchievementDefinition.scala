package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementDefinition extends StObject {
  
  /**
    * The type of the achievement.
    */
  var achievementType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of the achievement.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Experience points which will be earned when unlocking this achievement.
    */
  var experiencePoints: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total steps for an incremental achievement as a string.
    */
  var formattedTotalSteps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The initial state of the achievement.
    */
  var initialState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether the revealed icon image being returned is a default image, or is provided by the game.
    */
  var isRevealedIconUrlDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the unlocked icon image being returned is a default image, or is game-provided.
    */
  var isUnlockedIconUrlDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementDefinition`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the achievement.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image URL for the revealed achievement icon.
    */
  var revealedIconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total steps for an incremental achievement.
    */
  var totalSteps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The image URL for the unlocked achievement icon.
    */
  var unlockedIconUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaAchievementDefinition {
  
  inline def apply(): SchemaAchievementDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementDefinition]
  }
  
  extension [Self <: SchemaAchievementDefinition](x: Self) {
    
    inline def setAchievementType(value: String): Self = StObject.set(x, "achievementType", value.asInstanceOf[js.Any])
    
    inline def setAchievementTypeNull: Self = StObject.set(x, "achievementType", null)
    
    inline def setAchievementTypeUndefined: Self = StObject.set(x, "achievementType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperiencePoints(value: String): Self = StObject.set(x, "experiencePoints", value.asInstanceOf[js.Any])
    
    inline def setExperiencePointsNull: Self = StObject.set(x, "experiencePoints", null)
    
    inline def setExperiencePointsUndefined: Self = StObject.set(x, "experiencePoints", js.undefined)
    
    inline def setFormattedTotalSteps(value: String): Self = StObject.set(x, "formattedTotalSteps", value.asInstanceOf[js.Any])
    
    inline def setFormattedTotalStepsNull: Self = StObject.set(x, "formattedTotalSteps", null)
    
    inline def setFormattedTotalStepsUndefined: Self = StObject.set(x, "formattedTotalSteps", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateNull: Self = StObject.set(x, "initialState", null)
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setIsRevealedIconUrlDefault(value: Boolean): Self = StObject.set(x, "isRevealedIconUrlDefault", value.asInstanceOf[js.Any])
    
    inline def setIsRevealedIconUrlDefaultNull: Self = StObject.set(x, "isRevealedIconUrlDefault", null)
    
    inline def setIsRevealedIconUrlDefaultUndefined: Self = StObject.set(x, "isRevealedIconUrlDefault", js.undefined)
    
    inline def setIsUnlockedIconUrlDefault(value: Boolean): Self = StObject.set(x, "isUnlockedIconUrlDefault", value.asInstanceOf[js.Any])
    
    inline def setIsUnlockedIconUrlDefaultNull: Self = StObject.set(x, "isUnlockedIconUrlDefault", null)
    
    inline def setIsUnlockedIconUrlDefaultUndefined: Self = StObject.set(x, "isUnlockedIconUrlDefault", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevealedIconUrl(value: String): Self = StObject.set(x, "revealedIconUrl", value.asInstanceOf[js.Any])
    
    inline def setRevealedIconUrlNull: Self = StObject.set(x, "revealedIconUrl", null)
    
    inline def setRevealedIconUrlUndefined: Self = StObject.set(x, "revealedIconUrl", js.undefined)
    
    inline def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsNull: Self = StObject.set(x, "totalSteps", null)
    
    inline def setTotalStepsUndefined: Self = StObject.set(x, "totalSteps", js.undefined)
    
    inline def setUnlockedIconUrl(value: String): Self = StObject.set(x, "unlockedIconUrl", value.asInstanceOf[js.Any])
    
    inline def setUnlockedIconUrlNull: Self = StObject.set(x, "unlockedIconUrl", null)
    
    inline def setUnlockedIconUrlUndefined: Self = StObject.set(x, "unlockedIconUrl", js.undefined)
  }
}
