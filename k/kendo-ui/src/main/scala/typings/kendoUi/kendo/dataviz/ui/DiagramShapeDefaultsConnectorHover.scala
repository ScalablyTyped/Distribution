package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsConnectorHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorHoverFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorHoverStroke] = js.undefined
}
object DiagramShapeDefaultsConnectorHover {
  
  @scala.inline
  def apply(): DiagramShapeDefaultsConnectorHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorHover]
  }
  
  @scala.inline
  implicit class DiagramShapeDefaultsConnectorHoverMutableBuilder[Self <: DiagramShapeDefaultsConnectorHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramShapeDefaultsConnectorHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramShapeDefaultsConnectorHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
