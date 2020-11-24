package typings.instagramPrivateApi.liveJoinRequestCountsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveJoinRequestCountsResponseRootObject extends js.Object {
  
  var fetch_ts: Double = js.native
  
  var num_new_requests: Double = js.native
  
  var num_total_requests: Double = js.native
  
  var num_unseen_requests: Double = js.native
  
  var status: String = js.native
  
  var users: js.Array[LiveJoinRequestCountsResponseUsersItem] = js.native
}
object LiveJoinRequestCountsResponseRootObject {
  
  @scala.inline
  def apply(
    fetch_ts: Double,
    num_new_requests: Double,
    num_total_requests: Double,
    num_unseen_requests: Double,
    status: String,
    users: js.Array[LiveJoinRequestCountsResponseUsersItem]
  ): LiveJoinRequestCountsResponseRootObject = {
    val __obj = js.Dynamic.literal(fetch_ts = fetch_ts.asInstanceOf[js.Any], num_new_requests = num_new_requests.asInstanceOf[js.Any], num_total_requests = num_total_requests.asInstanceOf[js.Any], num_unseen_requests = num_unseen_requests.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveJoinRequestCountsResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveJoinRequestCountsResponseRootObjectOps[Self <: LiveJoinRequestCountsResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setFetch_ts(value: Double): Self = this.set("fetch_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_new_requests(value: Double): Self = this.set("num_new_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_total_requests(value: Double): Self = this.set("num_total_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_unseen_requests(value: Double): Self = this.set("num_unseen_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: LiveJoinRequestCountsResponseUsersItem*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[LiveJoinRequestCountsResponseUsersItem]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
