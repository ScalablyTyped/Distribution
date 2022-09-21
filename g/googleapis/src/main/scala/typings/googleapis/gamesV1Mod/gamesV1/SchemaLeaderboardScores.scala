package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLeaderboardScores extends StObject {
  
  /**
    * The scores in the leaderboard.
    */
  var items: js.UndefOr[js.Array[SchemaLeaderboardEntry]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#leaderboardScores`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of scores in the leaderboard.
    */
  var numScores: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The score of the requesting player on the leaderboard. The player's score may appear both here and in the list of scores above. If you are viewing a public leaderboard and the player is not sharing their gameplay information publicly, the `scoreRank`and `formattedScoreRank` values will not be present.
    */
  var playerScore: js.UndefOr[SchemaLeaderboardEntry] = js.undefined
  
  /**
    * The pagination token for the previous page of results.
    */
  var prevPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaLeaderboardScores {
  
  inline def apply(): SchemaLeaderboardScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardScores]
  }
  
  extension [Self <: SchemaLeaderboardScores](x: Self) {
    
    inline def setItems(value: js.Array[SchemaLeaderboardEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaLeaderboardEntry*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNumScores(value: String): Self = StObject.set(x, "numScores", value.asInstanceOf[js.Any])
    
    inline def setNumScoresNull: Self = StObject.set(x, "numScores", null)
    
    inline def setNumScoresUndefined: Self = StObject.set(x, "numScores", js.undefined)
    
    inline def setPlayerScore(value: SchemaLeaderboardEntry): Self = StObject.set(x, "playerScore", value.asInstanceOf[js.Any])
    
    inline def setPlayerScoreUndefined: Self = StObject.set(x, "playerScore", js.undefined)
    
    inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
    
    inline def setPrevPageTokenNull: Self = StObject.set(x, "prevPageToken", null)
    
    inline def setPrevPageTokenUndefined: Self = StObject.set(x, "prevPageToken", js.undefined)
  }
}
