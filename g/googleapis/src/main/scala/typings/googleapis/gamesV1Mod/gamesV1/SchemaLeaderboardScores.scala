package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a ListScores response.
  */
@js.native
trait SchemaLeaderboardScores extends js.Object {
  /**
    * The scores in the leaderboard.
    */
  var items: js.UndefOr[js.Array[SchemaLeaderboardEntry]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboardScores.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of scores in the leaderboard.
    */
  var numScores: js.UndefOr[String] = js.native
  /**
    * The score of the requesting player on the leaderboard. The player&#39;s
    * score may appear both here and in the list of scores above. If you are
    * viewing a public leaderboard and the player is not sharing their gameplay
    * information publicly, the scoreRank and formattedScoreRank values will
    * not be present.
    */
  var playerScore: js.UndefOr[SchemaLeaderboardEntry] = js.native
  /**
    * The pagination token for the previous page of results.
    */
  var prevPageToken: js.UndefOr[String] = js.native
}

object SchemaLeaderboardScores {
  @scala.inline
  def apply(): SchemaLeaderboardScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardScores]
  }
  @scala.inline
  implicit class SchemaLeaderboardScoresOps[Self <: SchemaLeaderboardScores] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaLeaderboardEntry*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaLeaderboardEntry]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setNumScores(value: String): Self = this.set("numScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumScores: Self = this.set("numScores", js.undefined)
    @scala.inline
    def setPlayerScore(value: SchemaLeaderboardEntry): Self = this.set("playerScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerScore: Self = this.set("playerScore", js.undefined)
    @scala.inline
    def setPrevPageToken(value: String): Self = this.set("prevPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPageToken: Self = this.set("prevPageToken", js.undefined)
  }
  
}

