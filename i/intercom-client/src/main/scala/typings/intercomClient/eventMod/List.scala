package typings.intercomClient.eventMod

import typings.intercomClient.AnonNext
import typings.intercomClient.intercomClientStrings.eventDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var events: js.Array[Event]
  var pages: AnonNext
  var total_count: Double
  var `type`: eventDotlist
}

object List {
  @scala.inline
  def apply(events: js.Array[Event], pages: AnonNext, total_count: Double, `type`: eventDotlist): List = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

