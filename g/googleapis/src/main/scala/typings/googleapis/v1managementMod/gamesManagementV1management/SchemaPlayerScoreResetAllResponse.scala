package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of leaderboard reset resources.
  */
@js.native
trait SchemaPlayerScoreResetAllResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#playerScoreResetResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The leaderboard reset results.
    */
  var results: js.UndefOr[js.Array[SchemaPlayerScoreResetResponse]] = js.native
}

object SchemaPlayerScoreResetAllResponse {
  @scala.inline
  def apply(kind: String = null, results: js.Array[SchemaPlayerScoreResetResponse] = null): SchemaPlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerScoreResetAllResponse]
  }
}

