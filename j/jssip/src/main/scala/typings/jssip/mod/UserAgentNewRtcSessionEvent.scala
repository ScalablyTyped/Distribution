package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentNewRtcSessionEvent extends js.Object {
  
  var originator: String = js.native
  
  var request: IncomingRequest | OutgoingRequest = js.native
  
  var session: RTCSession = js.native
}
object UserAgentNewRtcSessionEvent {
  
  @scala.inline
  def apply(originator: String, request: IncomingRequest | OutgoingRequest, session: RTCSession): UserAgentNewRtcSessionEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentNewRtcSessionEvent]
  }
  
  @scala.inline
  implicit class UserAgentNewRtcSessionEventOps[Self <: UserAgentNewRtcSessionEvent] (val x: Self) extends AnyVal {
    
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
    def setOriginator(value: String): Self = this.set("originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IncomingRequest | OutgoingRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: RTCSession): Self = this.set("session", value.asInstanceOf[js.Any])
  }
}
