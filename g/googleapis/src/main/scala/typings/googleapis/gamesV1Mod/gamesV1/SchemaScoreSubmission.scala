package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a request to submit a score to leaderboards.
  */
@js.native
trait SchemaScoreSubmission extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#scoreSubmission.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The leaderboard this score is being submitted to.
    */
  var leaderboardId: js.UndefOr[String] = js.native
  
  /**
    * The new score being submitted.
    */
  var score: js.UndefOr[String] = js.native
  
  /**
    * Additional information about this score. Values will contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
  
  /**
    * Signature Values will contain URI-safe characters as defined by
    * section 2.3 of RFC 3986.
    */
  var signature: js.UndefOr[String] = js.native
}
object SchemaScoreSubmission {
  
  @scala.inline
  def apply(): SchemaScoreSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScoreSubmission]
  }
  
  @scala.inline
  implicit class SchemaScoreSubmissionOps[Self <: SchemaScoreSubmission] (val x: Self) extends AnyVal {
    
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
    def setLeaderboardId(value: String): Self = this.set("leaderboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderboardId: Self = this.set("leaderboardId", js.undefined)
    
    @scala.inline
    def setScore(value: String): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setScoreTag(value: String): Self = this.set("scoreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoreTag: Self = this.set("scoreTag", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
