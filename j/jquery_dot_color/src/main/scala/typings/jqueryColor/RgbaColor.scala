package typings.jqueryColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RgbaColor extends js.Object {
  var alpha: js.UndefOr[Double] = js.native
  var blue: js.UndefOr[Double] = js.native
  var green: js.UndefOr[Double] = js.native
  var red: js.UndefOr[Double] = js.native
}

object RgbaColor {
  @scala.inline
  def apply(): RgbaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RgbaColor]
  }
  @scala.inline
  implicit class RgbaColorOps[Self <: RgbaColor] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlue: Self = this.set("blue", js.undefined)
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGreen: Self = this.set("green", js.undefined)
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRed: Self = this.set("red", js.undefined)
  }
  
}

