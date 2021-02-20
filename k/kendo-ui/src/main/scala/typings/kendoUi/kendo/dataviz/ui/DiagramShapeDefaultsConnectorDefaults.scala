package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeDefaultsConnectorDefaults extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsFill] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[DiagramShapeDefaultsConnectorDefaultsHover] = js.native
  
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsStroke] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiagramShapeDefaultsConnectorDefaults {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaults]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsConnectorDefaultsMutableBuilder[Self <: DiagramShapeDefaultsConnectorDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeDefaultsConnectorDefaultsFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramShapeDefaultsConnectorDefaultsHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramShapeDefaultsConnectorDefaultsStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
