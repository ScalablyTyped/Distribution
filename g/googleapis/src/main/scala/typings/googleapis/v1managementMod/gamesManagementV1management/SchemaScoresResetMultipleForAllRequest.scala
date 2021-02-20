package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for multiple scores reset all request.
  */
@js.native
trait SchemaScoresResetMultipleForAllRequest extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#scoresResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The IDs of leaderboards to reset.
    */
  var leaderboard_ids: js.UndefOr[js.Array[String]] = js.native
}
object SchemaScoresResetMultipleForAllRequest {
  
  @scala.inline
  def apply(): SchemaScoresResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScoresResetMultipleForAllRequest]
  }
  
  @scala.inline
  implicit class SchemaScoresResetMultipleForAllRequestMutableBuilder[Self <: SchemaScoresResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLeaderboard_ids(value: js.Array[String]): Self = StObject.set(x, "leaderboard_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderboard_idsUndefined: Self = StObject.set(x, "leaderboard_ids", js.undefined)
    
    @scala.inline
    def setLeaderboard_idsVarargs(value: String*): Self = StObject.set(x, "leaderboard_ids", js.Array(value :_*))
  }
}
