package typings.instagramPrivateApi.directThreadRepositoryApproveParticipantRequestResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryApproveParticipantRequestResponseItemsItem extends js.Object {
  var item_id: String
  var item_type: String
  var story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare
  var timestamp: String
  var user_id: Double
}

object DirectThreadRepositoryApproveParticipantRequestResponseItemsItem {
  @scala.inline
  def apply(
    item_id: String,
    item_type: String,
    story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare,
    timestamp: String,
    user_id: Double
  ): DirectThreadRepositoryApproveParticipantRequestResponseItemsItem = {
    val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], story_share = story_share.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem]
  }
}

