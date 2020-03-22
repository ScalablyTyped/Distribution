package typings.lunr.mod.Index

import typings.lunr.mod.MatchData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A result contains details of a document matching a search query.
  */
trait Result extends js.Object {
  /**
    * Contains metadata about this match including which term(s) caused the match.
    */
  var matchData: MatchData
  /**
    * The reference of the document this result represents.
    */
  var ref: String
  /**
    * A number between 0 and 1 representing how similar this document is to the query.
    */
  var score: Double
}

object Result {
  @scala.inline
  def apply(matchData: MatchData, ref: String, score: Double): Result = {
    val __obj = js.Dynamic.literal(matchData = matchData.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

