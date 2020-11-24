package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaPlayerLeaderboardScoreListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLeaderboardScoreListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlayerLeaderboardScoreListResponseOps[Self <: SchemaPlayerLeaderboardScoreListResponse] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: SchemaPlayerLeaderboardScore*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaPlayerLeaderboardScore]): Self = this.set("items", value.asInstanceOf[js.Any])
    
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
    def setPlayer(value: SchemaPlayer): Self = this.set("player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
  }
}
