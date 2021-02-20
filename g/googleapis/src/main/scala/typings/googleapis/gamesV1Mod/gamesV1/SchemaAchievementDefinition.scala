package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement definition object.
  */
@js.native
trait SchemaAchievementDefinition extends StObject {
  
  /**
    * The type of the achievement. Possible values are:   -
    * &quot;STANDARD&quot; - Achievement is either locked or unlocked.  -
    * &quot;INCREMENTAL&quot; - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.native
  
  /**
    * The description of the achievement.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Experience points which will be earned when unlocking this achievement.
    */
  var experiencePoints: js.UndefOr[String] = js.native
  
  /**
    * The total steps for an incremental achievement as a string.
    */
  var formattedTotalSteps: js.UndefOr[String] = js.native
  
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
    * Indicates whether the revealed icon image being returned is a default
    * image, or is provided by the game.
    */
  var isRevealedIconUrlDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the unlocked icon image being returned is a default
    * image, or is game-provided.
    */
  var isUnlockedIconUrlDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementDefinition.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the achievement.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The image URL for the revealed achievement icon.
    */
  var revealedIconUrl: js.UndefOr[String] = js.native
  
  /**
    * The total steps for an incremental achievement.
    */
  var totalSteps: js.UndefOr[Double] = js.native
  
  /**
    * The image URL for the unlocked achievement icon.
    */
  var unlockedIconUrl: js.UndefOr[String] = js.native
}
object SchemaAchievementDefinition {
  
  @scala.inline
  def apply(): SchemaAchievementDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementDefinition]
  }
  
  @scala.inline
  implicit class SchemaAchievementDefinitionMutableBuilder[Self <: SchemaAchievementDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementType(value: String): Self = StObject.set(x, "achievementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementTypeUndefined: Self = StObject.set(x, "achievementType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExperiencePoints(value: String): Self = StObject.set(x, "experiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperiencePointsUndefined: Self = StObject.set(x, "experiencePoints", js.undefined)
    
    @scala.inline
    def setFormattedTotalSteps(value: String): Self = StObject.set(x, "formattedTotalSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTotalStepsUndefined: Self = StObject.set(x, "formattedTotalSteps", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setIsRevealedIconUrlDefault(value: Boolean): Self = StObject.set(x, "isRevealedIconUrlDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRevealedIconUrlDefaultUndefined: Self = StObject.set(x, "isRevealedIconUrlDefault", js.undefined)
    
    @scala.inline
    def setIsUnlockedIconUrlDefault(value: Boolean): Self = StObject.set(x, "isUnlockedIconUrlDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUnlockedIconUrlDefaultUndefined: Self = StObject.set(x, "isUnlockedIconUrlDefault", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRevealedIconUrl(value: String): Self = StObject.set(x, "revealedIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevealedIconUrlUndefined: Self = StObject.set(x, "revealedIconUrl", js.undefined)
    
    @scala.inline
    def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalStepsUndefined: Self = StObject.set(x, "totalSteps", js.undefined)
    
    @scala.inline
    def setUnlockedIconUrl(value: String): Self = StObject.set(x, "unlockedIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockedIconUrlUndefined: Self = StObject.set(x, "unlockedIconUrl", js.undefined)
  }
}
