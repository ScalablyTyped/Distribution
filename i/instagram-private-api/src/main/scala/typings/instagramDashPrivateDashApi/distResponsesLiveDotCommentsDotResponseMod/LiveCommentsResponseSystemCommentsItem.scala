package typings.instagramDashPrivateDashApi.distResponsesLiveDotCommentsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveCommentsResponseSystemCommentsItem extends js.Object {
  var created_at: Double
  var pk: String
  var text: String
  var user: LiveCommentsResponseUser
  var user_count: Double
}

object LiveCommentsResponseSystemCommentsItem {
  @scala.inline
  def apply(created_at: Double, pk: String, text: String, user: LiveCommentsResponseUser, user_count: Double): LiveCommentsResponseSystemCommentsItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, pk = pk, text = text, user = user, user_count = user_count)
  
    __obj.asInstanceOf[LiveCommentsResponseSystemCommentsItem]
  }
}

