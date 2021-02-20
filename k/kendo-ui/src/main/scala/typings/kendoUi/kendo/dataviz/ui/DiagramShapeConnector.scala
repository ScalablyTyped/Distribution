package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeConnector extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var fill: js.UndefOr[String | DiagramShapeConnectorFill] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[DiagramShapeConnectorHover] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[js.Function] = js.native
  
  var stroke: js.UndefOr[String | DiagramShapeConnectorStroke] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiagramShapeConnector {
  
  @scala.inline
  def apply(): DiagramShapeConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeConnector]
  }
  
  @scala.inline
  implicit class DiagramShapeConnectorMutableBuilder[Self <: DiagramShapeConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFill(value: String | DiagramShapeConnectorFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramShapeConnectorHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
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
    def setStroke(value: String | DiagramShapeConnectorStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
