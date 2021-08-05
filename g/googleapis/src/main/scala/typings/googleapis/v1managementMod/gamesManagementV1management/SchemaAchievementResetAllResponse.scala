package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for achievement reset all response.
  */
trait SchemaAchievementResetAllResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetAllResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The achievement reset results.
    */
  var results: js.UndefOr[js.Array[SchemaAchievementResetResponse]] = js.undefined
}
object SchemaAchievementResetAllResponse {
  
  inline def apply(): SchemaAchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementResetAllResponse]
  }
  
  extension [Self <: SchemaAchievementResetAllResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResults(value: js.Array[SchemaAchievementResetResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaAchievementResetResponse*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
