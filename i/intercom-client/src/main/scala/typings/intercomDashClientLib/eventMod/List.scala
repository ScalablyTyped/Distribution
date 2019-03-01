package typings
package intercomDashClientLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var events: js.Array[Event]
  var pages: intercomDashClientLib.Anon_Next
  var total_count: scala.Double
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.eventDOTlist
}

object List {
  @scala.inline
  def apply(
    events: js.Array[Event],
    pages: intercomDashClientLib.Anon_Next,
    total_count: scala.Double,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.eventDOTlist
  ): List = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("pages")(pages)
    __obj.updateDynamic("total_count")(total_count)
    __obj.asInstanceOf[List]
  }
}

