package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerScore extends StObject {
  
  /**
    * The formatted score for this player score.
    */
  var formattedScore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScore`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The numerical value for this player score.
    */
  var score: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time span for this player score.
    */
  var timeSpan: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlayerScore {
  
  inline def apply(): SchemaPlayerScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScore]
  }
  
  extension [Self <: SchemaPlayerScore](x: Self) {
    
    inline def setFormattedScore(value: String): Self = StObject.set(x, "formattedScore", value.asInstanceOf[js.Any])
    
    inline def setFormattedScoreNull: Self = StObject.set(x, "formattedScore", null)
    
    inline def setFormattedScoreUndefined: Self = StObject.set(x, "formattedScore", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    inline def setScoreTagNull: Self = StObject.set(x, "scoreTag", null)
    
    inline def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTimeSpan(value: String): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanNull: Self = StObject.set(x, "timeSpan", null)
    
    inline def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
  }
}
