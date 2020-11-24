package typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadRepositoryBroadcastResponsePayload extends js.Object {
  
  var client_context: String = js.native
  
  var item_id: String = js.native
  
  var thread_id: String = js.native
  
  var timestamp: String = js.native
}
object DirectThreadRepositoryBroadcastResponsePayload {
  
  @scala.inline
  def apply(client_context: String, item_id: String, thread_id: String, timestamp: String): DirectThreadRepositoryBroadcastResponsePayload = {
    val __obj = js.Dynamic.literal(client_context = client_context.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponsePayload]
  }
  
  @scala.inline
  implicit class DirectThreadRepositoryBroadcastResponsePayloadOps[Self <: DirectThreadRepositoryBroadcastResponsePayload] (val x: Self) extends AnyVal {
    
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
    def setClient_context(value: String): Self = this.set("client_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_id(value: String): Self = this.set("item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_id(value: String): Self = this.set("thread_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
