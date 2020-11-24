package typings.instagramPrivateApi.friendshipRepositoryChangeResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FriendshipRepositoryChangeResponseRootObject extends js.Object {
  
  var friendship_status: FriendshipRepositoryChangeResponseFriendshipStatus = js.native
  
  var status: String = js.native
}
object FriendshipRepositoryChangeResponseRootObject {
  
  @scala.inline
  def apply(friendship_status: FriendshipRepositoryChangeResponseFriendshipStatus, status: String): FriendshipRepositoryChangeResponseRootObject = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendshipRepositoryChangeResponseRootObject]
  }
  
  @scala.inline
  implicit class FriendshipRepositoryChangeResponseRootObjectOps[Self <: FriendshipRepositoryChangeResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFriendship_status(value: FriendshipRepositoryChangeResponseFriendshipStatus): Self = this.set("friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
