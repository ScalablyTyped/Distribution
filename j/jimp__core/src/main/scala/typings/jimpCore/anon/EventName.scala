package typings.jimpCore.anon

import typings.jimpCore.etcMod.ChangeName
import typings.jimpCore.etcMod.ListenableName
import typings.jimpCore.etcMod.ListenerData
import typings.jimpCore.jimpCoreStrings.clone
import typings.jimpCore.jimpCoreStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventName[T /* <: ListenableName */] extends ListenerData[T] {
  var eventName: T = js.native
  var methodName: clone | ChangeName | constructor = js.native
}

object EventName {
  @scala.inline
  def apply[/* <: typings.jimpCore.etcMod.ListenableName */ T](eventName: T, methodName: clone | ChangeName | constructor): EventName[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName[T]]
  }
  @scala.inline
  implicit class EventNameOps[Self <: EventName[_], /* <: typings.jimpCore.etcMod.ListenableName */ T] (val x: Self with EventName[T]) extends AnyVal {
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
    def setEventName(value: T): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodName(value: clone | ChangeName | constructor): Self = this.set("methodName", value.asInstanceOf[js.Any])
  }
  
}

