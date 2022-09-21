package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerScoreSubmissionList extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#playerScoreSubmissionList`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The score submissions.
    */
  var scores: js.UndefOr[js.Array[SchemaScoreSubmission]] = js.undefined
}
object SchemaPlayerScoreSubmissionList {
  
  inline def apply(): SchemaPlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreSubmissionList]
  }
  
  extension [Self <: SchemaPlayerScoreSubmissionList](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setScores(value: js.Array[SchemaScoreSubmission]): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    inline def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
    
    inline def setScoresVarargs(value: SchemaScoreSubmission*): Self = StObject.set(x, "scores", js.Array(value*))
  }
}
