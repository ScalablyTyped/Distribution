package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryChatRequestInfosItem extends js.Object {
  var cursor: String
  var requester_usernames: ListReelMediaViewerFeedResponseRequesterUsernames
  var total_participant_requests: Double
  var total_thread_participants: Double
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
}

object ListReelMediaViewerFeedResponseStoryChatRequestInfosItem {
  @scala.inline
  def apply(
    cursor: String,
    requester_usernames: ListReelMediaViewerFeedResponseRequesterUsernames,
    total_participant_requests: Double,
    total_thread_participants: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
  ): ListReelMediaViewerFeedResponseStoryChatRequestInfosItem = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], requester_usernames = requester_usernames.asInstanceOf[js.Any], total_participant_requests = total_participant_requests.asInstanceOf[js.Any], total_thread_participants = total_thread_participants.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryChatRequestInfosItem]
  }
}

