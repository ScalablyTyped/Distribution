package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for multiple scores reset all request.
  */
@js.native
trait SchemaScoresResetMultipleForAllRequest extends js.Object {
  
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
  implicit class SchemaScoresResetMultipleForAllRequestOps[Self <: SchemaScoresResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLeaderboard_idsVarargs(value: String*): Self = this.set("leaderboard_ids", js.Array(value :_*))
    
    @scala.inline
    def setLeaderboard_ids(value: js.Array[String]): Self = this.set("leaderboard_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderboard_ids: Self = this.set("leaderboard_ids", js.undefined)
  }
}
