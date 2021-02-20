package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for achievement reset all response.
  */
@js.native
trait SchemaAchievementResetAllResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetAllResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The achievement reset results.
    */
  var results: js.UndefOr[js.Array[SchemaAchievementResetResponse]] = js.native
}
object SchemaAchievementResetAllResponse {
  
  @scala.inline
  def apply(): SchemaAchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetAllResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementResetAllResponseMutableBuilder[Self <: SchemaAchievementResetAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaAchievementResetResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaAchievementResetResponse*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
