package typings.libnpmsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedResult extends js.Object {
  @JSName("package")
  var _package: Result = js.native
  var score: Score = js.native
  var searchScore: Double = js.native
}

object DetailedResult {
  @scala.inline
  def apply(_package: Result, score: Score, searchScore: Double): DetailedResult = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedResult]
  }
  @scala.inline
  implicit class DetailedResultOps[Self <: DetailedResult] (val x: Self) extends AnyVal {
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
    def set_package(value: Result): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Score): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchScore(value: Double): Self = this.set("searchScore", value.asInstanceOf[js.Any])
  }
  
}

