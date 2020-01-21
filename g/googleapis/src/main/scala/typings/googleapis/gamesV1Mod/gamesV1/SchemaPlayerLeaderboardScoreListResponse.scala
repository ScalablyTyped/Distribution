package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of player leaderboard scores.
  */
@js.native
trait SchemaPlayerLeaderboardScoreListResponse extends js.Object {
  /**
    * The leaderboard scores.
    */
  var items: js.UndefOr[js.Array[SchemaPlayerLeaderboardScore]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLeaderboardScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The Player resources for the owner of this score.
    */
  var player: js.UndefOr[SchemaPlayer] = js.native
}

object SchemaPlayerLeaderboardScoreListResponse {
  @scala.inline
  def apply(
    items: js.Array[SchemaPlayerLeaderboardScore] = null,
    kind: String = null,
    nextPageToken: String = null,
    player: SchemaPlayer = null
  ): SchemaPlayerLeaderboardScoreListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerLeaderboardScoreListResponse]
  }
}

