package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerScoreResetAllResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#playerScoreResetAllResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The leaderboard reset results.
    */
  var results: js.UndefOr[js.Array[SchemaPlayerScoreResetResponse]] = js.undefined
}
object SchemaPlayerScoreResetAllResponse {
  
  inline def apply(): SchemaPlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreResetAllResponse]
  }
  
  extension [Self <: SchemaPlayerScoreResetAllResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResults(value: js.Array[SchemaPlayerScoreResetResponse]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaPlayerScoreResetResponse*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
