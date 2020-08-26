package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: City = js.native
  var position: js.Array[Double] = js.native
}

object Address {
  @scala.inline
  def apply(address: City, position: js.Array[Double]): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAddress(value: City): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionVarargs(value: Double*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: js.Array[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

