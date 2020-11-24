package typings.instagramPrivateApi.directThreadRepositoryBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadRepositoryBroadcastResponseRootObject extends js.Object {
  
  var action: String = js.native
  
  var message_metadata: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata] = js.native
  
  var payload: DirectThreadRepositoryBroadcastResponsePayload = js.native
  
  var status: String = js.native
  
  var status_code: String = js.native
}
object DirectThreadRepositoryBroadcastResponseRootObject {
  
  @scala.inline
  def apply(
    action: String,
    message_metadata: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata],
    payload: DirectThreadRepositoryBroadcastResponsePayload,
    status: String,
    status_code: String
  ): DirectThreadRepositoryBroadcastResponseRootObject = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], message_metadata = message_metadata.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryBroadcastResponseRootObject]
  }
  
  @scala.inline
  implicit class DirectThreadRepositoryBroadcastResponseRootObjectOps[Self <: DirectThreadRepositoryBroadcastResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_metadataVarargs(value: DirectThreadRepositoryBroadcastResponseMessageMetadata*): Self = this.set("message_metadata", js.Array(value :_*))
    
    @scala.inline
    def setMessage_metadata(value: js.Array[DirectThreadRepositoryBroadcastResponseMessageMetadata]): Self = this.set("message_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: DirectThreadRepositoryBroadcastResponsePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_code(value: String): Self = this.set("status_code", value.asInstanceOf[js.Any])
  }
}
