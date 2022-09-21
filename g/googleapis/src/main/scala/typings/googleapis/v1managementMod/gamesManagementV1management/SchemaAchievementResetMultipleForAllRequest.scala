package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementResetMultipleForAllRequest extends StObject {
  
  /**
    * The IDs of achievements to reset.
    */
  var achievement_ids: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#achievementResetMultipleForAllRequest`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAchievementResetMultipleForAllRequest {
  
  inline def apply(): SchemaAchievementResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetMultipleForAllRequest]
  }
  
  extension [Self <: SchemaAchievementResetMultipleForAllRequest](x: Self) {
    
    inline def setAchievement_ids(value: js.Array[String]): Self = StObject.set(x, "achievement_ids", value.asInstanceOf[js.Any])
    
    inline def setAchievement_idsNull: Self = StObject.set(x, "achievement_ids", null)
    
    inline def setAchievement_idsUndefined: Self = StObject.set(x, "achievement_ids", js.undefined)
    
    inline def setAchievement_idsVarargs(value: String*): Self = StObject.set(x, "achievement_ids", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
