package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for the Leaderboard Entry resource.
  */
trait SchemaLeaderboardEntry extends StObject {
  
  /**
    * The localized string for the numerical value of this score.
    */
  var formattedScore: js.UndefOr[String] = js.undefined
  
  /**
    * The localized string for the rank of this score for this leaderboard.
    */
  var formattedScoreRank: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboardEntry.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The player who holds this score.
    */
  var player: js.UndefOr[SchemaPlayer] = js.undefined
  
  /**
    * The rank of this score for this leaderboard.
    */
  var scoreRank: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information about the score. Values must contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.undefined
  
  /**
    * The numerical value of this score.
    */
  var scoreValue: js.UndefOr[String] = js.undefined
  
  /**
    * The time span of this high score. Possible values are:   -
    * &quot;ALL_TIME&quot; - The score is an all-time high score.  -
    * &quot;WEEKLY&quot; - The score is a weekly high score.  -
    * &quot;DAILY&quot; - The score is a daily high score.
    */
  var timeSpan: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which this score was recorded, in milliseconds since the
    * epoch in UTC.
    */
  var writeTimestampMillis: js.UndefOr[String] = js.undefined
}
object SchemaLeaderboardEntry {
  
  inline def apply(): SchemaLeaderboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardEntry]
  }
  
  extension [Self <: SchemaLeaderboardEntry](x: Self) {
    
    inline def setFormattedScore(value: String): Self = StObject.set(x, "formattedScore", value.asInstanceOf[js.Any])
    
    inline def setFormattedScoreRank(value: String): Self = StObject.set(x, "formattedScoreRank", value.asInstanceOf[js.Any])
    
    inline def setFormattedScoreRankUndefined: Self = StObject.set(x, "formattedScoreRank", js.undefined)
    
    inline def setFormattedScoreUndefined: Self = StObject.set(x, "formattedScore", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlayer(value: SchemaPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    inline def setScoreRank(value: String): Self = StObject.set(x, "scoreRank", value.asInstanceOf[js.Any])
    
    inline def setScoreRankUndefined: Self = StObject.set(x, "scoreRank", js.undefined)
    
    inline def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    inline def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    inline def setScoreValue(value: String): Self = StObject.set(x, "scoreValue", value.asInstanceOf[js.Any])
    
    inline def setScoreValueUndefined: Self = StObject.set(x, "scoreValue", js.undefined)
    
    inline def setTimeSpan(value: String): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
    
    inline def setWriteTimestampMillis(value: String): Self = StObject.set(x, "writeTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setWriteTimestampMillisUndefined: Self = StObject.set(x, "writeTimestampMillis", js.undefined)
  }
}
