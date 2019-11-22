package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseStoryChatRequestInfosItem extends js.Object {
  var cursor: String
  var requester_usernames: ListReelMediaViewerFeedResponseRequester_usernames
  var total_participant_requests: Double
  var total_thread_participants: Double
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
}

object ListReelMediaViewerFeedResponseStoryChatRequestInfosItem {
  @scala.inline
  def apply(
    cursor: String,
    requester_usernames: ListReelMediaViewerFeedResponseRequester_usernames,
    total_participant_requests: Double,
    total_thread_participants: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
  ): ListReelMediaViewerFeedResponseStoryChatRequestInfosItem = {
    val __obj = js.Dynamic.literal(cursor = cursor, requester_usernames = requester_usernames, total_participant_requests = total_participant_requests, total_thread_participants = total_thread_participants, users = users)
  
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseStoryChatRequestInfosItem]
  }
}

