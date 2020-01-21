package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of reset leaderboard entry resources.
  */
@js.native
trait SchemaPlayerScoreResetResponse extends js.Object {
  /**
    * The ID of an leaderboard for which player state has been updated.
    */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#playerScoreResetResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time spans of the updated score. Possible values are:   -
    * &quot;ALL_TIME&quot; - The score is an all-time score.  -
    * &quot;WEEKLY&quot; - The score is a weekly score.  - &quot;DAILY&quot; -
    * The score is a daily score.
    */
  var resetScoreTimeSpans: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPlayerScoreResetResponse {
  @scala.inline
  def apply(definitionId: String = null, kind: String = null, resetScoreTimeSpans: js.Array[String] = null): SchemaPlayerScoreResetResponse = {
    val __obj = js.Dynamic.literal()
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resetScoreTimeSpans != null) __obj.updateDynamic("resetScoreTimeSpans")(resetScoreTimeSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerScoreResetResponse]
  }
}

