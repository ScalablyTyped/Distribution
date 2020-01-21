package typings.instagramPrivateApi.directThreadRepositoryGetByParticipantsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryGetByParticipantsResponseItemsItem extends js.Object {
  var item_id: String
  var item_type: String
  var text: String
  var timestamp: String
  var user_id: Double
}

object DirectThreadRepositoryGetByParticipantsResponseItemsItem {
  @scala.inline
  def apply(item_id: String, item_type: String, text: String, timestamp: String, user_id: Double): DirectThreadRepositoryGetByParticipantsResponseItemsItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseItemsItem]
  }
}

