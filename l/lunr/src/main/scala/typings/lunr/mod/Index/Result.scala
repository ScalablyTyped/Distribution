package typings.lunr.mod.Index

import typings.lunr.mod.MatchData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A result contains details of a document matching a search query.
  */
@js.native
trait Result extends js.Object {
  /**
    * Contains metadata about this match including which term(s) caused the match.
    */
  var matchData: MatchData = js.native
  /**
    * The reference of the document this result represents.
    */
  var ref: String = js.native
  /**
    * A number between 0 and 1 representing how similar this document is to the query.
    */
  var score: Double = js.native
}

object Result {
  @scala.inline
  def apply(matchData: MatchData, ref: String, score: Double): Result = {
    val __obj = js.Dynamic.literal(matchData = matchData.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setMatchData(value: MatchData): Self = this.set("matchData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
  
}

