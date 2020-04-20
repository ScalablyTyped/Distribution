package typings.instagramPrivateApi.directThreadRepositoryAddUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryAddUserResponseLastPermanentItem extends js.Object {
  var action_log: DirectThreadRepositoryAddUserResponseActionLog
  var item_id: String
  var item_type: String
  var timestamp: String
  var user_id: Double
}

object DirectThreadRepositoryAddUserResponseLastPermanentItem {
  @scala.inline
  def apply(
    action_log: DirectThreadRepositoryAddUserResponseActionLog,
    item_id: String,
    item_type: String,
    timestamp: String,
    user_id: Double
  ): DirectThreadRepositoryAddUserResponseLastPermanentItem = {
    val __obj = js.Dynamic.literal(action_log = action_log.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryAddUserResponseLastPermanentItem]
  }
}

