package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServoGeneralOption extends js.Object {
  var center: js.UndefOr[Boolean] = js.native
  var controller: js.UndefOr[String] = js.native
  var isInverted: js.UndefOr[Boolean] = js.native
  var pin: Double | String = js.native
  var range: js.UndefOr[js.Array[Double]] = js.native
  var startAt: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object ServoGeneralOption {
  @scala.inline
  def apply(pin: Double | String): ServoGeneralOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoGeneralOption]
  }
  @scala.inline
  implicit class ServoGeneralOptionOps[Self <: ServoGeneralOption] (val x: Self) extends AnyVal {
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
    def setPin(value: Double | String): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setIsInverted(value: Boolean): Self = this.set("isInverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInverted: Self = this.set("isInverted", js.undefined)
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

