package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGamesAchievementSetStepsAtLeast extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#GamesAchievementSetStepsAtLeast`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum number of steps for the achievement to be set to.
    */
  var steps: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGamesAchievementSetStepsAtLeast {
  
  inline def apply(): SchemaGamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesAchievementSetStepsAtLeast]
  }
  
  extension [Self <: SchemaGamesAchievementSetStepsAtLeast](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsNull: Self = StObject.set(x, "steps", null)
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
