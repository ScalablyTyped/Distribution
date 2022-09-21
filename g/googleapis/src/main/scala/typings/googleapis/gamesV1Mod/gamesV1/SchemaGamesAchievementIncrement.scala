package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGamesAchievementIncrement extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#GamesAchievementIncrement`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The requestId associated with an increment to an achievement.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of steps to be incremented.
    */
  var steps: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGamesAchievementIncrement {
  
  inline def apply(): SchemaGamesAchievementIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesAchievementIncrement]
  }
  
  extension [Self <: SchemaGamesAchievementIncrement](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsNull: Self = StObject.set(x, "steps", null)
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
