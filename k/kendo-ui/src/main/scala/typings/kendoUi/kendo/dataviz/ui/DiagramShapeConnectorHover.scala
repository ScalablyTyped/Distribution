package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeConnectorHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeConnectorHoverFill] = js.native
  
  var stroke: js.UndefOr[String | DiagramShapeConnectorHoverStroke] = js.native
}
object DiagramShapeConnectorHover {
  
  @scala.inline
  def apply(): DiagramShapeConnectorHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeConnectorHover]
  }
  
  @scala.inline
  implicit class DiagramShapeConnectorHoverMutableBuilder[Self <: DiagramShapeConnectorHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeConnectorHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramShapeConnectorHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
