package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a ListScores response.
  */
trait SchemaLeaderboardScores extends StObject {
  
  /**
    * The scores in the leaderboard.
    */
  var items: js.UndefOr[js.Array[SchemaLeaderboardEntry]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboardScores.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of scores in the leaderboard.
    */
  var numScores: js.UndefOr[String] = js.undefined
  
  /**
    * The score of the requesting player on the leaderboard. The player&#39;s
    * score may appear both here and in the list of scores above. If you are
    * viewing a public leaderboard and the player is not sharing their gameplay
    * information publicly, the scoreRank and formattedScoreRank values will
    * not be present.
    */
  var playerScore: js.UndefOr[SchemaLeaderboardEntry] = js.undefined
  
  /**
    * The pagination token for the previous page of results.
    */
  var prevPageToken: js.UndefOr[String] = js.undefined
}
object SchemaLeaderboardScores {
  
  @scala.inline
  def apply(): SchemaLeaderboardScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardScores]
  }
  
  @scala.inline
  implicit class SchemaLeaderboardScoresMutableBuilder[Self <: SchemaLeaderboardScores] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaLeaderboardEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaLeaderboardEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNumScores(value: String): Self = StObject.set(x, "numScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumScoresUndefined: Self = StObject.set(x, "numScores", js.undefined)
    
    @scala.inline
    def setPlayerScore(value: SchemaLeaderboardEntry): Self = StObject.set(x, "playerScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerScoreUndefined: Self = StObject.set(x, "playerScore", js.undefined)
    
    @scala.inline
    def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
  }
}
