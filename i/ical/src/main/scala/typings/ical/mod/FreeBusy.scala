package typings.ical.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusy extends js.Object {
  var end: Date = js.native
  var start: Date = js.native
  var `type`: FreeBusyType = js.native
}

object FreeBusy {
  @scala.inline
  def apply(end: Date, start: Date, `type`: FreeBusyType): FreeBusy = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy]
  }
  @scala.inline
  implicit class FreeBusyOps[Self <: FreeBusy] (val x: Self) extends AnyVal {
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
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FreeBusyType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

