package typings.instagramDashPrivateDashApi.distResponsesLiveDotGetDashQuestionsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveGetQuestionsResponseRootObject extends js.Object {
  var questions: js.Array[LiveGetQuestionsResponseQuestionsItem]
  var status: String
}

object LiveGetQuestionsResponseRootObject {
  @scala.inline
  def apply(questions: js.Array[LiveGetQuestionsResponseQuestionsItem], status: String): LiveGetQuestionsResponseRootObject = {
    val __obj = js.Dynamic.literal(questions = questions, status = status)
  
    __obj.asInstanceOf[LiveGetQuestionsResponseRootObject]
  }
}

