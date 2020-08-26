package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionStartCap extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionStartCapFill] = js.native
  var stroke: js.UndefOr[String | DiagramConnectionStartCapStroke] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DiagramConnectionStartCap {
  @scala.inline
  def apply(): DiagramConnectionStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionStartCap]
  }
  @scala.inline
  implicit class DiagramConnectionStartCapOps[Self <: DiagramConnectionStartCap] (val x: Self) extends AnyVal {
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
    def setFill(value: String | DiagramConnectionStartCapFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setStroke(value: String | DiagramConnectionStartCapStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

