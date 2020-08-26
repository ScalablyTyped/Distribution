package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramShapeDefaultsEditable extends js.Object {
  var connect: js.UndefOr[Boolean] = js.native
  var drag: js.UndefOr[Boolean] = js.native
  var remove: js.UndefOr[Boolean] = js.native
  var tools: js.UndefOr[js.Array[DiagramShapeDefaultsEditableTool]] = js.native
}

object DiagramShapeDefaultsEditable {
  @scala.inline
  def apply(): DiagramShapeDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsEditable]
  }
  @scala.inline
  implicit class DiagramShapeDefaultsEditableOps[Self <: DiagramShapeDefaultsEditable] (val x: Self) extends AnyVal {
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
    def setConnect(value: Boolean): Self = this.set("connect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setToolsVarargs(value: DiagramShapeDefaultsEditableTool*): Self = this.set("tools", js.Array(value :_*))
    @scala.inline
    def setTools(value: js.Array[DiagramShapeDefaultsEditableTool]): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
  
}

