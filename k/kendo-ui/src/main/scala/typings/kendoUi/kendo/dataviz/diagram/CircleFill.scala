package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleFill extends js.Object {
  var color: js.UndefOr[String] = js.native
  var gradient: js.UndefOr[CircleFillGradient] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object CircleFill {
  @scala.inline
  def apply(): CircleFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleFill]
  }
  @scala.inline
  implicit class CircleFillOps[Self <: CircleFill] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setGradient(value: CircleFillGradient): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

