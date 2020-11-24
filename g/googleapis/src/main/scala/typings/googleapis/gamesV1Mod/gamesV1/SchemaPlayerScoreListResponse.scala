package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of score submission statuses.
  */
@js.native
trait SchemaPlayerScoreListResponse extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The score submissions statuses.
    */
  var submittedScores: js.UndefOr[js.Array[SchemaPlayerScoreResponse]] = js.native
}
object SchemaPlayerScoreListResponse {
  
  @scala.inline
  def apply(): SchemaPlayerScoreListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerScoreListResponse]
  }
  
  @scala.inline
  implicit class SchemaPlayerScoreListResponseOps[Self <: SchemaPlayerScoreListResponse] (val x: Self) extends AnyVal {
    
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
    def setSubmittedScoresVarargs(value: SchemaPlayerScoreResponse*): Self = this.set("submittedScores", js.Array(value :_*))
    
    @scala.inline
    def setSubmittedScores(value: js.Array[SchemaPlayerScoreResponse]): Self = this.set("submittedScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedScores: Self = this.set("submittedScores", js.undefined)
  }
}
