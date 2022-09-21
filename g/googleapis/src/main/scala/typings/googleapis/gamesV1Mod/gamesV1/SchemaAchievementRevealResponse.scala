package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementRevealResponse extends StObject {
  
  /**
    * The current state of the achievement for which a reveal was attempted. This might be `UNLOCKED` if the achievement was already unlocked.
    */
  var currentState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementRevealResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAchievementRevealResponse {
  
  inline def apply(): SchemaAchievementRevealResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementRevealResponse]
  }
  
  extension [Self <: SchemaAchievementRevealResponse](x: Self) {
    
    inline def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateNull: Self = StObject.set(x, "currentState", null)
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
