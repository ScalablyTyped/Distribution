package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionReplaceEvent extends js.Object {
  
  def accept(): Unit = js.native
  
  def reject(): Unit = js.native
  
  var request: IncomingRequest = js.native
}
object SessionReplaceEvent {
  
  @scala.inline
  def apply(accept: () => Unit, reject: () => Unit, request: IncomingRequest): SessionReplaceEvent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), reject = js.Any.fromFunction0(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReplaceEvent]
  }
  
  @scala.inline
  implicit class SessionReplaceEventOps[Self <: SessionReplaceEvent] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: () => Unit): Self = this.set("accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReject(value: () => Unit): Self = this.set("reject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequest(value: IncomingRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
