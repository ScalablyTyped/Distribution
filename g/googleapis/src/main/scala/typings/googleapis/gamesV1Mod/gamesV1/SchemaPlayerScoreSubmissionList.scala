package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of score submission requests
  */
trait SchemaPlayerScoreSubmissionList extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreSubmissionList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The score submissions.
    */
  var scores: js.UndefOr[js.Array[SchemaScoreSubmission]] = js.undefined
}
object SchemaPlayerScoreSubmissionList {
  
  @scala.inline
  def apply(): SchemaPlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreSubmissionList]
  }
  
  @scala.inline
  implicit class SchemaPlayerScoreSubmissionListMutableBuilder[Self <: SchemaPlayerScoreSubmissionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setScores(value: js.Array[SchemaScoreSubmission]): Self = StObject.set(x, "scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoresUndefined: Self = StObject.set(x, "scores", js.undefined)
    
    @scala.inline
    def setScoresVarargs(value: SchemaScoreSubmission*): Self = StObject.set(x, "scores", js.Array(value :_*))
  }
}
