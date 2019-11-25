package typings.ical.icalMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusy extends js.Object {
  var end: Date
  var start: Date
  var `type`: FreeBusyType
}

object FreeBusy {
  @scala.inline
  def apply(end: Date, start: Date, `type`: FreeBusyType): FreeBusy = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy]
  }
}

