package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of reset leaderboard entry resources.
  */
trait SchemaPlayerScoreResetResponse extends StObject {
  
  /**
    * The ID of an leaderboard for which player state has been updated.
    */
  var definitionId: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#playerScoreResetResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The time spans of the updated score. Possible values are:   -
    * &quot;ALL_TIME&quot; - The score is an all-time score.  -
    * &quot;WEEKLY&quot; - The score is a weekly score.  - &quot;DAILY&quot; -
    * The score is a daily score.
    */
  var resetScoreTimeSpans: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPlayerScoreResetResponse {
  
  @scala.inline
  def apply(): SchemaPlayerScoreResetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreResetResponse]
  }
  
  @scala.inline
  implicit class SchemaPlayerScoreResetResponseMutableBuilder[Self <: SchemaPlayerScoreResetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResetScoreTimeSpans(value: js.Array[String]): Self = StObject.set(x, "resetScoreTimeSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetScoreTimeSpansUndefined: Self = StObject.set(x, "resetScoreTimeSpans", js.undefined)
    
    @scala.inline
    def setResetScoreTimeSpansVarargs(value: String*): Self = StObject.set(x, "resetScoreTimeSpans", js.Array(value :_*))
  }
}
