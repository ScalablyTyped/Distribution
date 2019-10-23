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
    val __obj = js.Dynamic.literal(end = end, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FreeBusy]
  }
}

