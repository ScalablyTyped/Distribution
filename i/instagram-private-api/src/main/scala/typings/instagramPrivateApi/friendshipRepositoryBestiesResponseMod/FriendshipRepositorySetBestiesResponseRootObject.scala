package typings.instagramPrivateApi.friendshipRepositoryBestiesResponseMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FriendshipRepositorySetBestiesResponseRootObject extends js.Object {
  
  var friendship_statuses: Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus] = js.native
  
  var status: String = js.native
}
object FriendshipRepositorySetBestiesResponseRootObject {
  
  @scala.inline
  def apply(
    friendship_statuses: Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus],
    status: String
  ): FriendshipRepositorySetBestiesResponseRootObject = {
    val __obj = js.Dynamic.literal(friendship_statuses = friendship_statuses.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendshipRepositorySetBestiesResponseRootObject]
  }
  
  @scala.inline
  implicit class FriendshipRepositorySetBestiesResponseRootObjectOps[Self <: FriendshipRepositorySetBestiesResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setFriendship_statuses(value: Record[String, FriendshipRepositorySetBestiesResponseRootObjectStatus]): Self = this.set("friendship_statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
