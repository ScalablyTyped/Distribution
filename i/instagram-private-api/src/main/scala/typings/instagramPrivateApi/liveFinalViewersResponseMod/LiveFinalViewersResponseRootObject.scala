package typings.instagramPrivateApi.liveFinalViewersResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveFinalViewersResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var total_unique_viewer_count: Double = js.native
  
  var users: js.Array[LiveFinalViewersResponseUsersItem] = js.native
}
object LiveFinalViewersResponseRootObject {
  
  @scala.inline
  def apply(
    status: String,
    total_unique_viewer_count: Double,
    users: js.Array[LiveFinalViewersResponseUsersItem]
  ): LiveFinalViewersResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], total_unique_viewer_count = total_unique_viewer_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveFinalViewersResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveFinalViewersResponseRootObjectOps[Self <: LiveFinalViewersResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setTotal_unique_viewer_count(value: Double): Self = this.set("total_unique_viewer_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: LiveFinalViewersResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[LiveFinalViewersResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
