package typings.libnpmsearch.libnpmsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedResult extends js.Object {
  @JSName("package")
  var _package: Result
  var score: Score
  var searchScore: Double
}

object DetailedResult {
  @scala.inline
  def apply(_package: Result, score: Score, searchScore: Double): DetailedResult = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedResult]
  }
}

