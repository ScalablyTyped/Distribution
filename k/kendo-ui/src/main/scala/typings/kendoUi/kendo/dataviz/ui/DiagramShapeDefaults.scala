package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramShapeDefaults extends js.Object {
  var connectorDefaults: js.UndefOr[DiagramShapeDefaultsConnectorDefaults] = js.native
  var connectors: js.UndefOr[js.Array[DiagramShapeDefaultsConnector]] = js.native
  var content: js.UndefOr[DiagramShapeDefaultsContent] = js.native
  var editable: js.UndefOr[Boolean | DiagramShapeDefaultsEditable] = js.native
  var fill: js.UndefOr[String | DiagramShapeDefaultsFill] = js.native
  var height: js.UndefOr[Double] = js.native
  var hover: js.UndefOr[DiagramShapeDefaultsHover] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var rotation: js.UndefOr[DiagramShapeDefaultsRotation] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[DiagramShapeDefaultsStroke] = js.native
  var `type`: js.UndefOr[String] = js.native
  var visual: js.UndefOr[js.Function] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object DiagramShapeDefaults {
  @scala.inline
  def apply(): DiagramShapeDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaults]
  }
  @scala.inline
  implicit class DiagramShapeDefaultsOps[Self <: DiagramShapeDefaults] (val x: Self) extends AnyVal {
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
    def setConnectorDefaults(value: DiagramShapeDefaultsConnectorDefaults): Self = this.set("connectorDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorDefaults: Self = this.set("connectorDefaults", js.undefined)
    @scala.inline
    def setConnectorsVarargs(value: DiagramShapeDefaultsConnector*): Self = this.set("connectors", js.Array(value :_*))
    @scala.inline
    def setConnectors(value: js.Array[DiagramShapeDefaultsConnector]): Self = this.set("connectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
    @scala.inline
    def setContent(value: DiagramShapeDefaultsContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEditable(value: Boolean | DiagramShapeDefaultsEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setFill(value: String | DiagramShapeDefaultsFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHover(value: DiagramShapeDefaultsHover): Self = this.set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRotation(value: DiagramShapeDefaultsRotation): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStroke(value: DiagramShapeDefaultsStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

