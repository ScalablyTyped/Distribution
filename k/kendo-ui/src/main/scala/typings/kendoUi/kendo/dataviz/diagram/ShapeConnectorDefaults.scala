package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeConnectorDefaults extends StObject {
  
  var fill: js.UndefOr[String | ShapeConnectorDefaultsFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[ShapeConnectorDefaultsHover] = js.undefined
  
  var stroke: js.UndefOr[String | ShapeConnectorDefaultsStroke] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ShapeConnectorDefaults {
  
  @scala.inline
  def apply(): ShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeConnectorDefaults]
  }
  
  @scala.inline
  implicit class ShapeConnectorDefaultsMutableBuilder[Self <: ShapeConnectorDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | ShapeConnectorDefaultsFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: ShapeConnectorDefaultsHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setStroke(value: String | ShapeConnectorDefaultsStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
