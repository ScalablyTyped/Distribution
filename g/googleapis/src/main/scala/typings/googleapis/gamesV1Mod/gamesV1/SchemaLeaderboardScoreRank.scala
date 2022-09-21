package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLeaderboardScoreRank extends StObject {
  
  /**
    * The number of scores in the leaderboard as a string.
    */
  var formattedNumScores: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rank in the leaderboard as a string.
    */
  var formattedRank: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#leaderboardScoreRank`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of scores in the leaderboard.
    */
  var numScores: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rank in the leaderboard.
    */
  var rank: js.UndefOr[String | Null] = js.undefined
}
object SchemaLeaderboardScoreRank {
  
  inline def apply(): SchemaLeaderboardScoreRank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardScoreRank]
  }
  
  extension [Self <: SchemaLeaderboardScoreRank](x: Self) {
    
    inline def setFormattedNumScores(value: String): Self = StObject.set(x, "formattedNumScores", value.asInstanceOf[js.Any])
    
    inline def setFormattedNumScoresNull: Self = StObject.set(x, "formattedNumScores", null)
    
    inline def setFormattedNumScoresUndefined: Self = StObject.set(x, "formattedNumScores", js.undefined)
    
    inline def setFormattedRank(value: String): Self = StObject.set(x, "formattedRank", value.asInstanceOf[js.Any])
    
    inline def setFormattedRankNull: Self = StObject.set(x, "formattedRank", null)
    
    inline def setFormattedRankUndefined: Self = StObject.set(x, "formattedRank", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNumScores(value: String): Self = StObject.set(x, "numScores", value.asInstanceOf[js.Any])
    
    inline def setNumScoresNull: Self = StObject.set(x, "numScores", null)
    
    inline def setNumScoresUndefined: Self = StObject.set(x, "numScores", js.undefined)
    
    inline def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankNull: Self = StObject.set(x, "rank", null)
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
}
