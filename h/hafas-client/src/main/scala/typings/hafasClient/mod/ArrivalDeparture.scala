package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrivalDeparture extends js.Object {
  var arrival: js.UndefOr[Double] = js.native
  var departure: js.UndefOr[Double] = js.native
}

object ArrivalDeparture {
  @scala.inline
  def apply(): ArrivalDeparture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrivalDeparture]
  }
  @scala.inline
  implicit class ArrivalDepartureOps[Self <: ArrivalDeparture] (val x: Self) extends AnyVal {
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
    def setArrival(value: Double): Self = this.set("arrival", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrival: Self = this.set("arrival", js.undefined)
    @scala.inline
    def setDeparture(value: Double): Self = this.set("departure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeparture: Self = this.set("departure", js.undefined)
  }
  
}

