package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShape extends js.Object {
  
  var connectorDefaults: js.UndefOr[DiagramShapeConnectorDefaults] = js.native
  
  var connectors: js.UndefOr[js.Array[DiagramShapeConnector]] = js.native
  
  var content: js.UndefOr[DiagramShapeContent] = js.native
  
  var editable: js.UndefOr[Boolean | DiagramShapeEditable] = js.native
  
  var fill: js.UndefOr[String | DiagramShapeFill] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[DiagramShapeHover] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var rotation: js.UndefOr[DiagramShapeRotation] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var stroke: js.UndefOr[DiagramShapeStroke] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var visual: js.UndefOr[js.Function] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object DiagramShape {
  
  @scala.inline
  def apply(): DiagramShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShape]
  }
  
  @scala.inline
  implicit class DiagramShapeOps[Self <: DiagramShape] (val x: Self) extends AnyVal {
    
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
    def setConnectorDefaults(value: DiagramShapeConnectorDefaults): Self = this.set("connectorDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorDefaults: Self = this.set("connectorDefaults", js.undefined)
    
    @scala.inline
    def setConnectorsVarargs(value: DiagramShapeConnector*): Self = this.set("connectors", js.Array(value :_*))
    
    @scala.inline
    def setConnectors(value: js.Array[DiagramShapeConnector]): Self = this.set("connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectors: Self = this.set("connectors", js.undefined)
    
    @scala.inline
    def setContent(value: DiagramShapeContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | DiagramShapeEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setFill(value: String | DiagramShapeFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramShapeHover): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
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
    def setRotation(value: DiagramShapeRotation): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramShapeStroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
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
