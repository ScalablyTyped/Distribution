package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementUpdateMultipleResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementUpdateMultipleResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The updated state of the achievements.
    */
  var updatedAchievements: js.UndefOr[js.Array[SchemaAchievementUpdateResponse]] = js.undefined
}
object SchemaAchievementUpdateMultipleResponse {
  
  inline def apply(): SchemaAchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleResponse]
  }
  
  extension [Self <: SchemaAchievementUpdateMultipleResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdatedAchievements(value: js.Array[SchemaAchievementUpdateResponse]): Self = StObject.set(x, "updatedAchievements", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAchievementsUndefined: Self = StObject.set(x, "updatedAchievements", js.undefined)
    
    inline def setUpdatedAchievementsVarargs(value: SchemaAchievementUpdateResponse*): Self = StObject.set(x, "updatedAchievements", js.Array(value*))
  }
}
