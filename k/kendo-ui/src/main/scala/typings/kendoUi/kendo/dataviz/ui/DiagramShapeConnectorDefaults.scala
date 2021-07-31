package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeConnectorDefaults extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeConnectorDefaultsFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[DiagramShapeConnectorDefaultsHover] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramShapeConnectorDefaultsStroke] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiagramShapeConnectorDefaults {
  
  @scala.inline
  def apply(): DiagramShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeConnectorDefaults]
  }
  
  @scala.inline
  implicit class DiagramShapeConnectorDefaultsMutableBuilder[Self <: DiagramShapeConnectorDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeConnectorDefaultsFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramShapeConnectorDefaultsHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramShapeConnectorDefaultsStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
