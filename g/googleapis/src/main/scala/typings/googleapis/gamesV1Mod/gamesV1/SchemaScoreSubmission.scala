package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a request to submit a score to leaderboards.
  */
trait SchemaScoreSubmission extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#scoreSubmission.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The leaderboard this score is being submitted to.
    */
  var leaderboardId: js.UndefOr[String] = js.undefined
  
  /**
    * The new score being submitted.
    */
  var score: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information about this score. Values will contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.undefined
  
  /**
    * Signature Values will contain URI-safe characters as defined by
    * section 2.3 of RFC 3986.
    */
  var signature: js.UndefOr[String] = js.undefined
}
object SchemaScoreSubmission {
  
  inline def apply(): SchemaScoreSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScoreSubmission]
  }
  
  extension [Self <: SchemaScoreSubmission](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    inline def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
    
    inline def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    inline def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
