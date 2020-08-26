package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionDefaultsHover extends js.Object {
  var stroke: js.UndefOr[DiagramConnectionDefaultsHoverStroke] = js.native
}

object DiagramConnectionDefaultsHover {
  @scala.inline
  def apply(): DiagramConnectionDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsHover]
  }
  @scala.inline
  implicit class DiagramConnectionDefaultsHoverOps[Self <: DiagramConnectionDefaultsHover] (val x: Self) extends AnyVal {
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
    def setStroke(value: DiagramConnectionDefaultsHoverStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
  }
  
}

