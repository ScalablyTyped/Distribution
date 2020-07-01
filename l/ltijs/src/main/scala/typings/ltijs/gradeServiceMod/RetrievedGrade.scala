package typings.ltijs.gradeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrievedGrade extends js.Object {
  var comment: String
  var id: String
  var resultMaximum: Double
  var resultScore: Double
  var scoreOf: String
  var userId: String
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
}

