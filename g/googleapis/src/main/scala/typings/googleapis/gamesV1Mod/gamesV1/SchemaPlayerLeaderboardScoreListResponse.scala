package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of player leaderboard scores.
  */
trait SchemaPlayerLeaderboardScoreListResponse extends StObject {
  
  /**
    * The leaderboard scores.
    */
  var items: js.UndefOr[js.Array[SchemaPlayerLeaderboardScore]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLeaderboardScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Player resources for the owner of this score.
    */
  var player: js.UndefOr[SchemaPlayer] = js.undefined
}
object SchemaPlayerLeaderboardScoreListResponse {
  
  @scala.inline
  def apply(): SchemaPlayerLeaderboardScoreListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLeaderboardScoreListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlayerLeaderboardScoreListResponseMutableBuilder[Self <: SchemaPlayerLeaderboardScoreListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaPlayerLeaderboardScore]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaPlayerLeaderboardScore*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPlayer(value: SchemaPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
