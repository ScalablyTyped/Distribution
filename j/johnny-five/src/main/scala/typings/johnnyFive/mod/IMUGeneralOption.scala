package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMUGeneralOption extends js.Object {
  var controller: js.UndefOr[String] = js.native
  var freq: js.UndefOr[Double] = js.native
}

object IMUGeneralOption {
  @scala.inline
  def apply(): IMUGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMUGeneralOption]
  }
  @scala.inline
  implicit class IMUGeneralOptionOps[Self <: IMUGeneralOption] (val x: Self) extends AnyVal {
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
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
  }
  
}

