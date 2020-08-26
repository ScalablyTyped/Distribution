package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompassOption extends js.Object {
  var controller: String = js.native
  var gauss: js.UndefOr[Double] = js.native
}

object CompassOption {
  @scala.inline
  def apply(controller: String): CompassOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassOption]
  }
  @scala.inline
  implicit class CompassOptionOps[Self <: CompassOption] (val x: Self) extends AnyVal {
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
    def setGauss(value: Double): Self = this.set("gauss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGauss: Self = this.set("gauss", js.undefined)
  }
  
}

