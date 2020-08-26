package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Age
import typings.matrixJsSdk.mod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var age: Double = js.native
  var content: js.UndefOr[EventContent] = js.native
  var event_id: String = js.native
  var origin_server_ts: js.UndefOr[Double] = js.native
  var redacts: js.UndefOr[String] = js.native
  var replaces_state: js.UndefOr[String] = js.native
  var room_id: String = js.native
  var sender: String = js.native
  var state_key: String = js.native
  var `type`: EventType = js.native
  var unsigned: Age = js.native
  var user_id: String = js.native
}

object Event {
  @scala.inline
  def apply(
    age: Double,
    event_id: String,
    room_id: String,
    sender: String,
    state_key: String,
    `type`: EventType,
    unsigned: Age,
    user_id: String
  ): Event = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent_id(value: String): Self = this.set("event_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoom_id(value: String): Self = this.set("room_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: String): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setState_key(value: String): Self = this.set("state_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsigned(value: Age): Self = this.set("unsigned", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: EventContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setOrigin_server_ts(value: Double): Self = this.set("origin_server_ts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin_server_ts: Self = this.set("origin_server_ts", js.undefined)
    @scala.inline
    def setRedacts(value: String): Self = this.set("redacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedacts: Self = this.set("redacts", js.undefined)
    @scala.inline
    def setReplaces_state(value: String): Self = this.set("replaces_state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaces_state: Self = this.set("replaces_state", js.undefined)
  }
  
}

