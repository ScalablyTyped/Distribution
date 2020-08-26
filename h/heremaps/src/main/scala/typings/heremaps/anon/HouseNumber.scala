package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HouseNumber extends js.Object {
  var City: Double = js.native
  var HouseNumber: Double = js.native
  var Street: js.Array[Double] = js.native
}

object HouseNumber {
  @scala.inline
  def apply(City: Double, HouseNumber: Double, Street: js.Array[Double]): HouseNumber = {
    val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], HouseNumber = HouseNumber.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any])
    __obj.asInstanceOf[HouseNumber]
  }
  @scala.inline
  implicit class HouseNumberOps[Self <: HouseNumber] (val x: Self) extends AnyVal {
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
    def setCity(value: Double): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def setHouseNumber(value: Double): Self = this.set("HouseNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetVarargs(value: Double*): Self = this.set("Street", js.Array(value :_*))
    @scala.inline
    def setStreet(value: js.Array[Double]): Self = this.set("Street", value.asInstanceOf[js.Any])
  }
  
}

