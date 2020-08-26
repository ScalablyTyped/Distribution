package typings.jsqubits.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecimalPlaces extends js.Object {
  var decimalPlaces: js.UndefOr[Double] = js.native
}

object DecimalPlaces {
  @scala.inline
  def apply(): DecimalPlaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecimalPlaces]
  }
  @scala.inline
  implicit class DecimalPlacesOps[Self <: DecimalPlaces] (val x: Self) extends AnyVal {
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
    def setDecimalPlaces(value: Double): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
  }
  
}

