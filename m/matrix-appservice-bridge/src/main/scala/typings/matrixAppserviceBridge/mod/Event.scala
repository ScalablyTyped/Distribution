package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.Age
import typings.matrixJsSdk.mod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var age: Double
  var content: js.UndefOr[EventContent] = js.undefined
  var event_id: String
  var origin_server_ts: js.UndefOr[Double] = js.undefined
  var redacts: js.UndefOr[String] = js.undefined
  var replaces_state: js.UndefOr[String] = js.undefined
  var room_id: String
  var sender: String
  var state_key: String
  var `type`: EventType
  var unsigned: Age
  var user_id: String
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
    user_id: String,
    content: EventContent = null,
    origin_server_ts: js.UndefOr[Double] = js.undefined,
    redacts: String = null,
    replaces_state: String = null
  ): Event = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], event_id = event_id.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(origin_server_ts)) __obj.updateDynamic("origin_server_ts")(origin_server_ts.get.asInstanceOf[js.Any])
    if (redacts != null) __obj.updateDynamic("redacts")(redacts.asInstanceOf[js.Any])
    if (replaces_state != null) __obj.updateDynamic("replaces_state")(replaces_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

