package typings.ltijs.gradeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrievedGrade extends js.Object {
  var comment: String = js.native
  var id: String = js.native
  var resultMaximum: Double = js.native
  var resultScore: Double = js.native
  var scoreOf: String = js.native
  var userId: String = js.native
}

object RetrievedGrade {
  @scala.inline
  def apply(
    comment: String,
    id: String,
    resultMaximum: Double,
    resultScore: Double,
    scoreOf: String,
    userId: String
  ): RetrievedGrade = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resultMaximum = resultMaximum.asInstanceOf[js.Any], resultScore = resultScore.asInstanceOf[js.Any], scoreOf = scoreOf.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrievedGrade]
  }
  @scala.inline
  implicit class RetrievedGradeOps[Self <: RetrievedGrade] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultMaximum(value: Double): Self = this.set("resultMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultScore(value: Double): Self = this.set("resultScore", value.asInstanceOf[js.Any])
    @scala.inline
    def setScoreOf(value: String): Self = this.set("scoreOf", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

