package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementUpdateMultipleRequest extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateMultipleRequest`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The individual achievement update requests.
    */
  var updates: js.UndefOr[js.Array[SchemaAchievementUpdateRequest]] = js.undefined
}
object SchemaAchievementUpdateMultipleRequest {
  
  inline def apply(): SchemaAchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleRequest]
  }
  
  extension [Self <: SchemaAchievementUpdateMultipleRequest](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdates(value: js.Array[SchemaAchievementUpdateRequest]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    inline def setUpdatesVarargs(value: SchemaAchievementUpdateRequest*): Self = StObject.set(x, "updates", js.Array(value*))
  }
}
