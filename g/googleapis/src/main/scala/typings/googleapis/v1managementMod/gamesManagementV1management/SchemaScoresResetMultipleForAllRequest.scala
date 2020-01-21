package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(kind: String = null, leaderboard_ids: js.Array[String] = null): SchemaScoresResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leaderboard_ids != null) __obj.updateDynamic("leaderboard_ids")(leaderboard_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScoresResetMultipleForAllRequest]
  }
}

