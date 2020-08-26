package typings.ionic.eventsMod

import typings.ionic.ionicStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPCEvent[E /* <: String */, D /* <: js.Object */] extends js.Object {
  var data: D = js.native
  var event: E = js.native
  var `type`: event = js.native
}

object IPCEvent {
  @scala.inline
  def apply[/* <: java.lang.String */ E, /* <: js.Object */ D](data: D, event: E, `type`: event): IPCEvent[E, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPCEvent[E, D]]
  }
  @scala.inline
  implicit class IPCEventOps[Self <: IPCEvent[_, _], /* <: java.lang.String */ E, /* <: js.Object */ D] (val x: Self with (IPCEvent[E, D])) extends AnyVal {
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: E): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: event): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

