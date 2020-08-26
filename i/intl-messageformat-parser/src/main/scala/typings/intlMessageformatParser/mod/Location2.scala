package typings.intlMessageformatParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location2 extends js.Object {
  var end: LocationDetails = js.native
  var start: LocationDetails = js.native
}

object Location2 {
  @scala.inline
  def apply(end: LocationDetails, start: LocationDetails): Location2 = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location2]
  }
  @scala.inline
  implicit class Location2Ops[Self <: Location2] (val x: Self) extends AnyVal {
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
    def setEnd(value: LocationDetails): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: LocationDetails): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

