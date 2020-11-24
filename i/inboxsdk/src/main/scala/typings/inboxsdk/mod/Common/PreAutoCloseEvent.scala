package typings.inboxsdk.mod.Common

import typings.inboxsdk.inboxsdkStrings.escape
import typings.inboxsdk.inboxsdkStrings.outsideInteraction
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreAutoCloseEvent extends js.Object {
  
  def cancel(): Unit = js.native
  
  var cause: Event = js.native
  
  var `type`: outsideInteraction | escape = js.native
}
object PreAutoCloseEvent {
  
  @scala.inline
  def apply(cancel: () => Unit, cause: Event, `type`: outsideInteraction | escape): PreAutoCloseEvent = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cause = cause.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAutoCloseEvent]
  }
  
  @scala.inline
  implicit class PreAutoCloseEventOps[Self <: PreAutoCloseEvent] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCause(value: Event): Self = this.set("cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: outsideInteraction | escape): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
