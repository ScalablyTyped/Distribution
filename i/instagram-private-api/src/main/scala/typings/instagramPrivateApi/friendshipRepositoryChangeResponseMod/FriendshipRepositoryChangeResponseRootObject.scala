package typings.instagramPrivateApi.friendshipRepositoryChangeResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FriendshipRepositoryChangeResponseRootObject extends js.Object {
  var friendship_status: FriendshipRepositoryChangeResponseFriendshipStatus
  var status: String
}

object FriendshipRepositoryChangeResponseRootObject {
  @scala.inline
  def apply(friendship_status: FriendshipRepositoryChangeResponseFriendshipStatus, status: String): FriendshipRepositoryChangeResponseRootObject = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendshipRepositoryChangeResponseRootObject]
  }
}

