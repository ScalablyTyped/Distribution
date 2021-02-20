package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeConnectorDefaultsHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeConnectorDefaultsHoverFill] = js.native
  
  var stroke: js.UndefOr[String | DiagramShapeConnectorDefaultsHoverStroke] = js.native
}
object DiagramShapeConnectorDefaultsHover {
  
  @scala.inline
  def apply(): DiagramShapeConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeConnectorDefaultsHover]
  }
  
  @scala.inline
  implicit class DiagramShapeConnectorDefaultsHoverMutableBuilder[Self <: DiagramShapeConnectorDefaultsHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeConnectorDefaultsHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramShapeConnectorDefaultsHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
