package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of score submission requests
  */
@js.native
trait SchemaPlayerScoreSubmissionList extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreSubmissionList.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The score submissions.
    */
  var scores: js.UndefOr[js.Array[SchemaScoreSubmission]] = js.native
}
object SchemaPlayerScoreSubmissionList {
  
  @scala.inline
  def apply(): SchemaPlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreSubmissionList]
  }
  
  @scala.inline
  implicit class SchemaPlayerScoreSubmissionListOps[Self <: SchemaPlayerScoreSubmissionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setScoresVarargs(value: SchemaScoreSubmission*): Self = this.set("scores", js.Array(value :_*))
    
    @scala.inline
    def setScores(value: js.Array[SchemaScoreSubmission]): Self = this.set("scores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScores: Self = this.set("scores", js.undefined)
  }
}
