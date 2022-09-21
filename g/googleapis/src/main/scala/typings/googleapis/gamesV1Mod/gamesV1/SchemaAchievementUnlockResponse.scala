package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementUnlockResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUnlockResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAchievementUnlockResponse {
  
  inline def apply(): SchemaAchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUnlockResponse]
  }
  
  extension [Self <: SchemaAchievementUnlockResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewlyUnlocked(value: Boolean): Self = StObject.set(x, "newlyUnlocked", value.asInstanceOf[js.Any])
    
    inline def setNewlyUnlockedNull: Self = StObject.set(x, "newlyUnlocked", null)
    
    inline def setNewlyUnlockedUndefined: Self = StObject.set(x, "newlyUnlocked", js.undefined)
  }
}
