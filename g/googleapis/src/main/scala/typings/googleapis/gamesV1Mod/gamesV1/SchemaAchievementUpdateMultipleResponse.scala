package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement unlock response.
  */
trait SchemaAchievementUpdateMultipleResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateListResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The updated state of the achievements.
    */
  var updatedAchievements: js.UndefOr[js.Array[SchemaAchievementUpdateResponse]] = js.undefined
}
object SchemaAchievementUpdateMultipleResponse {
  
  @scala.inline
  def apply(): SchemaAchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementUpdateMultipleResponseMutableBuilder[Self <: SchemaAchievementUpdateMultipleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdatedAchievements(value: js.Array[SchemaAchievementUpdateResponse]): Self = StObject.set(x, "updatedAchievements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAchievementsUndefined: Self = StObject.set(x, "updatedAchievements", js.undefined)
    
    @scala.inline
    def setUpdatedAchievementsVarargs(value: SchemaAchievementUpdateResponse*): Self = StObject.set(x, "updatedAchievements", js.Array(value :_*))
  }
}
