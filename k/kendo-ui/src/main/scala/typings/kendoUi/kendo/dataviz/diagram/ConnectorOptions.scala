package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorOptions extends StObject {
  
  var fill: js.UndefOr[String | ConnectorFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[ConnectorHover] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var stroke: js.UndefOr[String | ConnectorStroke] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ConnectorOptions {
  
  inline def apply(): ConnectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectorOptions] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String | ConnectorFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHover(value: ConnectorHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStroke(value: String | ConnectorStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
