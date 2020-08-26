package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionDefaultsStartCap extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionDefaultsStartCapFill] = js.native
  var stroke: js.UndefOr[String | DiagramConnectionDefaultsStartCapStroke] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DiagramConnectionDefaultsStartCap {
  @scala.inline
  def apply(): DiagramConnectionDefaultsStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsStartCap]
  }
  @scala.inline
  implicit class DiagramConnectionDefaultsStartCapOps[Self <: DiagramConnectionDefaultsStartCap] (val x: Self) extends AnyVal {
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
    def setFill(value: String | DiagramConnectionDefaultsStartCapFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setStroke(value: String | DiagramConnectionDefaultsStartCapStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

