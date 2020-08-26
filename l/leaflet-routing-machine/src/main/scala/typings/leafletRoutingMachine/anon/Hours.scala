package typings.leafletRoutingMachine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hours extends js.Object {
  var hours: String = js.native
  var kilometers: String = js.native
  var meters: String = js.native
  var miles: String = js.native
  var minutes: String = js.native
  var seconds: String = js.native
  var yards: String = js.native
}

object Hours {
  @scala.inline
  def apply(
    hours: String,
    kilometers: String,
    meters: String,
    miles: String,
    minutes: String,
    seconds: String,
    yards: String
  ): Hours = {
    val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], kilometers = kilometers.asInstanceOf[js.Any], meters = meters.asInstanceOf[js.Any], miles = miles.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], yards = yards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hours]
  }
  @scala.inline
  implicit class HoursOps[Self <: Hours] (val x: Self) extends AnyVal {
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
    def setHours(value: String): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setKilometers(value: String): Self = this.set("kilometers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeters(value: String): Self = this.set("meters", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiles(value: String): Self = this.set("miles", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: String): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: String): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setYards(value: String): Self = this.set("yards", value.asInstanceOf[js.Any])
  }
  
}

