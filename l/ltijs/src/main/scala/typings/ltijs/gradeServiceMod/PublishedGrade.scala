package typings.ltijs.gradeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishedGrade extends js.Object {
  var activityProgress: String = js.native
  var comment: js.UndefOr[String] = js.native
  var gradingProgress: String = js.native
  var scoreGiven: Double = js.native
}

object PublishedGrade {
  @scala.inline
  def apply(activityProgress: String, gradingProgress: String, scoreGiven: Double): PublishedGrade = {
    val __obj = js.Dynamic.literal(activityProgress = activityProgress.asInstanceOf[js.Any], gradingProgress = gradingProgress.asInstanceOf[js.Any], scoreGiven = scoreGiven.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedGrade]
  }
  @scala.inline
  implicit class PublishedGradeOps[Self <: PublishedGrade] (val x: Self) extends AnyVal {
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
    def setActivityProgress(value: String): Self = this.set("activityProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradingProgress(value: String): Self = this.set("gradingProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setScoreGiven(value: Double): Self = this.set("scoreGiven", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
  }
  
}

