package typings.instagramPrivateApi.liveCommentsResponseMod

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
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveCommentsResponseSystemCommentsItem]
  }
}

