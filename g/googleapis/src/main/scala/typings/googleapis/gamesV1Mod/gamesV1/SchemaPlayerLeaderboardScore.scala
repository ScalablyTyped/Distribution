package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerLeaderboardScore extends StObject {
  
  /**
    * The rank of the score in the friends collection for this leaderboard.
    */
  var friendsRank: js.UndefOr[SchemaLeaderboardScoreRank] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#playerLeaderboardScore`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the leaderboard this score is in.
    */
  var leaderboard_id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The public rank of the score in this leaderboard. This object will not be present if the user is not sharing their scores publicly.
    */
  var publicRank: js.UndefOr[SchemaLeaderboardScoreRank] = js.undefined
  
  /**
    * The formatted value of this score.
    */
  var scoreString: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The numerical value of this score.
    */
  var scoreValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The social rank of the score in this leaderboard.
    */
  var socialRank: js.UndefOr[SchemaLeaderboardScoreRank] = js.undefined
  
  /**
    * The time span of this score.
    */
  var timeSpan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp at which this score was recorded, in milliseconds since the epoch in UTC.
    */
  var writeTimestamp: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlayerLeaderboardScore {
  
  inline def apply(): SchemaPlayerLeaderboardScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLeaderboardScore]
  }
  
  extension [Self <: SchemaPlayerLeaderboardScore](x: Self) {
    
    inline def setFriendsRank(value: SchemaLeaderboardScoreRank): Self = StObject.set(x, "friendsRank", value.asInstanceOf[js.Any])
    
    inline def setFriendsRankUndefined: Self = StObject.set(x, "friendsRank", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLeaderboard_id(value: String): Self = StObject.set(x, "leaderboard_id", value.asInstanceOf[js.Any])
    
    inline def setLeaderboard_idNull: Self = StObject.set(x, "leaderboard_id", null)
    
    inline def setLeaderboard_idUndefined: Self = StObject.set(x, "leaderboard_id", js.undefined)
    
    inline def setPublicRank(value: SchemaLeaderboardScoreRank): Self = StObject.set(x, "publicRank", value.asInstanceOf[js.Any])
    
    inline def setPublicRankUndefined: Self = StObject.set(x, "publicRank", js.undefined)
    
    inline def setScoreString(value: String): Self = StObject.set(x, "scoreString", value.asInstanceOf[js.Any])
    
    inline def setScoreStringNull: Self = StObject.set(x, "scoreString", null)
    
    inline def setScoreStringUndefined: Self = StObject.set(x, "scoreString", js.undefined)
    
    inline def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    inline def setScoreTagNull: Self = StObject.set(x, "scoreTag", null)
    
    inline def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    inline def setScoreValue(value: String): Self = StObject.set(x, "scoreValue", value.asInstanceOf[js.Any])
    
    inline def setScoreValueNull: Self = StObject.set(x, "scoreValue", null)
    
    inline def setScoreValueUndefined: Self = StObject.set(x, "scoreValue", js.undefined)
    
    inline def setSocialRank(value: SchemaLeaderboardScoreRank): Self = StObject.set(x, "socialRank", value.asInstanceOf[js.Any])
    
    inline def setSocialRankUndefined: Self = StObject.set(x, "socialRank", js.undefined)
    
    inline def setTimeSpan(value: String): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanNull: Self = StObject.set(x, "timeSpan", null)
    
    inline def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
    
    inline def setWriteTimestamp(value: String): Self = StObject.set(x, "writeTimestamp", value.asInstanceOf[js.Any])
    
    inline def setWriteTimestampNull: Self = StObject.set(x, "writeTimestamp", null)
    
    inline def setWriteTimestampUndefined: Self = StObject.set(x, "writeTimestamp", js.undefined)
  }
}
