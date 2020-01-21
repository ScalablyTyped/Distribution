package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a request to submit a score to leaderboards.
  */
@js.native
trait SchemaScoreSubmission extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#scoreSubmission.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The leaderboard this score is being submitted to.
    */
  var leaderboardId: js.UndefOr[String] = js.native
  /**
    * The new score being submitted.
    */
  var score: js.UndefOr[String] = js.native
  /**
    * Additional information about this score. Values will contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
  /**
    * Signature Values will contain URI-safe characters as defined by
    * section 2.3 of RFC 3986.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaScoreSubmission {
  @scala.inline
  def apply(
    kind: String = null,
    leaderboardId: String = null,
    score: String = null,
    scoreTag: String = null,
    signature: String = null
  ): SchemaScoreSubmission = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leaderboardId != null) __obj.updateDynamic("leaderboardId")(leaderboardId.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScoreSubmission]
  }
}

