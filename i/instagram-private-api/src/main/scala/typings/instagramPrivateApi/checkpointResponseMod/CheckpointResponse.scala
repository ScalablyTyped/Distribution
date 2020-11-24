package typings.instagramPrivateApi.checkpointResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckpointResponse extends js.Object {
  
  var challenge: CheckpointResponseChallenge = js.native
  
  var error_type: String = js.native
  
  var message: String = js.native
  
  var status: String = js.native
}
object CheckpointResponse {
  
  @scala.inline
  def apply(challenge: CheckpointResponseChallenge, error_type: String, message: String, status: String): CheckpointResponse = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointResponse]
  }
  
  @scala.inline
  implicit class CheckpointResponseOps[Self <: CheckpointResponse] (val x: Self) extends AnyVal {
    
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
    def setChallenge(value: CheckpointResponseChallenge): Self = this.set("challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_type(value: String): Self = this.set("error_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
