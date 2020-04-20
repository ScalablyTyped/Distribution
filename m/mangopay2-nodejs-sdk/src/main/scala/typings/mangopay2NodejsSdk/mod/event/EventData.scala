package typings.mangopay2NodejsSdk.mod.event

import typings.mangopay2NodejsSdk.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  /**
    * When the event happened
    */
  var Date: Timestamp
  /**
    * The event type
    */
  var EventType: typings.mangopay2NodejsSdk.mod.event.EventType
  /**
    * The ID of whatever the event is
    */
  var ResourceId: String
}

object EventData {
  @scala.inline
  def apply(Date: Timestamp, EventType: EventType, ResourceId: String): EventData = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

