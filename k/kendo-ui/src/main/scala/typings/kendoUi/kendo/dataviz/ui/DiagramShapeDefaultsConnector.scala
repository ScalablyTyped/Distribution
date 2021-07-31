package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsConnector extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[DiagramShapeDefaultsConnectorHover] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[js.Function] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorStroke] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiagramShapeDefaultsConnector {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsConnector]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsConnectorMutableBuilder[Self <: DiagramShapeDefaultsConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeDefaultsConnectorFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramShapeDefaultsConnectorHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Function): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramShapeDefaultsConnectorStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
