package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionEditable extends js.Object {
  var tools: js.UndefOr[js.Array[DiagramConnectionEditableTool]] = js.native
}

object DiagramConnectionEditable {
  @scala.inline
  def apply(): DiagramConnectionEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEditable]
  }
  @scala.inline
  implicit class DiagramConnectionEditableOps[Self <: DiagramConnectionEditable] (val x: Self) extends AnyVal {
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
    def setToolsVarargs(value: DiagramConnectionEditableTool*): Self = this.set("tools", js.Array(value :_*))
    @scala.inline
    def setTools(value: js.Array[DiagramConnectionEditableTool]): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
  
}

