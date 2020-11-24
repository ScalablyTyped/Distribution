package typings.instagramPrivateApi.liveAddToPostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveAddToPostResponse extends js.Object {
  
  var broadcasts: js.Array[LiveAddToPostBroadcast] = js.native
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var last_seen_broadcast_ts: Double = js.native
  
  var pk: String = js.native
  
  var status: String = js.native
  
  var user: LiveAddToPostUser = js.native
}
object LiveAddToPostResponse {
  
  @scala.inline
  def apply(
    broadcasts: js.Array[LiveAddToPostBroadcast],
    can_reply: Boolean,
    can_reshare: Boolean,
    last_seen_broadcast_ts: Double,
    pk: String,
    status: String,
    user: LiveAddToPostUser
  ): LiveAddToPostResponse = {
    val __obj = js.Dynamic.literal(broadcasts = broadcasts.asInstanceOf[js.Any], can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], last_seen_broadcast_ts = last_seen_broadcast_ts.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveAddToPostResponse]
  }
  
  @scala.inline
  implicit class LiveAddToPostResponseOps[Self <: LiveAddToPostResponse] (val x: Self) extends AnyVal {
    
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
    def setBroadcastsVarargs(value: LiveAddToPostBroadcast*): Self = this.set("broadcasts", js.Array(value :_*))
    
    @scala.inline
    def setBroadcasts(value: js.Array[LiveAddToPostBroadcast]): Self = this.set("broadcasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reply(value: Boolean): Self = this.set("can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = this.set("can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_seen_broadcast_ts(value: Double): Self = this.set("last_seen_broadcast_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: LiveAddToPostUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
