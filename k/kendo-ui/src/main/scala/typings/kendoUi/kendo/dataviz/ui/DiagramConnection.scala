package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnection extends js.Object {
  var content: js.UndefOr[DiagramConnectionContent] = js.native
  var editable: js.UndefOr[Boolean | DiagramConnectionEditable] = js.native
  var endCap: js.UndefOr[String | DiagramConnectionEndCap] = js.native
  var from: js.UndefOr[String | DiagramConnectionFrom] = js.native
  var fromConnector: js.UndefOr[String] = js.native
  var hover: js.UndefOr[DiagramConnectionHover] = js.native
  var points: js.UndefOr[js.Array[DiagramConnectionPoint]] = js.native
  var selection: js.UndefOr[DiagramConnectionSelection] = js.native
  var startCap: js.UndefOr[String | DiagramConnectionStartCap] = js.native
  var stroke: js.UndefOr[DiagramConnectionStroke] = js.native
  var to: js.UndefOr[String | DiagramConnectionTo] = js.native
  var toConnector: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DiagramConnection {
  @scala.inline
  def apply(): DiagramConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnection]
  }
  @scala.inline
  implicit class DiagramConnectionOps[Self <: DiagramConnection] (val x: Self) extends AnyVal {
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
    def setContent(value: DiagramConnectionContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEditable(value: Boolean | DiagramConnectionEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEndCap(value: String | DiagramConnectionEndCap): Self = this.set("endCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndCap: Self = this.set("endCap", js.undefined)
    @scala.inline
    def setFrom(value: String | DiagramConnectionFrom): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setFromConnector(value: String): Self = this.set("fromConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromConnector: Self = this.set("fromConnector", js.undefined)
    @scala.inline
    def setHover(value: DiagramConnectionHover): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setPointsVarargs(value: DiagramConnectionPoint*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[DiagramConnectionPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setSelection(value: DiagramConnectionSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setStartCap(value: String | DiagramConnectionStartCap): Self = this.set("startCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCap: Self = this.set("startCap", js.undefined)
    @scala.inline
    def setStroke(value: DiagramConnectionStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setTo(value: String | DiagramConnectionTo): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
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

