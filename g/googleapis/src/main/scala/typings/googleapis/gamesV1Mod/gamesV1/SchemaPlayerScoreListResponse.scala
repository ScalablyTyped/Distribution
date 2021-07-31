package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of score submission statuses.
  */
trait SchemaPlayerScoreListResponse extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The score submissions statuses.
    */
  var submittedScores: js.UndefOr[js.Array[SchemaPlayerScoreResponse]] = js.undefined
}
object SchemaPlayerScoreListResponse {
  
  @scala.inline
  def apply(): SchemaPlayerScoreListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlayerScoreListResponseMutableBuilder[Self <: SchemaPlayerScoreListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSubmittedScores(value: js.Array[SchemaPlayerScoreResponse]): Self = StObject.set(x, "submittedScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedScoresUndefined: Self = StObject.set(x, "submittedScores", js.undefined)
    
    @scala.inline
    def setSubmittedScoresVarargs(value: SchemaPlayerScoreResponse*): Self = StObject.set(x, "submittedScores", js.Array(value :_*))
  }
}
