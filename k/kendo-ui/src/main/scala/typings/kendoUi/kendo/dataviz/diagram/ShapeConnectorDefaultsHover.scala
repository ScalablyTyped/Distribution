package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeConnectorDefaultsHover extends StObject {
  
  var fill: js.UndefOr[String | ShapeConnectorDefaultsHoverFill] = js.undefined
  
  var stroke: js.UndefOr[String | ShapeConnectorDefaultsHoverStroke] = js.undefined
}
object ShapeConnectorDefaultsHover {
  
  @scala.inline
  def apply(): ShapeConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeConnectorDefaultsHover]
  }
  
  @scala.inline
  implicit class ShapeConnectorDefaultsHoverMutableBuilder[Self <: ShapeConnectorDefaultsHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | ShapeConnectorDefaultsHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | ShapeConnectorDefaultsHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
