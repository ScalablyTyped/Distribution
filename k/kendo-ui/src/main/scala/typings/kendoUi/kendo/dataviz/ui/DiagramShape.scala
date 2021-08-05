package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShape extends StObject {
  
  var connectorDefaults: js.UndefOr[DiagramShapeConnectorDefaults] = js.undefined
  
  var connectors: js.UndefOr[js.Array[DiagramShapeConnector]] = js.undefined
  
  var content: js.UndefOr[DiagramShapeContent] = js.undefined
  
  var editable: js.UndefOr[Boolean | DiagramShapeEditable] = js.undefined
  
  var fill: js.UndefOr[String | DiagramShapeFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[DiagramShapeHover] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var rotation: js.UndefOr[DiagramShapeRotation] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var stroke: js.UndefOr[DiagramShapeStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object DiagramShape {
  
  inline def apply(): DiagramShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShape]
  }
  
  extension [Self <: DiagramShape](x: Self) {
    
    inline def setConnectorDefaults(value: DiagramShapeConnectorDefaults): Self = StObject.set(x, "connectorDefaults", value.asInstanceOf[js.Any])
    
    inline def setConnectorDefaultsUndefined: Self = StObject.set(x, "connectorDefaults", js.undefined)
    
    inline def setConnectors(value: js.Array[DiagramShapeConnector]): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    inline def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    inline def setConnectorsVarargs(value: DiagramShapeConnector*): Self = StObject.set(x, "connectors", js.Array(value :_*))
    
    inline def setContent(value: DiagramShapeContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setEditable(value: Boolean | DiagramShapeEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFill(value: String | DiagramShapeFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHover(value: DiagramShapeHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRotation(value: DiagramShapeRotation): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStroke(value: DiagramShapeStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
