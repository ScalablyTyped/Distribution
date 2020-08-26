package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBOption extends js.Object {
  var controller: js.UndefOr[String] = js.native
  var isAnode: js.UndefOr[Boolean] = js.native
  var pins: js.Array[Double] = js.native
}

object RGBOption {
  @scala.inline
  def apply(pins: js.Array[Double]): RGBOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBOption]
  }
  @scala.inline
  implicit class RGBOptionOps[Self <: RGBOption] (val x: Self) extends AnyVal {
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
    def setPinsVarargs(value: Double*): Self = this.set("pins", js.Array(value :_*))
    @scala.inline
    def setPins(value: js.Array[Double]): Self = this.set("pins", value.asInstanceOf[js.Any])
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setIsAnode(value: Boolean): Self = this.set("isAnode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAnode: Self = this.set("isAnode", js.undefined)
  }
  
}

