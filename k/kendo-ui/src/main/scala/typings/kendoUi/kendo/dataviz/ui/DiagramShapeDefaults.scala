package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeDefaults extends StObject {
  
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
  implicit class DiagramShapeDefaultsMutableBuilder[Self <: DiagramShapeDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorDefaults(value: DiagramShapeDefaultsConnectorDefaults): Self = StObject.set(x, "connectorDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorDefaultsUndefined: Self = StObject.set(x, "connectorDefaults", js.undefined)
    
    @scala.inline
    def setConnectors(value: js.Array[DiagramShapeDefaultsConnector]): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
    
    @scala.inline
    def setConnectorsVarargs(value: DiagramShapeDefaultsConnector*): Self = StObject.set(x, "connectors", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: DiagramShapeDefaultsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | DiagramShapeDefaultsEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setFill(value: String | DiagramShapeDefaultsFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramShapeDefaultsHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRotation(value: DiagramShapeDefaultsRotation): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramShapeDefaultsStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
