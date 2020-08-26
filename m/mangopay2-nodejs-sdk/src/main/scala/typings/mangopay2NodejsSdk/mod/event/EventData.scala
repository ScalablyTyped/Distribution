package typings.mangopay2NodejsSdk.mod.event

import typings.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  /**
    * When the event happened
    */
  var Date: Timestamp = js.native
  /**
    * The event type
    */
  var EventType: typings.mangopay2NodejsSdk.mod.event.EventType = js.native
  /**
    * The ID of whatever the event is
    */
  var ResourceId: String = js.native
}

object EventData {
  @scala.inline
  def apply(Date: Timestamp, EventType: EventType, ResourceId: String): EventData = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
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
    def setDate(value: Timestamp): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: EventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
  }
  
}

