package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionDefaults extends js.Object {
  var content: js.UndefOr[DiagramConnectionDefaultsContent] = js.native
  var editable: js.UndefOr[Boolean | DiagramConnectionDefaultsEditable] = js.native
  var endCap: js.UndefOr[String | DiagramConnectionDefaultsEndCap] = js.native
  var fromConnector: js.UndefOr[String] = js.native
  var hover: js.UndefOr[DiagramConnectionDefaultsHover] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selection: js.UndefOr[DiagramConnectionDefaultsSelection] = js.native
  var startCap: js.UndefOr[String | DiagramConnectionDefaultsStartCap] = js.native
  var stroke: js.UndefOr[DiagramConnectionDefaultsStroke] = js.native
  var toConnector: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DiagramConnectionDefaults {
  @scala.inline
  def apply(): DiagramConnectionDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaults]
  }
  @scala.inline
  implicit class DiagramConnectionDefaultsOps[Self <: DiagramConnectionDefaults] (val x: Self) extends AnyVal {
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
    def setContent(value: DiagramConnectionDefaultsContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEditable(value: Boolean | DiagramConnectionDefaultsEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEndCap(value: String | DiagramConnectionDefaultsEndCap): Self = this.set("endCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndCap: Self = this.set("endCap", js.undefined)
    @scala.inline
    def setFromConnector(value: String): Self = this.set("fromConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromConnector: Self = this.set("fromConnector", js.undefined)
    @scala.inline
    def setHover(value: DiagramConnectionDefaultsHover): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelection(value: DiagramConnectionDefaultsSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setStartCap(value: String | DiagramConnectionDefaultsStartCap): Self = this.set("startCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCap: Self = this.set("startCap", js.undefined)
    @scala.inline
    def setStroke(value: DiagramConnectionDefaultsStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setToConnector(value: String): Self = this.set("toConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToConnector: Self = this.set("toConnector", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

