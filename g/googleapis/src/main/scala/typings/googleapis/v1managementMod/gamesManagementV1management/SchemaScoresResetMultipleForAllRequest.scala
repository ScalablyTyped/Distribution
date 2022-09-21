package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScoresResetMultipleForAllRequest extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#scoresResetMultipleForAllRequest`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IDs of leaderboards to reset.
    */
  var leaderboard_ids: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaScoresResetMultipleForAllRequest {
  
  inline def apply(): SchemaScoresResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScoresResetMultipleForAllRequest]
  }
  
  extension [Self <: SchemaScoresResetMultipleForAllRequest](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLeaderboard_ids(value: js.Array[String]): Self = StObject.set(x, "leaderboard_ids", value.asInstanceOf[js.Any])
    
    inline def setLeaderboard_idsNull: Self = StObject.set(x, "leaderboard_ids", null)
    
    inline def setLeaderboard_idsUndefined: Self = StObject.set(x, "leaderboard_ids", js.undefined)
    
    inline def setLeaderboard_idsVarargs(value: String*): Self = StObject.set(x, "leaderboard_ids", js.Array(value*))
  }
}
