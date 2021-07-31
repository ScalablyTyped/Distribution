package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorHover extends StObject {
  
  var fill: js.UndefOr[String | ConnectorHoverFill] = js.undefined
  
  var stroke: js.UndefOr[String | ConnectorHoverStroke] = js.undefined
}
object ConnectorHover {
  
  @scala.inline
  def apply(): ConnectorHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorHover]
  }
  
  @scala.inline
  implicit class ConnectorHoverMutableBuilder[Self <: ConnectorHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | ConnectorHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | ConnectorHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
