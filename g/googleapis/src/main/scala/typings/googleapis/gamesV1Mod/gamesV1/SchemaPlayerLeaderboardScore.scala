package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a player leaderboard score object.
  */
@js.native
trait SchemaPlayerLeaderboardScore extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLeaderboardScore.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the leaderboard this score is in.
    */
  var leaderboard_id: js.UndefOr[String] = js.native
  /**
    * The public rank of the score in this leaderboard. This object will not be
    * present if the user is not sharing their scores publicly.
    */
  var publicRank: js.UndefOr[SchemaLeaderboardScoreRank] = js.native
  /**
    * The formatted value of this score.
    */
  var scoreString: js.UndefOr[String] = js.native
  /**
    * Additional information about the score. Values must contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
  /**
    * The numerical value of this score.
    */
  var scoreValue: js.UndefOr[String] = js.native
  /**
    * The social rank of the score in this leaderboard.
    */
  var socialRank: js.UndefOr[SchemaLeaderboardScoreRank] = js.native
  /**
    * The time span of this score. Possible values are:   -
    * &quot;ALL_TIME&quot; - The score is an all-time score.  -
    * &quot;WEEKLY&quot; - The score is a weekly score.  - &quot;DAILY&quot; -
    * The score is a daily score.
    */
  var timeSpan: js.UndefOr[String] = js.native
  /**
    * The timestamp at which this score was recorded, in milliseconds since the
    * epoch in UTC.
    */
  var writeTimestamp: js.UndefOr[String] = js.native
}

object SchemaPlayerLeaderboardScore {
  @scala.inline
  def apply(
    kind: String = null,
    leaderboard_id: String = null,
    publicRank: SchemaLeaderboardScoreRank = null,
    scoreString: String = null,
    scoreTag: String = null,
    scoreValue: String = null,
    socialRank: SchemaLeaderboardScoreRank = null,
    timeSpan: String = null,
    writeTimestamp: String = null
  ): SchemaPlayerLeaderboardScore = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leaderboard_id != null) __obj.updateDynamic("leaderboard_id")(leaderboard_id.asInstanceOf[js.Any])
    if (publicRank != null) __obj.updateDynamic("publicRank")(publicRank.asInstanceOf[js.Any])
    if (scoreString != null) __obj.updateDynamic("scoreString")(scoreString.asInstanceOf[js.Any])
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag.asInstanceOf[js.Any])
    if (scoreValue != null) __obj.updateDynamic("scoreValue")(scoreValue.asInstanceOf[js.Any])
    if (socialRank != null) __obj.updateDynamic("socialRank")(socialRank.asInstanceOf[js.Any])
    if (timeSpan != null) __obj.updateDynamic("timeSpan")(timeSpan.asInstanceOf[js.Any])
    if (writeTimestamp != null) __obj.updateDynamic("writeTimestamp")(writeTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerLeaderboardScore]
  }
}

