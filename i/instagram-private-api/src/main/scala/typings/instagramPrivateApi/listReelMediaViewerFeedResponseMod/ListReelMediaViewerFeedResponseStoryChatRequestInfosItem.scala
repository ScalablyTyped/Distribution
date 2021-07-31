package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseStoryChatRequestInfosItem extends StObject {
  
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
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseStoryChatRequestInfosItemMutableBuilder[Self <: ListReelMediaViewerFeedResponseStoryChatRequestInfosItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequester_usernames(value: ListReelMediaViewerFeedResponseRequesterUsernames): Self = StObject.set(x, "requester_usernames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_participant_requests(value: Double): Self = StObject.set(x, "total_participant_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_thread_participants(value: Double): Self = StObject.set(x, "total_thread_participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: js.Array[ListReelMediaViewerFeedResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: ListReelMediaViewerFeedResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
