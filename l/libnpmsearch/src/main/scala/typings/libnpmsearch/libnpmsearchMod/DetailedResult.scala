package typings.libnpmsearch.libnpmsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailedResult extends js.Object {
  var `package`: Result
  var score: Score
  var searchScore: Double
}

object DetailedResult {
  @scala.inline
  def apply(`package`: Result, score: Score, searchScore: Double): DetailedResult = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedResult]
  }
}

