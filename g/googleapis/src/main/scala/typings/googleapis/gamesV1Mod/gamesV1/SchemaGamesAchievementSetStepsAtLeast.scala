package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the payload to request to increment an
  * achievement.
  */
@js.native
trait SchemaGamesAchievementSetStepsAtLeast extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#GamesAchievementSetStepsAtLeast.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The minimum number of steps for the achievement to be set to.
    */
  var steps: js.UndefOr[Double] = js.native
}
object SchemaGamesAchievementSetStepsAtLeast {
  
  @scala.inline
  def apply(): SchemaGamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesAchievementSetStepsAtLeast]
  }
  
  @scala.inline
  implicit class SchemaGamesAchievementSetStepsAtLeastMutableBuilder[Self <: SchemaGamesAchievementSetStepsAtLeast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
