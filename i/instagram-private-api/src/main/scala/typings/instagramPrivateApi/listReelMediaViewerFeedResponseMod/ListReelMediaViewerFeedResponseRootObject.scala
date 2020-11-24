package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseRootObject extends js.Object {
  
  var next_max_id: String | Null = js.native
  
  var status: String = js.native
  
  var total_viewer_count: Double = js.native
  
  var updated_media: ListReelMediaViewerFeedResponseUpdatedMedia = js.native
  
  var user_count: Double = js.native
  
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem] = js.native
}
object ListReelMediaViewerFeedResponseRootObject {
  
  @scala.inline
  def apply(
    status: String,
    total_viewer_count: Double,
    updated_media: ListReelMediaViewerFeedResponseUpdatedMedia,
    user_count: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
  ): ListReelMediaViewerFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], total_viewer_count = total_viewer_count.asInstanceOf[js.Any], updated_media = updated_media.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseRootObject]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseRootObjectOps[Self <: ListReelMediaViewerFeedResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_viewer_count(value: Double): Self = this.set("total_viewer_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_media(value: ListReelMediaViewerFeedResponseUpdatedMedia): Self = this.set("updated_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_count(value: Double): Self = this.set("user_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: ListReelMediaViewerFeedResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[ListReelMediaViewerFeedResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_idNull: Self = this.set("next_max_id", null)
  }
}
