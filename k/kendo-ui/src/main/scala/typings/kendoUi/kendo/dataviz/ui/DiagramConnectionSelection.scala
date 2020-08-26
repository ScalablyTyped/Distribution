package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionSelection extends js.Object {
  var handles: js.UndefOr[DiagramConnectionSelectionHandles] = js.native
}

object DiagramConnectionSelection {
  @scala.inline
  def apply(): DiagramConnectionSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionSelection]
  }
  @scala.inline
  implicit class DiagramConnectionSelectionOps[Self <: DiagramConnectionSelection] (val x: Self) extends AnyVal {
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
    def setHandles(value: DiagramConnectionSelectionHandles): Self = this.set("handles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandles: Self = this.set("handles", js.undefined)
  }
  
}

