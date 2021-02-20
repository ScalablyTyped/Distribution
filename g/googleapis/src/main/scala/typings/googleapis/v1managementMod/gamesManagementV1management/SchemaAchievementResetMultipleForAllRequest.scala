package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for multiple achievements reset all request.
  */
@js.native
trait SchemaAchievementResetMultipleForAllRequest extends StObject {
  
  /**
    * The IDs of achievements to reset.
    */
  var achievement_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAchievementResetMultipleForAllRequest {
  
  @scala.inline
  def apply(): SchemaAchievementResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetMultipleForAllRequest]
  }
  
  @scala.inline
  implicit class SchemaAchievementResetMultipleForAllRequestMutableBuilder[Self <: SchemaAchievementResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievement_ids(value: js.Array[String]): Self = StObject.set(x, "achievement_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievement_idsUndefined: Self = StObject.set(x, "achievement_ids", js.undefined)
    
    @scala.inline
    def setAchievement_idsVarargs(value: String*): Self = StObject.set(x, "achievement_ids", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
