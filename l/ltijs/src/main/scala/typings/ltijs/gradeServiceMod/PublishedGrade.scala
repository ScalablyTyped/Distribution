package typings.ltijs.gradeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishedGrade extends js.Object {
  var activityProgress: String
  var comment: js.UndefOr[String] = js.undefined
  var gradingProgress: String
  var scoreGiven: Double
}

object PublishedGrade {
  @scala.inline
  def apply(activityProgress: String, gradingProgress: String, scoreGiven: Double, comment: String = null): PublishedGrade = {
    val __obj = js.Dynamic.literal(activityProgress = activityProgress.asInstanceOf[js.Any], gradingProgress = gradingProgress.asInstanceOf[js.Any], scoreGiven = scoreGiven.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedGrade]
  }
}

