package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerScoreResetResponse extends StObject {
  
  /**
    * The ID of an leaderboard for which player state has been updated.
    */
  var definitionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#playerScoreResetResponse`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time spans of the updated score. Possible values are: - "`ALL_TIME`" - The score is an all-time score. - "`WEEKLY`" - The score is a weekly score. - "`DAILY`" - The score is a daily score.
    */
  var resetScoreTimeSpans: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPlayerScoreResetResponse {
  
  inline def apply(): SchemaPlayerScoreResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreResetResponse]
  }
  
  extension [Self <: SchemaPlayerScoreResetResponse](x: Self) {
    
    inline def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdNull: Self = StObject.set(x, "definitionId", null)
    
    inline def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResetScoreTimeSpans(value: js.Array[String]): Self = StObject.set(x, "resetScoreTimeSpans", value.asInstanceOf[js.Any])
    
    inline def setResetScoreTimeSpansNull: Self = StObject.set(x, "resetScoreTimeSpans", null)
    
    inline def setResetScoreTimeSpansUndefined: Self = StObject.set(x, "resetScoreTimeSpans", js.undefined)
    
    inline def setResetScoreTimeSpansVarargs(value: String*): Self = StObject.set(x, "resetScoreTimeSpans", js.Array(value*))
  }
}
