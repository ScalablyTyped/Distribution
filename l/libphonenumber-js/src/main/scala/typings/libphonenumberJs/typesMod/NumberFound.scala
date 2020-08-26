package typings.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFound extends js.Object {
  var endsAt: Double = js.native
  var number: PhoneNumber = js.native
  var startsAt: Double = js.native
}

object NumberFound {
  @scala.inline
  def apply(endsAt: Double, number: PhoneNumber, startsAt: Double): NumberFound = {
    val __obj = js.Dynamic.literal(endsAt = endsAt.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFound]
  }
  @scala.inline
  implicit class NumberFoundOps[Self <: NumberFound] (val x: Self) extends AnyVal {
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
    def setEndsAt(value: Double): Self = this.set("endsAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: PhoneNumber): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartsAt(value: Double): Self = this.set("startsAt", value.asInstanceOf[js.Any])
  }
  
}

