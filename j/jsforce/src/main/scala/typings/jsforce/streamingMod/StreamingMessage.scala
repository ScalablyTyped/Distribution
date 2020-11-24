package typings.jsforce.streamingMod

import typings.jsforce.anon.CreatedDate
import typings.jsforce.recordMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingMessage extends js.Object {
  
  var event: CreatedDate = js.native
  
  var sobject: Record[_] = js.native
}
object StreamingMessage {
  
  @scala.inline
  def apply(event: CreatedDate, sobject: Record[_]): StreamingMessage = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], sobject = sobject.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingMessage]
  }
  
  @scala.inline
  implicit class StreamingMessageOps[Self <: StreamingMessage] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: CreatedDate): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSobject(value: Record[_]): Self = this.set("sobject", value.asInstanceOf[js.Any])
  }
}
